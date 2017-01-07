/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Area;

import Business.Community.Community;
import java.util.ArrayList;

/**
 *
 * @author test
 */
public class AreaList {
   private ArrayList<Area> areaList;

    public AreaList() {
        areaList = new ArrayList<>();
    }

    public ArrayList<Area> getAreaList() {
        return areaList;
    }
    
    public Area createAndAddArea(String name){
        Area area = new Area(name);
        //area.setCityName(name);
        areaList.add(area);
        return area;
    }  
}
