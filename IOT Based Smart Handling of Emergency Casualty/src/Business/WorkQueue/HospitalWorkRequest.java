/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class HospitalWorkRequest extends WorkRequest {
  public ArrayList<String> getInjuriesList() {
        return injuriesList;
    }

    public void setInjuriesList(ArrayList<String> injuriesList) {
        this.injuriesList = injuriesList;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    private String patientType;
    private ArrayList<String> injuriesList;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    private Patient patient;
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
  private Person person;  
}
