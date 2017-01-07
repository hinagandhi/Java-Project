/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.VitalSign.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class Person {

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }
   private String name;

    public String getWorkplace() {
        return Workplace;
    }

    public void setWorkplace(String Workplace) {
        this.Workplace = Workplace;
    }
   private String Workplace;
    public String getName() {
        return name;
    }
   private String personID;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   private String firstName;
   private String lastName;
   private String street;
   private String city;
   private int age;
   private String state;
   private String country;
   private String emergencyContact;

    public String getIsPatient() {
        return isPatient;
    }

    public void setIsPatient(String isPatient) {
        this.isPatient = isPatient;
    }
   private String isPatient;
    public PatientDirectory getPd() {
        return pd;
    }

    public void setPd(PatientDirectory pd) {
        this.pd = pd;
    }
   private PatientDirectory pd;
    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
   private Patient patient;
    public VitalSign getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSign vitalSign) {
        this.vitalSign = vitalSign;
    }
   private VitalSign vitalSign;
   private static int count = 0;

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }

   private ArrayList<VitalSign> vitalSignList;
   public Person()
    {
   // this.name = name;
    count = (int)(Math.random()*10000);
    vitalSignList = new ArrayList<>();
    vitalSign = new VitalSign();
    pd = new PatientDirectory();
    }

    @Override
    public String toString() {
        return this.name; //To change body of generated methods, choose Tools | Templates.
    }
     public Person generateRandomVitalSign(Person person)
   {
    int age = person.getAge();
   int a = calculateRespiratoryRate(age); 
   person.getVitalSign().setRespiratoryrate(a);
   int b = calculateHeartRate(age);
   person.getVitalSign().setHeartrate(b);
   int c = calculateSystolicBP(age);
   person.getVitalSign().setSystolicBP(c);
   int d = calculateTemperature(age);
   person.getVitalSign().setTemperature(d);
   return person;
   }
   private int calculateRespiratoryRate(int age)
   {
   if(age>=1 && age<3)
   {
   int a = 10 + (int)(Math.random() * ((40 - 10) + 1));
   return a;
   }
   else if(age>=1 && age<=5)
   {
   int a = 10 + (int)(Math.random() * ((40 - 10) + 1));
   return a;
   }
   else if(age>5 && age<=13)
   {
   int a = 10 + (int)(Math.random() * ((40 - 10) + 1));
   return a;
   }
   else if(age>13 && age <120)
   {
   int a = 12 + (int)(Math.random() * ((30 - 12) + 1));
   return a;
   }
   else
       return 0;
   }
   private int calculateHeartRate(int age)
   {
   if(age>=1 && age<3)
   {
   int a = 60 + (int)(Math.random() * ((150 - 60) + 1));
   return a;
   }
   else if(age>=3 && age<=5)
   {
   int a = 60 + (int)(Math.random() * ((150 - 60) + 1));
   return a;
   }
   else if(age>5 && age<=13)
   {
   int a = 50 + (int)(Math.random() * ((130 - 50) + 1));
   return a;
   }
   else if(age>13 && age <120)
   {
   int a = 40 + (int)(Math.random() * ((120 - 40) + 1));
   return a;
   }
   else
       return 0;
   }
   private int calculateSystolicBP(int age)
   {
   if(age>=1 && age<3)
   {
   int a = 60 + (int)(Math.random() * ((130 - 60) + 1));
   return a;
   }
   else if(age>=3 && age<=5)
   {
   int a = 60 + (int)(Math.random() * ((130 - 60) + 1));
   return a;
   }
   else if(age>5 && age<=13)
   {
   int a = 60 + (int)(Math.random() * ((130 - 60) + 1));
   return a;
   }
   else if(age>13 && age <120)
   {
   int a = 90 + (int)(Math.random() * ((135 - 90) + 1));
   return a;
   }
   else
       return 0;
   }
   private int calculateTemperature(int age)
   {
   if(age>=1 && age<3)
   {
   int a = 30 + (int)(Math.random() * ((42 - 30) + 1));
   return a;
   }
   else if(age>=1 && age<=5)
   {
   int a = 32  + (int)(Math.random() * ((42 - 32) + 1));
   return a;
   }
   else if(age>5 && age<=13)
   {
   int a = 32 + (int)(Math.random() * ((42 - 32) + 1));
   return a;
   }
   else if(age>13 && age <120)
   {
   int a = 30 + (int)(Math.random() * ((42 - 30) + 1));
   return a;
   }
   else
       return 0;
   }
   public int getAboveHeartRateMarker(int age)
   {

   if(age >=1 && age < 3 )
   {
   return 100;
   }
   else if (age >= 3 && age <=5)
       return 100;
   else if(age> 5 && age <= 13 )
       return 100;
   else
       return 100;
   }
    public int getBelowHeartRateMarker(int age)
   {

   if(age >=1 && age < 3 )
   {
   return 65;
   }
   else if (age >= 3 && age <=5)
       return 65;
   else if(age> 5 && age <= 13 )
       return 60;
   else
       return 60;
   }
     public int getAboveBPMarker(int age)
   {

   if(age >=1 && age < 3 )
   {
   return 110;
   }
   else if (age >= 3 && age <=5)
       return 120;
   else if(age> 5 && age <= 13 )
       return 120;
   else
       return 120;
   }
      public int getBelowBPMarker(int age)
   {

   if(age >=1 && age < 3 )
   {
   return 80;
   }
   else if (age >= 3 && age <=5)
       return 85;
   else if(age> 5 && age <= 13 )
       return 85;
   else
       return 85;
   }
        public int getBelowRespirationRateMarker(int age)
        {
   if(age >=1 && age < 3 )
   {
   return 20;
   }
   else if (age >= 3 && age <=5)
       return 20;
   else if(age> 5 && age <= 13 )
       return 20;
   else
       return 15;
   }  
        public int getAboveRespirationRateMarker(int age)
        {
   if(age >=1 && age < 3 )
   {
   return 30;
   }
   else if (age >= 3 && age <=5)
       return 30;
   else if(age> 5 && age <= 13 )
       return 30;
   else
       return 20;
   }  
           public int getAboveTemperatureRateMarker(int age)
        {
   if(age >=1 && age < 3 )
   {
   return 39;
   }
   else if (age >= 3 && age <=5)
       return 39;
   else if(age> 5 && age <= 13 )
       return 39;
   else
       return 39;
   } 
    public int getBelowTemperatureRateMarker(int age)
        {
   if(age >=1 && age < 3 )
   {
   return 35;
   }
   else if (age >= 3 && age <=5)
       return 35;
   else if(age> 5 && age <= 13 )
       return 35;
   else
       return 35;
   }       
}
