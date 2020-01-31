package ProgrammingWithClasses_4.aggregationandcomposition.Task_3;

import java.util.ArrayList;

/*
* 3. Создать объект класса Государство, используя классы
* Область, Район, Город.
* Методы: вывести на консоль столицу,
* количество областей, площадь, областные центры.
* */
public class Main {
    public static void main(String[] args) {
        ArrayList<Area> areas = new ArrayList<>();
        areas.add(new Area("Kolasa"));
        areas.add(new Area("Nemiga"));

        ArrayList<Area> areas1 = new ArrayList<>();
        areas.add(new Area("Kamennaia Gorka"));
        areas.add(new Area("Vostok"));

        ArrayList<Area> areas2 = new ArrayList<>();
        areas2.add(new Area("Uruchie"));
        areas2.add(new Area("Dolina"));


        ArrayList<City> cityArrayList = new ArrayList<>();
        cityArrayList.add(new City("Minsk", true, areas));
        cityArrayList.get(0).setCapital(true);
        cityArrayList.add(new City("Baranovichi", false, areas1));

        ArrayList<City> cityArrayList1 = new ArrayList<>();
        cityArrayList1.add(new City("Lug", true, areas2));

        ArrayList<Region> regionArrayList = new ArrayList<>();
        regionArrayList.add(new Region("Minskaia", cityArrayList));
        regionArrayList.add(new Region("Green", cityArrayList1));

        State state = new State("GreenBel", regionArrayList);

        System.out.println("capital - " + state.findCapital());
        System.out.println("count of regions - " + state.findCountOfRegions());
        System.out.println("state square  - " + state.findSquare());
        state.findOblCount();




    }
}
