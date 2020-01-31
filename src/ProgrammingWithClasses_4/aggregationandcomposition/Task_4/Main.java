package ProgrammingWithClasses_4.aggregationandcomposition.Task_4;

import java.util.ArrayList;

/*
 * 4. Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный
 * и отрицательный балансы отдельно.
 * */
public class Main {
    public static void main(String[] args) {

        //Создаём банк, клиентов
        Bank bank = new Bank("BlablaBank");

        Client client = new Client("Vlad");

        Client client1 = new Client("Alexandria");

        Client client2 = new Client("Dragon");

        //добавляем клиентов в банк, создаём и добавляем им счета, добавляем и забираем деньги со счёта, блокируем счёт
        bank.addClient(client, new Account("light", 4312));
        bank.addMoney("Vlad", 4312, 30);

        bank.addClient(client1, new Account("premium", 3333));
        bank.addAccountToClient(client1, new Account("hard", 8888));
        bank.addMoney("Alexandria", 3333, 30);
        bank.addMoney("Alexandria", 8888, 50);

        bank.addClient(client2, new Account("hard", 6666));
        bank.removeMoney("Dragon", 6666, 50);

        //выводим результаты
        bank.findAccountsByName("Alexandria");

        System.out.println("\nbank balance - " + bank.getBankAccountsBalance());

        System.out.println("\nsum form all account with positive balance - " + bank.getSumOfPositiveAccBalance());

        System.out.println("\nsum form all account with negative balance - " + bank.getSumOfNegativeAccBalance());
        //сортировка реализована по типу, а затем номеру аккаунта
        bank.sortAccounts();

        bank.findBlockedAccounts();
    }
}
