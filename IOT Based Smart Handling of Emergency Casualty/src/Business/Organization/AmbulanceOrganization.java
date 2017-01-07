/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AmbulanceOperatorRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class AmbulanceOrganization extends Organization {
   public AmbulanceOrganization() {
        super(Organization.Type.Ambulance.getValue(),null);
    }
    @Override
     public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AmbulanceOperatorRole());
        return roles;
    }    
    
    
}
