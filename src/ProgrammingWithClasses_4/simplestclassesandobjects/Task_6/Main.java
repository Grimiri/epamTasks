package ProgrammingWithClasses_4.simplestclassesandobjects.Task_6;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 6. Составьте описание класса для представления времени.
 * Предусмотрте возможности установки времени и изменения
 * его отдельных полей (час, минута, секунда) с проверкой
 * допустимости вводимых значений.
 *
 * В случае недопустимых значений полей поле устанавливается
 * в значение 0. Создать методы изменения времени на заданное
 * количество часов, минут и секунд.
 * */
public class Main {
    public static void main(String[] args) {
        int hours = 15;
        int minutes = 23;
        int seconds = 55;

        int badHours = 34;
        int badMinutes = 61;
        int badSeconds = 3412;

        System.out.println("get default custom time..");
        CustomTime customTime = new CustomTime();
        System.out.println(customTime.toString());

        System.out.println("\ntrying to get WRONG custom time: "+badHours+":"+badMinutes+":"+badSeconds);
        CustomTime customTime0 = new CustomTime(badHours, badMinutes, badSeconds);
        System.out.println(customTime0.toString());

        System.out.println("\ntrying to get RIGHT custom time: "+hours+":"+minutes+":"+seconds);
        CustomTime customTime1 = new CustomTime(hours, minutes, seconds);
        System.out.println(customTime1.toString());

        System.out.println("\nadd 10 HOURS ours to custom time..");
        customTime1.addHours(10);
        System.out.println(customTime1.toString());

        System.out.println("\nadd 51 MINUTES to custom time..");
        customTime1.addMinutes(51);
        System.out.println(customTime1.toString());

        System.out.println("\nadd 121 SECONDS to custom time..");
        customTime1.addSeconds(121);
        System.out.println(customTime1.toString());



    }
}
