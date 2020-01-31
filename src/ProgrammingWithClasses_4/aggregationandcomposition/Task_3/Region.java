package ProgrammingWithClasses_4.aggregationandcomposition.Task_3;

import java.util.ArrayList;

public class Region {
    private String name;
    private double square;
    private ArrayList<City> cityArrayList;

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public ArrayList<City> getCityArrayList() {
        return cityArrayList;
    }

    Region(String name, ArrayList<City> cityArrayList){
        this.name = name;
        this.square = Math.random() * 100;
        this.cityArrayList = cityArrayList;
    }

}
