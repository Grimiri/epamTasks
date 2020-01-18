package subscribe;

public class Man implements Fire{

    public void scared(){
        System.out.println("Человек боится!");
    }

    @Override
    public void startShut() {
        scared();
    }
}
