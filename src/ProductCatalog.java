import java.util.Arrays;

public class ProductCatalog {

    Product[] products;
    static final int maxNumberOfProducts = 100;

    int numberOfProducts;

    public ProductCatalog() {
        this.products = new Product[maxNumberOfProducts];
        this.numberOfProducts = 0;
    }

    public void printProducts() {
        if (numberOfProducts == 0) {
            System.out.println("Catalogul este gol");
        }
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println(products[i].toString());
        }
        System.out.println();
    }

    public String addProduct(Product product) {

        if (isProductAdded(product) || maxNumberOfProducts == numberOfProducts) {
            return "Produsul nu a fost adaugat";
        } else {
            products[numberOfProducts] = product;
            numberOfProducts = numberOfProducts + 1;
            return "Produsul a fost adaugat";
        }
    }

    public String deleteProduct(String name) {
        int index = -1;
        for(int i=0;i<numberOfProducts;i++){
            if(name.equals(products[i].name)){
                index=i;
            }
            if(index!=-1){
                products[i] = products[i + 1];
            }
        }
        if(index!=-1) {
            numberOfProducts--;
            return "elementul a fost sters";
        }else{

            return "elementul nu a fost gasit";
        }
//        int indexToDelete=-1;  //un index temporar care imi preia pozitia elementului gasit  sau negasit(-1)
//        Product[] tempProducts = new Product[numberOfProducts-1]; //initializem un array temporar unde vom copia elementele fara cel pe care vrem sa-l stergem
//
//        for(int i=0;i<numberOfProducts;i++){ //parcurgem array-ul de produse
//            if(name.equals(products[i].name)){ //daca gasim produsul dupa nume
//                indexToDelete=i;                //retinem indexul
//                break;
//            }
//        }
//        if(indexToDelete==-1){ //daca indexul nu a fost schimbat (nu am gasit nimic dupa nume) elementul nu se gaseste in lista
//            return "elementul nu a fost gasit in lista";
//        }
//
//        int j=0; //pentru noul array temporar
//        for(int i=0;i<numberOfProducts;i++){ //parcurgem produsele originale
//            if(i!=indexToDelete){            //daca i este diferit de indexul pe care l-am gasit de sters
//                tempProducts[j]=products[i]; //copiem in produsele temporare
//                j++;
//            }
//
//        }
//        numberOfProducts--;
//        products = tempProducts;  //copiem produsele temporare in produsele originale
//
//        return "produsul a fost sters";
    }

    public boolean isProductAdded(Product product) {
        if (numberOfProducts == 0) {
            return false;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (product.name.equals(products[i].name)) {
                return true;
            }
        }
        return false;
    }

    public Product getProductByName(String name) {
        if (numberOfProducts == 0) {
            return null;
        }
        for (int i = 0; i < numberOfProducts; i++) {
            if (name.equals(products[i].name)) {
                return products[i];
            }
        }
        return null;

    }


}
