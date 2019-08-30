import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    private ArrayList<Product> shoppingList = new ArrayList<Product>();


    public void addProduct() {
        System.out.println("Wpisz produkt ktory chcesz dodac do listy zakupow");
        System.out.println("Nazwa produktu: ");
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        System.out.println("Liczba wpisanego produktu");
        int quantity = scanner.nextInt();
        shoppingList.add(new Product(product, quantity));
    }

    public void removeProduct() {
        System.out.println("Wpisz produkt ktory chcesz usunac z listy");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        shoppingList.remove(id);
    }

    public void displayList() {
        System.out.println("Lista produktow na liscie");
        for (Product i : shoppingList) {
            System.out.println("Produkt " + "ilosc");
            System.out.println(i);
        }
    }
}
