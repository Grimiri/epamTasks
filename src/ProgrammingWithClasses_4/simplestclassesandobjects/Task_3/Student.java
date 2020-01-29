package ProgrammingWithClasses_4.simplestclassesandobjects.Task_3;

import javax.swing.text.MutableAttributeSet;

public class Student {
    private String lastName;
    private String io;
    private String groupNumber;
    private int[] marksArray = new int[5];

    Student(String lastName, String io, String groupNumber){
        this.lastName = lastName;
        this.io = io;
        this.groupNumber = groupNumber;
        setMarksArray();
    }

    public void setMarksArray() {
        int[] marks = new int[5];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int)(Math.round(9 + ((Math.random() * 2) - 1)));
        }
        this.marksArray = marks;
    }

    public boolean areGoodStudent(){
        for (int mark : marksArray) {
            if(mark <= 8){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String marks = "";
        for (int m : marksArray) {
            marks += m + " ";
        }
        return lastName + " " +  groupNumber + " " + marks;
    }
}
