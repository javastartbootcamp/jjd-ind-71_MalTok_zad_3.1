package pl.javastart.task;

public class Plant {
    String name;
    String variety;
    int waterNeedsWeekly;
    String description;

    Plant(){

    }

    void showInfo(){
        String info = "Roślina " + name + " " + variety + " potrzebuje " + waterNeedsWeekly
                + " ml wody tygodniowo. " + description;
        System.out.println(info);
    }
}
