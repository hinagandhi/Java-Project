/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class EmergencyHealthServicesEnterprise extends Enterprise{

    public EmergencyHealthServicesEnterprise(String name, String location) {
        super(name, EnterpriseType.EHS,location);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
