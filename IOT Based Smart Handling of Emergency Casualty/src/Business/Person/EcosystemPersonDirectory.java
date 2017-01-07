/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Area.Area;
import Business.Community.Community;
import Business.EcoSystem;
import Business.Enterprise.EmergencyHealthServicesEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.WorkQueue.EHSWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author test
 */
public class EcosystemPersonDirectory {

    public ArrayList<Person> getEcosystemPersonList() {
        return ecosystemPersonList;
    }

    public void setEcosystemPersonList(ArrayList<Person> ecosystemPersonList) {
        this.ecosystemPersonList = ecosystemPersonList;
    }
    private ArrayList<Person> personList;
    private ArrayList<Person> ecosystemPersonList;
    public EcosystemPersonDirectory()
    {
    ecosystemPersonList = new ArrayList<>();
   // countryPersonDirectory = new CountryPersonDirectory();
    }
    public Person findRandomPerson()
    {
       personList = new ArrayList<>();
     for(Person person: ecosystemPersonList)
     {  
    if(!person.getIsPatient().equalsIgnoreCase("yes"))
    {
    personList.add(person);
    }
      }  
    Random random = new Random();
    int index = random.nextInt(personList.size());
    return personList.get(index);
    }
}
