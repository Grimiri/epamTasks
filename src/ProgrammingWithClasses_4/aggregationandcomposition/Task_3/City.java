package ProgrammingWithClasses_4.aggregationandcomposition.Task_3;

import java.util.ArrayList;

public class City {
    private String name;
    private boolean oblCity;
    private ArrayList<Area> areaLinkedList;
    private boolean isCapital = false;

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public String getName() {
        return name;
    }

    public boolean isOblCity() {
        return oblCity;
    }

    public ArrayList<Area> getAreaLinkedList() {
        return areaLinkedList;
    }

    City(String name, boolean oblCity, ArrayList<Area> areas){
        this.name = name;
        this.oblCity = oblCity;
        this.areaLinkedList = areas;
    }


}
