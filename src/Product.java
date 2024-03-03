import java.util.Scanner;

public class Product {

    String name;
    double fats;
    double carbs;
    double proteins;
    double calories;

    public Product(String name, double fats, double carbs, double proteins) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.proteins = proteins;
        this.calories = computeCalories(fats, carbs, proteins);
    }
    public static Product getInfo(){ //functie independenta de obiect dar a clasei care citeste de la tastatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele produsului:");
        String name = scanner.next();
        System.out.println("Introdu grasimile:");
        double fats = scanner.nextDouble();
        System.out.println("introdu carbohidratii:");
        double carbs = scanner.nextDouble();
        System.out.println("introdu proteinele:");
        double proteins = scanner.nextDouble();

        return new Product(name,fats,carbs,proteins);
    }
    public static double computeCalories(double fats, double carbs, double proteins) {
        double calories = 0;
        calories = (9 * fats + 4 * carbs + 4 * proteins);
        return calories;
    }

    @Override
    public String toString() {
        return "Produsul cu numele " + '\'' +
                  name + '\'' +
                ", care are: " + fats +
                " grasimi, " + carbs +
                " carbohidrati, " + proteins +
                " proteine  si " + calories +
                " calorii";
    }
}
