import java.util.ArrayList;

public class Driver extends Person {
    private ArrayList<String> vehicleList;
    private boolean ownsLicense;
    
    public Driver() {
        setName("Driver Name");
        setId("Driver ID");
        ownsLicense = false;
    }
    
    public Driver(String id, String nm) {
        super(id, nm);
    }

    public void registerLicense() {
        ownsLicense = true;
        System.out.println(getName() + " registers their license!");
    }

    // Created methods
    public void addVehicle(String vehicle) {
        if (ownsLicense) {
            vehicleList.add(vehicle);
            System.out.println(getName() + " has added " + vehicle + " to their vehicle list!");
        } else {
            System.out.println(getName() + " requires a license in order to add a vehicle!");
        }
    }

    public ArrayList<String> getVehicleList() {
        return vehicleList;
    }
}
