/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Person.Person;
import Business.VitalSign.VitalSign;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author raunak
 */
public class EHSWorkRequest extends WorkRequest{
    
    private String impact;
    private String location;
    private String collisionWith;
    private String hos_status;
    public ArrayList<String> getInjuriesList() {
        return injuriesList;
    }

    public void setInjuriesList(ArrayList<String> injuriesList) {
        this.injuriesList = injuriesList;
    }

   
    private ArrayList<String> injuriesList;

    public ArrayList<String> getPath_hospital() {
        return path_hospital;
    }

    public void setPath_hospital(ArrayList<String> path_hospital) {
        this.path_hospital = path_hospital;
    }
    private ArrayList<String> path_hospital;
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    private Person person;
    public EHSWorkRequest()
    {
    path = new ArrayList<>();
    injuriesList = new ArrayList<>();
    path_hospital = new ArrayList<>();
    }
    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    private double longitude;
    private double latitude;
    public String getImpact() {
        return impact;
    }

    public ArrayList<String> getPath() {
        return path;
    }

    public void setPath(ArrayList<String> path) {
        this.path = path;
    }
    private ArrayList<String> path;
    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollisionWith() {
        return collisionWith;
    }

    public void setCollisionWith(String collisionWith) {
        this.collisionWith = collisionWith;
    }
   public double calculateRandomLatitude(){
    double minLat = -90.00;
    double maxLat = 90.00;
    latitude = minLat + (double)(Math.random() * ((maxLat - minLat) + 1));
    return latitude;
      }
    public double calculateRandomLongitude()
    {
     double minLon = 0.00;
    double maxLon = 180.00;     
    longitude = minLon + (double)(Math.random() * ((maxLon - minLon) + 1));
    return longitude;
    }
    public int calculateDistance(double lat1, double lon1, double lat2, double lon2)
    {
    double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
                if((int)(dist/1000) == 0.0)
                {
                return 1;
                }
                else
                {
		return (int)(dist)/1000;
                }
                
    }
    private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
}
