public class License {
    public String name;
    public String id;
    public Address address;

    public License(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getLicenseAttributes() {
        String licenseAttr = name + " has the ID " + id + " and lives in " + address.street + ", " + address.city;
        return licenseAttr;
    }
}
