package pl.javastart.task;

public class Plant {
    String name;
    String variety;
    int waterNeedsWeekly;
    String description;

    Plant(String n, String v, int wNw, String d){
        name = n;
        variety = v;
        waterNeedsWeekly = wNw;
        description = d;
    }

    void showInfo(){
        String info = "Roślina " + name + " " + variety + " potrzebuje " + waterNeedsWeekly
                + " ml wody tygodniowo. " + description;
        System.out.println(info);
    }
}
