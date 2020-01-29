package ProgrammingWithClasses_4.simplestclassesandobjects.Task_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomTime {
    private int seconds;
    private int minutes;
    private int hours;

    CustomTime(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    CustomTime() {
        this.seconds = 0;
        this.minutes = 0;
        this.hours = 0;
    }

    public void setSeconds(int seconds) {
        if (seconds <= 60)
            this.seconds = seconds;
        else {
            this.seconds = 0;
            System.out.println("entered wrong time in seconds.. default = 0");
        }
    }

    public void setMinutes(int minutes) {
        if (minutes <= 60)
            this.minutes = minutes;
        else {
            this.minutes = 0;
            System.out.println("entered wrong time in minutes.. default = 0");
        }
    }

    public void setHours(int hours) {
        if (hours <= 24)
            this.hours = hours;
        else {
            this.hours = 0;
            System.out.println("entered wrong time in hours.. default = 0");
        }
    }

    public void addHours(int hours){
        int h = this.hours + hours;
        while (h > 24){
            h -= 24;
        }
        this.hours = h;
    }

    public void addMinutes(int minutes){
        int m = this.minutes + minutes;
        if(m > 59){
            addHours(m / 60);
            this.minutes = m % 60;
        }
        else this.minutes = m;
    }

    public void addSeconds(int seconds){
        int s = this.seconds + seconds;
        if(s > 59){
            addMinutes(s / 60);
            this.seconds = s % 60;
        }
        else this.seconds = s;
    }

    @Override
    public String toString() {
        return "custom time: " + hours + ":" + minutes + ":" + seconds;
    }
}
