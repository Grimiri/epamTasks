package ProgrammingWithClasses_4.simplestclassesandobjects.Task_8;

public class Customer {
    private long id;
    private String lastName;
    private String name;
    private String secondName;
    private String address;
    private long creditCartNum;
    private long bankAccountNum;

    public Customer(long id, String lastName, String name, String secondName, String address, long creditCartNum, long bankAccountNum) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.creditCartNum = creditCartNum;
        this.bankAccountNum = bankAccountNum;
    }

    public String getLastName() {
        return lastName;
    }

    public long getCreditCartNum() {
        return creditCartNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", address='" + address + '\'' +
                ", creditCartNum=" + creditCartNum +
                ", bankAccountNum=" + bankAccountNum +
                '}';
    }
}
