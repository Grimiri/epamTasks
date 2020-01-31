package ProgrammingWithClasses_4.simplestclassesandobjects.Task_10;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 * */

public class Main {
    public static void main(String[] args) {
        AirLine[] airLinesArray = new AirLine[5];

        airLinesArray[0] = new AirLine("C", 1, "Q1", "13:00", "mo tu we th fr sa su");
        airLinesArray[1] = new AirLine("B", 2, "Q2", "14:50", "mo we th sa su");
        airLinesArray[2] = new AirLine("C", 3, "Z1", "18:15", "tu fr sa su");
        airLinesArray[3] = new AirLine("A", 4, "K2", "9:10", "mo su");
        airLinesArray[4] = new AirLine("A", 5, "Q1", "10:25", "tu fr sa");

        AirLineAgregator airLineAgregator = new AirLineAgregator(airLinesArray);

        System.out.println("\nfor entered end point: ");
        airLineAgregator.outAirLinesByEndPoint("C");

        System.out.println("\nfor entered day of week: ");
        airLineAgregator.outAirLinesByDayOfWeek("fr");

        System.out.println("\nfor entered day and time after: ");
        airLineAgregator.outAirLinesByDayAndAfterTime("fr", "12:25");
    }
}
