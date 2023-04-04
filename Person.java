public class Person {
    private String id;
    private String name;
    private Address addrs;
    // private License license;

    public Person() {
        id = "N/A";
        name = "John Doe";
    }

    public Person(String id, String nm) {
        this.id = id;
        this.name = nm;
    }

    public void addAddress(Address address) {
        this.addrs = address;
    }

    public String getAddress() {
        String addrsStr = addrs.street + ", " + addrs.city;
        return addrsStr;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Created methods
    // public void setLicense(License license) {
    //     this.license = license;
    // }

    // public License getLicense() {
    //     return license;
    // }
}
