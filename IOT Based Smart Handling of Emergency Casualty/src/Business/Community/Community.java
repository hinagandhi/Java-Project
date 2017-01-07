/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Community;

import Business.Area.AreaList;


/**
 *
 * @author test
 */
public class Community{

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
 private String stateName;   

    public AreaList getAreaList() {
        return areaList;
    }

    public void setAreaList(AreaList areaList) {
        this.areaList = areaList;
    }
 private AreaList areaList;
public Community(String stateName)
{
this.stateName = stateName;
areaList = new AreaList();

}
  

    @Override
    public String toString() {
        return stateName; //To change body of generated methods, choose Tools | Templates.
    }
 
}
