package ProgrammingWithClasses_4.aggregationandcomposition.Task_2;

/*
* 2. Создать объект класса Автомобиль,
* используя классы Колесо, Двигатель.
* Методы: ехать, заправляться, менять колесо,
* вывести на консоль марку автомобиля.*/
public class Main {
    public static void main(String[] args) {

        Auto auto = new Auto();

        auto.setEngineType("V8");
        auto.setEngineNumber(223);
        auto.setWheels("winter wheels", 30, 4);
        auto.setMark("Subaru");

        auto.drive();
        auto.getFuel();
        auto.brokenWheel("leftB");
        auto.getMark();
    }
}
