package ProgrammingWithClasses_4.simplestclassesandobjects.Task_8;

/*
 * 8. Создать класс Customer, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 *
 * Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 *
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 * */

public class Main {
    public static void main(String[] args) {
        Customer[] customersArray = new Customer[5];
        customersArray[0] = new Customer(1, "Potash", "Vladislav", "Dmitrievich", "home street 10", 10, 110);
        customersArray[1] = new Customer(2, "Baranova", "Alexanrdia", "Alexandrovna", "home street 10", 11, 111);
        customersArray[2] = new Customer(3, "Demin", "Antony", "Petrovich", "mars street 15", 12, 112);
        customersArray[3] = new Customer(4, "Setko", "Dmitri", "Dmitrievich", "merkuri street 20", 13, 113);
        customersArray[4] = new Customer(5, "Sorochinski", "Tolik", "Tolikovich", "home street 11", 14, 114);

        CustomerAgregator customerAgregator = new CustomerAgregator(customersArray);

        System.out.println("\nout customers with card numbers 12-13:\n");
        customerAgregator.findByCardNumberRange(12,13);

        System.out.println("\nout customers sorted by alphabet:\n");
        customerAgregator.sortCustomersByLastNameAlphabet();


    }
}
