/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Area.Area;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AmbulanceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AmbulanceOperatorRole.AmbulanceOperatorWorkAreaJPanel;

/**
 *
 * @author test
 */
public class AmbulanceOperatorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Area area, Enterprise enterprise, EcoSystem business) {
        return new AmbulanceOperatorWorkAreaJPanel(userProcessContainer,account, (AmbulanceOrganization)organization,area,business); //To change body of generated methods, choose Tools | Templates.
    }
    
}
