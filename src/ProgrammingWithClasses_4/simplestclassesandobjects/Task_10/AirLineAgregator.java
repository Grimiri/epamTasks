package ProgrammingWithClasses_4.simplestclassesandobjects.Task_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AirLineAgregator {
    AirLine[] airLinesArray;

    AirLineAgregator(AirLine[] airLinesArray) {
        this.airLinesArray = airLinesArray;
    }

    public void outAirLinesByEndPoint(String endPoint) {
        for (AirLine a : airLinesArray) {
            if (a.getEndPoint().equals(endPoint))
                System.out.println(a);
        }
    }

    public void outAirLinesByDayOfWeek(String day) {
        Pattern pattern = Pattern.compile(day);
        for (AirLine a : airLinesArray) {
            Matcher matcher = pattern.matcher(a.getFlightDaysOfWeek());
            if (matcher.find()) {
                System.out.println(a);
            }
        }
    }

    public void outAirLinesByDayAndAfterTime(String day, String time) {
        Pattern pattern = Pattern.compile(day);
        for (AirLine a : airLinesArray) {
            Matcher matcher = pattern.matcher(a.getFlightDaysOfWeek());
            if (matcher.find() && a.getTime().compareTo(time) > 0) {
                System.out.println(a);
            }
        }
    }
}
