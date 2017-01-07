/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Community.CommunityList;


/**
 *
 * @author raunak
 */
public class Network {
    
    private String name;
    private CommunityList communityList;

    public CommunityList getCommunityList() {
        return communityList;
    }

    public Network() {
       communityList  = new CommunityList();
    //   countryPersonDirectory = new CountryPersonDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
    
}
