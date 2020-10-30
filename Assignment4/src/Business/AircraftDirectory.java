/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Apeksha
 */
public class AircraftDirectory {
    public ArrayList<Aircraft> aircraftList;
    
    public AircraftDirectory()
    {
        this.aircraftList = new ArrayList<Aircraft>();
        Aircraft airliner1 = new Aircraft("Jet Blue", "Canada");
        Aircraft airliner2 = new Aircraft("Air India", "India");
        Aircraft airliner3 = new Aircraft("Delta", "Atlanta");
        aircraftList.add(airliner1);
        aircraftList.add(airliner2);
        aircraftList.add(airliner3);
    } 

    public ArrayList<Aircraft> getAirlinerList() {
        return aircraftList;
    }

    public void setAirlinerList(ArrayList<Aircraft> airlinerList) {
        this.aircraftList = airlinerList;
    }
    
    public Aircraft addAirliner(String airlinerName, String airlinerHeadquaters) {
       Aircraft airliner = new Aircraft(airlinerName, airlinerHeadquaters);
       aircraftList.add(airliner);
       return airliner;
    }
         
    public void deleteAirliner(Aircraft airliner) {
        aircraftList.remove(airliner);
    }
            
    
    public Aircraft searchAirliner(String airlinerName){
        for(Aircraft airliner:aircraftList) {
            if(airliner.getAirlinerName().equalsIgnoreCase(airlinerName)) {
                return airliner;
            }
        }
        return null;
    }
 
    
}
