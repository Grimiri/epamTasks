package ProgrammingWithClasses_4.simplestclassesandobjects.Task_1;

/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных,
 * и метод, который находит наибольшее значение из этих двух переменных.
 * */

public class Task_1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1(2, 3);
        System.out.println("\nanswer:" + test1.toString() + "; sum="
                + test1.findSum() + "; max=" + test1.findMax() + ".");
    }
}
