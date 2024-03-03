import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = scanner.nextInt();

            performSelectedAction(option, productCatalog, scanner);
        } while (option != 6);


//        Product produs1 = new Product("mere", 20, 30, 40);
//        System.out.println(productCatalog.addProduct(produs1));
//        System.out.println("Ai introdus in total: " + productCatalog.numberOfProducts + " produse");
//
//        Product produs2 = new Product("mere", 20, 30, 40);
//        System.out.println(productCatalog.addProduct(produs2));
//        System.out.println("Ai introdus in total: " + productCatalog.numberOfProducts + " produse");
//
//
//        Product produs3 = new Product("pere", 10, 40, 50);
//        System.out.println(productCatalog.addProduct(produs3));
//        System.out.println("Ai introdus in total: " + productCatalog.numberOfProducts + " produse");
//
//        System.out.println("Introdu numele produsului pe care vrei sa il stergi");
//        String nameToBeDeleted = scanner.next();
//        System.out.println(productCatalog.deleteProduct(nameToBeDeleted));

//        System.out.println(productCatalog.deleteProduct(produs3));
//        productCatalog.printProducts();
//
//        System.out.println("Produsul a fost gasit: " +productCatalog.getProductByName("mere"));


//        System.out.println(produs1.toString());
//        System.out.println(produs2.toString());
//        System.out.println(produs3.toString());

//        productCatalog.addProduct(produs2);
//        productCatalog.addProduct(produs3);
//
//
//        productCatalog.printProducts();
//        calculeaza caloriile unui produs fara a fii adaugat in catalog
//        Product tempProduct = Product.getInfo();
//        System.out.println("Caloriile produsului sunt: " + Product.computeCalories(tempProduct.fats, tempProduct.carbs, tempProduct.proteins));
    }

    public static void printMenu() {
        System.out.println("---------------");
        System.out.println("meniu");
        System.out.println("1. Adauga un produs in calculator si calculeaza-i caloriile");
        System.out.println("2. Calculeaza caloriile pentru un produs fara a fi adaugat in catalog");
        System.out.println("3. Afiseaza toate produsele din catalog si caloriile pentru fiecare");
        System.out.println("4. Sterge un produs din catalog");
        System.out.println("5. Gaseste produs dupa nume");
        System.out.println("6. Iesi din meniu");
        System.out.println("---------------");
        System.out.println("introdu optiunea aleasa");

    }

    public static void performSelectedAction(int option, ProductCatalog productCatalog, Scanner scanner) {
        switch (option) {
            case 1:
                Product product = Product.getInfo();
                System.out.println(productCatalog.addProduct(product));
                System.out.println("Ai introdus: " + productCatalog.numberOfProducts + " produse");
                break;

            case 2:
                Product tempProduct = Product.getInfo();
                System.out.println("Caloriile produsului sunt: " + Product.computeCalories(tempProduct.fats, tempProduct.carbs, tempProduct.proteins));
                break;
            case 3:
                System.out.println("Produsele catalogului sunt:");
                productCatalog.printProducts();
                System.out.println();
                break;
            case 4:
                System.out.println("Introdu numele produsului pe care vrei sa il stergi");
                String nameToBeDeleted = scanner.next();
                System.out.println(productCatalog.deleteProduct(nameToBeDeleted));
                break;

            case 5:
                System.out.println("Specifica numele produsului pe care vrei sa il gasesti ");
                String findByName = scanner.next();
                System.out.println(productCatalog.getProductByName(findByName));

                break;
            case 6:
                break;
            default:
                System.out.println("optiune invalida. Reintrodu numarul");
        }
    }
}