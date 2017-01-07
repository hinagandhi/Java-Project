/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.EmployeeDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author hina
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private String name;
    private String EnterpriseLocation;
    private double enterpriseLatitude;
    private double enterpriseLongitude;
   
    
    public Enterprise(String name, EnterpriseType type, String location) {
        super(name, location);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        EHS("Emergency Health Services");
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public String getEnterpriseLocation() {
        return EnterpriseLocation;
    }
     public double getEnterpriseLatitude() {
        return enterpriseLatitude;
    }

    public void setEnterpriseLatitude(double enterpriseLatitude) {
        this.enterpriseLatitude = enterpriseLatitude;
    }

    public double getEnterpriseLongitude() {
        return enterpriseLongitude;
    }

    public void setEnterpriseLongitude(double enterpriseLongitude) {
        this.enterpriseLongitude = enterpriseLongitude;
    }
    public void setEnterpriseLocation(String EnterpriseLocation) {
        this.EnterpriseLocation = EnterpriseLocation;
    }
    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
      public double calculateRandomLatitude(){
    double minLat = -90.00;
    double maxLat = 90.00;
    enterpriseLatitude = minLat + (double)(Math.random() * ((maxLat - minLat) + 1));
    return enterpriseLatitude;
      }
    public double calculateRandomLongitude()
    {
     double minLon = 0.00;
    double maxLon = 180.00;     
    enterpriseLongitude = minLon + (double)(Math.random() * ((maxLon - minLon) + 1));
    return enterpriseLongitude;
    } 
    public int calculateDistance(double lat1, double lon1, double lat2, double lon2)
    {
    double theta = lon1 - lon2;
		double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
		dist = Math.acos(dist);
		dist = rad2deg(dist);
		dist = dist * 60 * 1.1515;
		return (int)(dist)/1000;
    }
    private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}
         

}