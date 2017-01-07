/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;
import Business.Area.Area;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import userinterface.Enterprise.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.Enterprise.EHSAdminWorkAreaJPanel;
/**
 *
 * @author user
 */
public class HospitalAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Area area, Enterprise enterprise, EcoSystem business) {
       //if(enterprise.equals("EmergencyHealthServices")
        return new AdminWorkAreaJPanel(userProcessContainer,enterprise,area,business); //To change body of generated methods, choose Tools | Templates.
    }

  //  @Override
  /*  public JPanel createEHSWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Area area, Enterprise enterprise, EcoSystem business) {
        return new EHSAdminWorkAreaJPanel(userProcessContainer,enterprise,area); //To change body of generated methods, choose Tools | Templates.
    }*/
  
}
