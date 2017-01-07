/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class HospitalEnterprise extends Enterprise{

    
private PatientDirectory patientDirectory;
    public HospitalEnterprise(String name, String location) {
        super(name, EnterpriseType.Hospital,location);
        patientDirectory = new PatientDirectory();
    }
public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
