package subscribe;

import java.util.ArrayList;

public class Shuting {

    private ArrayList<Fire> fireArrayList = new ArrayList<>();

    public void addFire(Fire fire){
        fireArrayList.add(fire);
    }

    public void removeFire(Fire fire){
        fireArrayList.remove(fire);
    }

    public void shut(){
        System.out.println("Началась стрельба!");
        /*if (fire != null){
            fire.startShut();
        }*/
        for (Fire fire: fireArrayList) {
            fire.startShut();
        }
    }
}
