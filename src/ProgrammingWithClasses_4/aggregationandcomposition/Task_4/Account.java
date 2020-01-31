package ProgrammingWithClasses_4.aggregationandcomposition.Task_4;

public class Account implements Comparable<Account> {

    private String type;
    private Long accountNumber;
    private long balance;
    private boolean isBlocked;
    private Client client;

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public boolean isBlocked() {
        if (balance < 0)
            this.isBlocked = true;
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    Account(String type, long accountNumber) {
        this.type = type;
        this.accountNumber = accountNumber;
    }

    public void addClient(Client client) {
        this.client = client;
    }

    public void addToBalance(long sum) {
        this.balance += sum;
    }

    public void removeFromBalance(long sum) {
        this.balance -= sum;
    }

    @Override
    public String toString() {
        return "Account: " +
                "type='" + type + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                ", client=" + client.getName() +
                '}';
    }

    @Override
    public int compareTo(Account o) {
        int rez = this.type.compareTo(o.type);
        if (rez == 0) {
            return this.accountNumber.compareTo(o.accountNumber);
        }
        return rez;
    }
}
