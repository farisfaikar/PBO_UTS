public class Police extends Person {
    public Police() {
        setName("Police Name");
        setId("Police ID");
    }

    public Police(String id, String nm) {
        super(id, nm);
    }

    public void approve() {
        System.out.println(getName() + " approves of this license!");
    }
}
