/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Community;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class CommunityList {
    private ArrayList<Community> communityList;

 
    public CommunityList() {
        communityList = new ArrayList<>();
         
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }
    
    public Community createAndAddCommunity(String name){
        Community community = new Community(name);
        //community.setStatename(name);
        communityList.add(community);
        return community;
    }
    
 
}
