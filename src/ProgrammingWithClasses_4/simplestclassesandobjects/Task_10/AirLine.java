package ProgrammingWithClasses_4.simplestclassesandobjects.Task_10;

public class AirLine {
    private String endPoint;
    private int flightNum;
    private String airLineType;
    private String time;
    private String flightDaysOfWeek;

    public String getEndPoint() {
        return endPoint;
    }

    public String getTime() {
        return time;
    }

    public String getFlightDaysOfWeek() {
        return flightDaysOfWeek;
    }

    public AirLine(String endPoint, int flightNum, String airLineType, String time, String flightDaysOfWeek) {
        this.endPoint = endPoint;
        this.flightNum = flightNum;
        this.airLineType = airLineType;
        this.time = time;
        this.flightDaysOfWeek = flightDaysOfWeek;
    }

    @Override
    public String toString() {
        return "AirLine{" +
                "endPoint='" + endPoint + '\'' +
                ", flightNum=" + flightNum +
                ", airLineType='" + airLineType + '\'' +
                ", time='" + time + '\'' +
                ", flightDaysOfWeek='" + flightDaysOfWeek + '\'' +
                '}';
    }
}
