package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Person.EcosystemPersonDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public EcosystemPersonDirectory getEcosystemPersonDirectory() {
        return ecosystemPersonDirectory;
    }

    public void setEcosystemPersonDirectory(EcosystemPersonDirectory ecosystemPersonDirectory) {
        this.ecosystemPersonDirectory = ecosystemPersonDirectory;
    }
    private EcosystemPersonDirectory ecosystemPersonDirectory;
    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null,null);
        networkList = new ArrayList<>();
        ecosystemPersonDirectory= new EcosystemPersonDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       /* ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;*/
        return null;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

        for (Network network : networkList) {
        }

        return true;
    }
}