package ProgrammingWithClasses_4.aggregationandcomposition.Task_2;

import java.util.SplittableRandom;

public class Auto {
    private String mark;
    private Wheel[] wheelsArray;
    private Engine engine = new Engine();

    public void setMark(String mark){
        this.mark = mark;
    }

    public void setEngineType(String type){
        engine.setType(type);
    }

    public void setEngineNumber(int number){
        engine.setNumber(number);
    }

    public void setWheels(String type, int radius, int count){
        wheelsArray = new Wheel[count];
        for (int i = 0; i < wheelsArray.length; i++) {
            wheelsArray[i] = new Wheel(type, radius);
        }
    }

    public void drive(){
        engine.startEngine();
        System.out.println("auto driving..");
    }

    public void getFuel(){
        System.out.println("auto fueling..");
    }

    public void brokenWheel(String wheel){
        switch (wheel){
            case ("leftA"):
            case ("rightA"):
            case ("leftB"):
            case ("rightB"): {
                wheelsArray[0].changeWheel(wheel);
                break;
            }
        }
    }

    public void getMark(){
        System.out.println("mark - " + this.mark);
    }
}
