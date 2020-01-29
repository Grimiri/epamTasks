package ProgrammingWithClasses_4.simplestclassesandobjects.Task_4;

public class Train implements Comparable<Train> {
    private String endPointName;
    private Integer trainNumber;
    private String time;

    public Integer getTrainNumber() {
        return trainNumber;
    }

    Train(String endPointName, int trainNumber, String time){
        this.endPointName = endPointName;
        this.trainNumber = trainNumber;
        this.time = time;
    }

    @Override
    public int compareTo(Train o) {
        int res = this.endPointName.compareTo(o.endPointName);
        if(res == 0){
            return this.time.compareTo(o.time);

        }
        return res;
    }

    @Override
    public String toString() {
        return "train end point: " + endPointName + " number: " + trainNumber + " time: " + time;
    }
}
