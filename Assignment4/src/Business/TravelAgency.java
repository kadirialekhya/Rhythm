/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author alekh
 */
public class TravelAgency {
    private AircraftDirectory aircraftDirectory;
    private CustomerDirectory customerDirectory;
    
  public TravelAgency()
  {
      this.aircraftDirectory = new AircraftDirectory();
      this.customerDirectory = new CustomerDirectory();
  }

    public AircraftDirectory getAirlinerDirectory() {
        return aircraftDirectory;
    }

    public void setAircraftDirectory(AircraftDirectory airlinerDirectory) {
        this.aircraftDirectory = aircraftDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
}
