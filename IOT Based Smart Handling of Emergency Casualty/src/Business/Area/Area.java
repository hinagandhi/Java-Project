/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Area;

import Business.Enterprise.EnterpriseDirectory;
import Business.Organization.Organization;
import Business.Person.PersonDirectory;
import Business.Role.AreaAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class Area extends Organization {

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
  private EnterpriseDirectory enterpriseDirectory;
  private PersonDirectory personDirectory;
     public Area(String cityName)
     {
     super(cityName,null);
     enterpriseDirectory = new EnterpriseDirectory();
     personDirectory = new PersonDirectory();
     }

    @Override
    public ArrayList<Role> getSupportedRole() {
    return null;
    }

    
    }
