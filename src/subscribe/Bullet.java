package subscribe;

public class Bullet implements Fire {

    public void fly(){
        System.out.println("Пуля летит!");
    }

    @Override
    public void startShut() {
        fly();
    }
}
