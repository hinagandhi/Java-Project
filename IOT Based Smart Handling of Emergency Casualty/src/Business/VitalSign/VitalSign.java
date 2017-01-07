/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

import Business.Person.Person;

/**
 *
 * @author test
 */
public class VitalSign {
   private int respiratoryrate;
   private int heartrate;
   private double systolicBP; 
   private double temperature;

    public int getRespiratoryrate() {
        return respiratoryrate;
    }

    public void setRespiratoryrate(int respiratoryrate) {
        this.respiratoryrate = respiratoryrate;
    }

    public int getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(int heartrate) {
        this.heartrate = heartrate;
    }

    public double getSystolicBP() {
        return systolicBP;
    }

    public void setSystolicBP(double systolicBP) {
        this.systolicBP = systolicBP;
    }
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
  
}
