/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Area.Area;
import Business.Community.Community;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.AreaAdminWorkArea.AreaAdminWorkAreaJPanel;

/**
 *
 * @author test
 */
public class AreaAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,Area area, Enterprise enterprise, EcoSystem business) {
        return new AreaAdminWorkAreaJPanel(userProcessContainer, area,business);
    }

//    @Override
 //   public JPanel createEHSWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Area area, Enterprise enterprise, EcoSystem business) {
     //   return null; //To change body of generated methods, choose Tools | Templates.
   // }
    
}
