package ProgrammingWithClasses_4.simplestclassesandobjects.Task_8;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Comparator;

public class CustomerAgregator implements Comparator<Customer> {

    private Customer[] customersArray;

    CustomerAgregator(){

    }

    CustomerAgregator(Customer[] customersArray){
        this.customersArray = customersArray;
    }

    public void findByCardNumberRange(int a, int b){
        for (Customer c : customersArray) {
            if(c.getCreditCartNum() >= a && c.getCreditCartNum() <= b){
                System.out.println(c);
            }
        }
    }

    public void sortCustomersByLastNameAlphabet(){
        Arrays.sort(customersArray, new CustomerAgregator());
        for (Customer c : customersArray) {
            System.out.println(c);
        }
    }

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
