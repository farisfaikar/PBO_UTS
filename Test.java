class Test {

  public static void main(String[] args) {
    Driver Adi = new Driver();
    Adi.setId("0123123");
    Adi.setName("Adi Jaya");
    Address alamatAdi = new Address("Jln. Majujaya", "Semarang");
    Adi.addAddress(alamatAdi);
    Driver Susan = new Driver("0123422", "Susan Susanti");
    Address alamatSusan = new Address();
    alamatSusan.street = "Jln. TerusMaju";
    alamatSusan.city = "Jakarta";
    Susan.addAddress(alamatSusan);
    Police Erick = new Police("12123422", "Erick Widjojo");
    Address alamatPol = new Address("Jln. Pantang Menyerah", "Jakarta");
    Erick.addAddress(alamatPol);
    System.out.println("Id: " + Adi.getId() + "\n" + "Nama: " + Adi.getName() + "\n" + "Alamat: " + Adi.getAddress());
    Adi.registerLicense();
    System.out.println("Id: " + Susan.getId() + "\n" + "Nama: " + Susan.getName() + "\n" + "Alamat: " + Susan.getAddress());
    Susan.registerLicense();
    System.out.println("Id: " + Erick.getId() + "\n" + "Nama: " + Erick.getName() + "\n" + "Alamat: " + Erick.getAddress());
    Erick.approve();

    // Created tests
    Adi.addVehicle("Maclaren P1");
    System.out.println(Adi.getVehicleList());
  }
}
