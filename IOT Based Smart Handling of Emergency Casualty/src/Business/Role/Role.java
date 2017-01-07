/*
 * To change this template, choose Tools | Templates
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

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        AreaAdmin("Area Admin"),
        EHSAdmin("EHS Admin"),
        Receptionist("Receptionist"),
        OnlinePatient("Online Patient")
        ;
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            Area area,
            Enterprise enterprise, 
            EcoSystem business);
   /* public abstract JPanel createEHSWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization,
            Area area,
            Enterprise enterprise, 
            EcoSystem business);*/

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}