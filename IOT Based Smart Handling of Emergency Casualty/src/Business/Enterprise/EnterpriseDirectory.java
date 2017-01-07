/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   private String location;
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String location){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name, location);
          double latitude = enterprise.calculateRandomLatitude();
          enterprise.setEnterpriseLatitude(latitude);
          double longitude = enterprise.calculateRandomLongitude();
          enterprise.setEnterpriseLongitude(longitude);
            enterpriseList.add(enterprise);
        }
        if(type == Enterprise.EnterpriseType.EHS)
        {
        enterprise = new EmergencyHealthServicesEnterprise(name,location);
        enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
