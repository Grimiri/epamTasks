package subscribe;

public class Main {
    public static void main(String[] args) {
        Shuting shuting = new Shuting();

        //event subscribe
        shuting.addFire(new Bullet());
        shuting.addFire(new Man());
        shuting.addFire(new Fire() {
            @Override
            public void startShut() {
                System.out.println("Кто-то погиб!");
            }
        });
        shuting.shut();
    }
}
