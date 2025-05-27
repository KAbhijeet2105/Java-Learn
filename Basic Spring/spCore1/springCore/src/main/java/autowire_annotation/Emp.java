package autowire_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

   @Autowired //on property
   @Qualifier("address")  // specify the bean. there might be multiple beans hence this used.
    private Address address;

    public Emp() {
    }

    @Autowired //on constructor
    public Emp(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Autowired   //on setter mehtod
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

/*
* we can use @Autowired annotation on 1.directly on property 2. on setter methods 3. on constructor
*
*
*
*
*
* */