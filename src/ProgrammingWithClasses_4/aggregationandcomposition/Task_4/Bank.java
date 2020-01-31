package ProgrammingWithClasses_4.aggregationandcomposition.Task_4;

import java.util.ArrayList;

public class Bank {

    private String title;
    ArrayList<Client> clientArrayList = new ArrayList<>();
    ArrayList<Account> accountArrayList = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    Bank(String title) {
        this.title = title;
    }

    public void addClient(Client client, Account account) {
        account.addClient(client);
        account.setBalance(0);
        account.setBlocked(false);
        accountArrayList.add(account);
        client.addAccount(account);
        clientArrayList.add(client);

    }

    public void addAccountToClient(Client client, Account account) {
        account.addClient(client);
        account.addToBalance(0);
        account.setBlocked(false);
        accountArrayList.add(account);
        client.addAccount(account);
    }

    public void addMoney(String name, long accountNumber, long sum) {
        for (Client client : clientArrayList) {
            for (Account a : client.getAccountArrayList()) {
                if (client.getName().equals(name) && a.getAccountNumber() == accountNumber) {
                    a.addToBalance(sum);
                }
            }
        }
    }

    public void removeMoney(String name, long accountNumber, long sum) {
        for (Client client : clientArrayList) {
            for (Account a : client.getAccountArrayList()) {
                if (client.getName().equals(name) && a.getAccountNumber() == accountNumber) {
                    a.removeFromBalance(sum);
                }
            }
        }
    }

    public void findAccountsByName(String name){
        for (Account a : accountArrayList) {
            if (a.getClient().getName().equals(name)){
                System.out.println("\naccount by name " + name + " " + a);
            }
        }
    }

    public long getBankAccountsBalance(){
        long balance = 0;
        for (Account a : accountArrayList) {
            balance += a.getBalance();
        }
        return balance;
    }

    public long getSumOfPositiveAccBalance(){
        long balance = 0;
        for (Account a : accountArrayList) {
            if(a.getBalance() > 0){
                balance += a.getBalance();
            }
        }
        return balance;
    }

    public long getSumOfNegativeAccBalance(){
        long balance = 0;
        for (Account a : accountArrayList) {
            if(a.getBalance() < 0){
                balance += a.getBalance();
            }
        }
        return balance;
    }

    public void sortAccounts(){
        accountArrayList.sort(Account::compareTo);
        System.out.println();
        for (Account a : accountArrayList) {
            System.out.println(a);
        }
    }

    public void findBlockedAccounts(){
        System.out.println();
        for (Account a : accountArrayList) {
            if(a.isBlocked()){
                System.out.println("blocked account - " + a);
            }
        }
    }
}
