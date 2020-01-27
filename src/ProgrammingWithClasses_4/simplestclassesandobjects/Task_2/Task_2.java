package ProgrammingWithClasses_4.simplestclassesandobjects.Task_2;

/*
 * 2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 * */

public class Task_2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2(3, 3);
        Test2 test21 = new Test2();

        System.out.println("entered params: " + test2);
        System.out.println("default params: " + test21);
    }
}
