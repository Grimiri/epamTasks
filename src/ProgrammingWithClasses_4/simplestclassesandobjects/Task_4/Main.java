package ProgrammingWithClasses_4.simplestclassesandobjects.Task_4;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 4. Создайте класс Train, содержащий поля:
 * название пункта назначения,
 * номер поезда,
 * время отправления.
 *
 * Создайте данные в массив из пяти элементов типа Train,
 * добавьте возможность сортировки элементов массива по номерам поездов.
 *
 * Добавьте возможность вывода информации о поезде,
 * номер которого введен пользователем.
 *
 * Добавьте возможность сортировки массив по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения
 * должны быть упорядочены по времени отправления.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train[] trainsArray = new Train[5];
        createTrainsArrayAndOut(trainsArray);

        outInstructions();

        while (true) {
            int n = scanner.nextInt();
            switch (n) {
                case (0): {
                    System.out.println("\nsorted by train number:\n");
                    for (Train tr : sortByTrainNumber(trainsArray)) {
                        System.out.println(tr.toString());
                    }
                    break;
                }
                case (1):{
                    System.out.println("enter train number..");
                    int num = scanner.nextInt();
                    for (Train tr: trainsArray) {
                        if(tr.getTrainNumber() == num )
                            System.out.println(tr.toString());
                    }
                    break;
                }
                case (2): {
                    System.out.println("\nsorted by end point and time:\n");
                    Arrays.sort(trainsArray);//имплеминтировал интерфейс Comparable и переопределил compareTo в Train
                    for (Train tr : trainsArray) {
                        System.out.println(tr.toString());
                    }
                    break;
                }
            }
            outInstructions();
        }
    }
    public static void outInstructions(){
        System.out.println("\npress: 0 - to sort trains by train numbers..\n" +
                "press: 1 - to get information by entering train number..\n" +
                "press: 2 - to sort trains by end point and time..");
    }

    public static void createTrainsArrayAndOut(Train[] trainsArray) {
        trainsArray[0] = new Train("A", 3, "16:00");
        trainsArray[1] = new Train("B", 5, "18:31");
        trainsArray[2] = new Train("B", 1, "18:30");
        trainsArray[3] = new Train("A", 4, "10:00");
        trainsArray[4] = new Train("B", 2, "17:00");
        System.out.println("\narray of trains:\n");
        for (Train tr : trainsArray) {
            System.out.println(tr.toString());
        }
    }

    public static Train[] sortByTrainNumber(Train[] trainsArray) {
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < trainsArray.length - 1; i++) {
                if (trainsArray[i].getTrainNumber() > trainsArray[i + 1].getTrainNumber()) {
                    flag = false;
                    Train temp = trainsArray[i];
                    trainsArray[i] = trainsArray[i + 1];
                    trainsArray[i + 1] = temp;
                }
            }
        }
        return trainsArray;
    }
}
