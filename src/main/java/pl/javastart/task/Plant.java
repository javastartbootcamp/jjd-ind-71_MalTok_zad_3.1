package pl.javastart.task;

public class Plant {
    String name;
    String variety;
    int waterNeedsWeekly;
    String description;

    Plant(String n, String v, int wNW, String d){
        name = n;
        variety = v;
        waterNeedsWeekly = wNW;
        description = d;
    }

    void showInfo(){
        String info = "Roślina " + name + " " + variety + " potrzebuje " + waterNeedsWeekly
                + " ml wody tygodniowo. " + description;
        System.out.println(info);
    }
}
