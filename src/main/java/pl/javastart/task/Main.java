package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Plant plant1 = new Plant("Sansevieria","Pearl Young",150,"Jasnozielone liście, kremowe obrzeże.");

        Plant plant2 = new Plant("Peperomia","Watermelon",100,"Liście przypominające arbuza, ciemnozielone, czerwone łodygi.");

        plant1.showInfo();
        plant2.showInfo();
    }
}
