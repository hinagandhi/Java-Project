/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;
import Business.Organization.*;
import javax.swing.JOptionPane;
/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Ambulance.getValue())){
            organization = new AmbulanceOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.Receptionist.getValue()))
        {
        organization = new ReceptionistOrganization();
        organizationList.add(organization);
        }
        return organization;
    }
}