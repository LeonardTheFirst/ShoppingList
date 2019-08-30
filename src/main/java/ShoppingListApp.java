import java.util.Scanner;

public class ShoppingListApp {
    public static void main(String[] args) {

        int choice;
        ShoppingList shoppingList = new ShoppingList();
        Scanner scanner = new Scanner(System.in);

        do {
            Menu.printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Dodaj produkt do listy");
                    shoppingList.addProduct();
                    break;
                case 2:
                    System.out.println("Usuń produkt z listy");
                    shoppingList.removeProduct();
                    break;
                case 3:
                    System.out.println("Podglad Listy");
                    shoppingList.displayList();
                    break;
                case 4:
                    System.out.println("Eksport listy do pdf");
                    Pdf.createPdf();
                    break;
                case 5:
                    System.out.println("Zamkniecie aplikacji");
                    System.exit(0);
            }
        }
        while (choice != 4);
        System.out.println("Dziekujemy za skorzystanie z aplikacji");

    }
}
