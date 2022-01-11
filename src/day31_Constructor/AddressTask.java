package day31_Constructor;

public class AddressTask {
    public String buildingNumber,street,city,state;
    public int zipcode;

    public AddressTask(String buildingNumber, String street, String city, String state, int zipcode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String toString() {
        return buildingNumber+ " " + street +"\n"+ city+ " "+ state +","+ " "+zipcode;


    }
}
