package ProgrammingWithClasses_4.aggregationandcomposition.Task_4;

import java.util.ArrayList;

public class Client {

    private String name;
    private ArrayList<Account> accountArrayList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccountArrayList() {
        return accountArrayList;
    }

    Client(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accountArrayList.add(account);
    }
}
