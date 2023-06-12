package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Plant plant1 = new Plant();
        plant1.name = "Sansevieria";
        plant1.variety = "Pearl Young";
        plant1.waterNeedsWeekly = 150;
        plant1.description ="Jasnozielone liście, kremowe obrzeże.";

        Plant plant2 = new Plant();
        plant2.name = "Peperomia";
        plant2.variety = "Watermelon";
        plant2.waterNeedsWeekly = 100;
        plant2.description ="Liście przypominające arbuza, ciemnozielone, czerwone łodygi.";

        plant1.showInfo();
        plant2.showInfo();
    }
}
