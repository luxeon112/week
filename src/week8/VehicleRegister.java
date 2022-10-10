package week8;

import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if(!this.owners.containsKey(plate)){
            this.owners.put(plate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(RegistrationPlate plate){
        if(this.owners.containsKey(plate)){
            return this.owners.get(plate);
        } else {
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate){
        if(this.owners.containsKey(plate)){
            this.owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }

    public HashMap<RegistrationPlate, String> getOwners() {
        return owners;
    }
}