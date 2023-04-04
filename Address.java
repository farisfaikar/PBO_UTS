public class Address {
    public String street;
    public String city;

    public Address() {
        street = "N/A";
        city = "N/A";
    }

    public Address(String st, String cit) {
        this.street = st;
        this.city = cit;
    }

    // Created methods
    // public String getAddressString() {
    //     String addrsStr = street + ", " + city;
    //     return addrsStr;
    // }
}
