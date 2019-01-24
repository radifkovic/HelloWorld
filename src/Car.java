
public class Car {

    int maxSpeed = 180;
    double weight = 1340.43;
    boolean isTheCarOn = false;
    String model = "Audi";
    
    double maxFuel = 100;
    double currentFuel = 50;
    int consumption = 5; //per 100km
    double mileagePassed = 2000;
    
    public void printVariables() { 
        System.out.println("Maksimalna brzina: " + maxSpeed);
        System.out.println("Težina je: " +  weight);
        System.out.println(isTheCarOn);
        System.out.println("Model automobila je" + model);
        System.out.println(maxFuel);
        System.out.println(currentFuel);
        System.out.println("Potrošnja goriva je " + consumption);
        System.out.println("Pređeno je " + mileagePassed + " kilometara.");
    }
}
