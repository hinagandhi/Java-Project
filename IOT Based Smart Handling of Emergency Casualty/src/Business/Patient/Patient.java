/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class Patient extends Person{

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
        private Person person;
        public ArrayList<String> getPatientIDs() {
        return patientIDs;
    }

    public void setPatientIDs(ArrayList<String> patientIDs) {
        this.patientIDs = patientIDs;
    }
   private ArrayList<String> patientIDs;
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }
    String patientID;
     private static int count = 0;
    public Patient()
    {
     patientID = "P"+(int)(Math.random()*10000);
     patientIDs = new ArrayList<>();
    }
}
