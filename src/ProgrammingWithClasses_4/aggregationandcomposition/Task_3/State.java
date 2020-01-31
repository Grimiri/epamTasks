package ProgrammingWithClasses_4.aggregationandcomposition.Task_3;

import java.util.ArrayList;

public class State {
    private String name;
    private ArrayList<Region> regionArrayList;
    private double square;

    State(String name, ArrayList<Region> regionArrayList) {
        this.name = name;
        this.regionArrayList = regionArrayList;
        setsquare();
    }

    private void setsquare() {
        for (Region r : regionArrayList) {
            this.square += r.getSquare();
        }
    }

    public int findCountOfRegions(){
        return regionArrayList.size();
    }

    public double findSquare(){
        return square;
    }
    //знаю что так как в этом методе делать нельзя (:
    public void findOblCount(){
        int counter = 0;
        for (Region r : regionArrayList) {
            for (City c : r.getCityArrayList()) {
                if(c.isOblCity()){
                    System.out.println("obl city  - " + c.getName());
                    counter++;
                }
            }
        }
        System.out.println("count of obl-city - " + counter);
    }

    public String findCapital(){
        String capital = "";
        for (Region r : regionArrayList) {
            for (City c : r.getCityArrayList()) {
                if(c.isCapital()){
                    capital = c.getName();
                }
            }
        }
        return capital;
    }
}
