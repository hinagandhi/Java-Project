package com.hina.myapp.dao;

import com.hina.myapp.pojo.Batch;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.Students;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
@Component
public class batchDAO extends DAO {
	public batchDAO() {

	}
	
	public Long getBatchId(Faculty faculty, String subjectName) { 
		  Long result=0l;
		  try {
				begin();
				result = (Long) getSession().createCriteria(Batch.class)
					    .add(Restrictions.eq("faculty",faculty))
					    .add(Restrictions.eq("subjectName", subjectName))
					    .setProjection(Projections.rowCount()).uniqueResult();
				commit();
				return result;
			} catch (HibernateException e) {
				rollback();
			}
			return result;
			}
	 public Batch getBatchDetails(Faculty faculty, String subjectName)
	 {
		 Batch batch = null;
	try{
		begin();
		Query q = getSession().createQuery("FROM Batch WHERE faculty=:faculty AND subjectName=:subjectName");
		q.setParameter("faculty", faculty);
		q.setParameter("subjectName",subjectName);
		batch = (Batch) q.uniqueResult();
	} catch(HibernateException e)
	{
		rollback();
	}
	return batch;
	 }
	public Batch create(String name,Faculty f,Set<Students> stud, Set<Batch> batches) {
		
		Batch batch = new Batch();
	    Students students = new Students();
		try {
			begin();
			batch.setFaculty(f);
			batch.setSubjectName(name);
			batch.setStudents(stud);
			students.setBatch(batches);
			getSession().save(batch);
            getSession().save(students);
			commit();
			return batch;
		} catch (HibernateException e) {
			rollback();

		}
		return batch;
	}
		public void update(int batchId, Set<Students> students) {
			
			
			try {
				begin();
				Query q = getSession().createQuery("Update Batch SET students =:students WHERE batchId =:batchId");
				commit();
			
			} catch (HibernateException e) {
				rollback();

			}
		
	}
		public List<Batch> getBatchesOfStudent(int studentId)
		{
			List<Batch> studs=null;
			try{
			begin();
			Query q = getSession().createQuery(" FROM Batch a " +
                "join a.students t " +
                "where t.studentId =:studentId" );
			q.setParameter("studentId", studentId);
			 studs = q.list();
			commit();
			return studs;
		}catch(HibernateException e)
		{
			rollback();
		}
		return studs;
		}
		public List<Batch> getBatchDetails(Faculty faculty)
		{
			List<Batch> batches = null;
			try{
				begin();
				Query q = getSession().createQuery("FROM Batch a " +
                "join a.students t " +
                "where a.faculty =:faculty group by a.batchId");	
				q.setParameter("faculty", faculty);
				batches = q.list();
				commit();
				return batches;
			}catch(HibernateException e)
			{
				rollback();
			}
			return batches;
		}
		public List<Batch> getBatchSize(Faculty faculty, int batchId)
		{
			List<Batch> batches = null;
			try{
				begin();
				Query q = getSession().createQuery("FROM Batch a " +
                "join a.students t " +
                "where a.faculty =:faculty and a.batchId=:batchId order by a.batchId");	
				q.setParameter("faculty", faculty);
				q.setParameter("batchId",batchId);
				batches = q.list();
				commit();
				return batches;
			}catch(HibernateException e)
			{
				rollback();
			}
			return batches;
			
		}
		public int deleteBatch(int batchId)
		{int batch=0;
			try{
				begin();
				Query q = getSession().createQuery("Update Batch set batchId = null where batchId=:batchId");	
				q.setParameter("batchId", batchId);
				batch = q.executeUpdate();
				commit();
				return batch;
			}catch(HibernateException e)
			{
				rollback();
			}
			return batch;
		}
		public List<Batch> getdetails()
		{
			List<Batch> batches = getSession().createCriteria(Batch.class).list();
			return batches;
		}
			
} 
     

