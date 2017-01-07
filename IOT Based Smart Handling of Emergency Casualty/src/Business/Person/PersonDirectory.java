/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Community.Community;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Network.Network;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author test
 */
public class PersonDirectory {

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
 private ArrayList<Person> personList;

    public PersonDirectory() {
       personList = new ArrayList<>();
    }

    
    public Person createPerson(String name,Community community,Network network,EcoSystem system){
        Person person = new Person();
        person.setName(name);
        person.setIsPatient("No");
        personList.add(person);
      // community.getStatePersonDirectory().getStatePersonList().add(person);
     //   network.getCountryPersonDirectory().getCountryPersonList().add(person);
        system.getEcosystemPersonDirectory().getEcosystemPersonList().add(person);
        return person;
    }
    
}
