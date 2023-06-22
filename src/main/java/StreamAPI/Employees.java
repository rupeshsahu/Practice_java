package StreamAPI;

import java.util.Date;

public class Employees {

    String name;
    String address;
    int eid;
    Date dob;


    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", eid=" + eid +
                ", dob=" + dob +
                '}';
    }

    public Employees(String name, String address, int eid, Date dob) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.eid = eid;
    }
}
