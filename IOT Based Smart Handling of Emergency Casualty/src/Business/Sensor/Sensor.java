/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Sensor;

import Business.Area.Area;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.Role.EHSAdminRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.EHSAdmin;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EHSWorkRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author test
 */
public class Sensor {
    private Area area;
    private EHSWorkRequest ehsWorkRequest;
    private UserAccount userAccount;
    private Enterprise enterprise;
    String[] location = {"17 Red Bluff Area", "22 grass Valley","Highway 29","Nh 17","Bus Bay area","76 Parliament Road","MG Road","Hackney Street","The City Mall","The City Mall Road","17 International Airport Road","56 Main Avenue","72 Park Road","101 Martyr's Road","Eastin Grand Road","Westin Grand Road","Central Oriental Road","South ex road","89 Summer Hill Road","Mainland Area","Old City Road"};
    String[] impact ={"low", "high","medium"};
    String[] collisionWith = {"Person", "A fixed object","A car","A truck","A bus"};
    String[] message = {"Accident alert", "Emergency alert"};
    String[] path = {"Head Northeast on Central point","Continue Straight","Slight right onto Central Street","Head Southeast on Tower Line","Slight Left onto ABC street","Turn right on Commonwealth Avenue","Turn left on HillSide","Go Straight","Turn Left onto CMP Check Post","Turn Right onto NH22","Turn left via 103","go straight to 798 zone","take A2311 To M20","continue on channel tunnel"};
    String[] path_Hospital = {"Follow Main-13 N","Continue on DE-1","Take Congress Street","Take Arctic Ave","Slight right on 78 highway road","Take north to ABC Street","Take slight left","Take slight right","Go straight to checkPost","go Straight to toll booth","Take left onto NH22","Continue on channel tunnel","Take I-5 S","Take exit 41 A from I-15N","Go Straight on Airport Road","Take a left on MainLand street"};
    // double[] longi = { -96.80322,-98.53506,-97.037852,-95.04567,-99.5678,-95.9860,-77.037852,-77.043934};
    // double[] lat = {32.9697,29.46786,38.898556,38.897147,36.5678,33.6789,35.5678,39.5678};
  
    public Sensor(UserAccount userAccount,Enterprise enterprise)
    {
    this.area= area;
    ehsWorkRequest = new EHSWorkRequest();
    this.userAccount = userAccount;
    this.enterprise = enterprise;
    }
    
    public void run() {
        Date date = new Date();
        Random random = new Random();
        int select = random.nextInt(location.length); 
        ehsWorkRequest.setLocation(location[select]);
        Random random1 = new Random();
        int select1 = random1.nextInt(impact.length);
        ehsWorkRequest.setImpact(impact[select1]);
        Random random2 = new Random();
        int select2 = random2.nextInt(collisionWith.length);
        ehsWorkRequest.setCollisionWith(collisionWith[select2]);
        Random random3 = new Random();
        int select3 = random3.nextInt(message.length);
        ehsWorkRequest.setMessage(message[select3]);
        ehsWorkRequest.setRequestDate(date);
        ehsWorkRequest.setStatus("Non Processed");
        userAccount.getWorkQueue().getWorkRequestList().add(ehsWorkRequest);
        double latitude = ehsWorkRequest.calculateRandomLatitude();
        double longitude = ehsWorkRequest.calculateRandomLongitude();
        ehsWorkRequest.setLatitude(latitude);
        ehsWorkRequest.setLongitude(longitude);
        
        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList())
        {
        if(organization instanceof AmbulanceOrganization)
        {
        organization.getWorkQueue().getWorkRequestList().add(ehsWorkRequest);
        }
        }
        
}
    public void findRoute()
    {
     /*   if(!ehsWorkRequest.getPath().isEmpty())
        {
    for(int i =0;i<ehsWorkRequest.getPath().size();i++)
        {
        ehsWorkRequest.getPath().remove(i);
        }
        }*/
       ehsWorkRequest.getPath().add("From your location go");
        for(int j= 1;j<5;j++)
        {
        Random random4 = new Random();
        int select4 = random4.nextInt(path.length);
        ehsWorkRequest.getPath().add(path[select4]);
        }
        ehsWorkRequest.getPath().add(ehsWorkRequest.getLocation()+" (destination arrived)");
        }
    public void findHosRoute()
    {
    ehsWorkRequest.getPath_hospital().add("From your location go");
        for(int j= 1;j<5;j++)
        {
        Random random5 = new Random();
        int select5 = random5.nextInt(path_Hospital.length);
        ehsWorkRequest.getPath_hospital().add(path_Hospital[select5]);
        }
        ehsWorkRequest.getPath_hospital().add("destination arrived");
    
    }
    }
