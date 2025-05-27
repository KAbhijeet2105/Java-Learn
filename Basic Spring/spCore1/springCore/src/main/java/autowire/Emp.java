package autowire;

public class Emp {

    private Address address; //name sould be same as  bean name

    public Emp() {
    }

    public Emp(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }
}
