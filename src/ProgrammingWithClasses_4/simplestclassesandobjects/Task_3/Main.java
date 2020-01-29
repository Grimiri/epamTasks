package ProgrammingWithClasses_4.simplestclassesandobjects.Task_3;

/*
 * 3. Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы,
 * номер группы,
 * успеваемость (массив из пяти элементов).
 *
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов,
 * имеющих оценки, равные только 9 или 10.*/
public class Main {
    public static void main(String[] args) {
        Student[] studentsArray = new Student[10];
        //специфически рандомное заполнение массивов студентов
        //чтобы не писать руками каждое поле и массивы с оценками
        for (int i = 0; i < studentsArray.length; i++) {
            String letter = "";
            if(i % 2 != 0)
                letter = "B";
            else
                letter = "A";
            studentsArray[i] = new Student("Potash"+i,"V D","781061" + letter);
        }

        for (Student student : studentsArray) {
            if (student.areGoodStudent()) {
                System.out.println("Good\t " + student.toString());
            } else {
                System.out.println("Bad\t\t " + student.toString());
            }

        }

    }
}
