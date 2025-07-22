import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entrance entrance = new Entrance();
        entrance.show(sc);
    }
}

class Entrance {
    void show(Scanner sc) {
        System.out.println("WELCOME TO FOOD ORDERING SYSTEM");
        Menu menu = new Menu();
        menu.showMenu(sc);
    }
}

class Menu {
    void showMenu(Scanner sc) {
        Addlist addlist = new Addlist();

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Snacks");
            System.out.println("2. Burger");
            System.out.println("3. Chicken Buckets");
            System.out.println("4. View Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: new Snacks().order(sc, addlist); break;
                case 2: new Burger().order(sc, addlist); break;
                case 3: new ChickenBuckets().order(sc, addlist); break;
                case 4: new BillView().show(addlist); break;
                case 5: System.out.println("Thank you for ordering!"); return;
                default: System.out.println("Invalid choice, try again.");
            }
        }
    }
}

class Snacks {
    void order(Scanner sc, Addlist addlist) {
        String[] snacks = {"Samosa", "Puffs", "Chips", "Fries"};
        int[] prices = {20, 25, 10, 30};

        while (true) {
            System.out.println("\n--- Snacks Menu ---");
            for (int i = 0; i < snacks.length; i++) {
                System.out.println((i + 1) + ". " + snacks[i] + " Rs." + prices[i]);
            }
            System.out.println((snacks.length + 1) + ". Back to Main Menu");
            System.out.print("Choose your snack: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= snacks.length) {
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                int total = prices[choice - 1] * qty;
                addlist.add(snacks[choice - 1], total);
                System.out.println(qty + " x " + snacks[choice - 1] + " added. Total Rs." + total);
            } else if (choice == snacks.length + 1) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

class Burger {
    void order(Scanner sc, Addlist addlist) {
        String[] burgers = {"Veg Burger", "Chicken Burger", "Cheese Burger"};
        int[] prices = {50, 80, 70};

        while (true) {
            System.out.println("\n--- Burger Menu ---");
            for (int i = 0; i < burgers.length; i++) {
                System.out.println((i + 1) + ". " + burgers[i] + " Rs." + prices[i]);
            }
            System.out.println((burgers.length + 1) + ". Back to Main Menu");
            System.out.print("Choose your burger: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= burgers.length) {
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                int total = prices[choice - 1] * qty;
                addlist.add(burgers[choice - 1], total);
                System.out.println(qty + " x " + burgers[choice - 1] + " added. Total Rs." + total);
            } else if (choice == burgers.length + 1) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

class ChickenBuckets {
    void order(Scanner sc, Addlist addlist) {
        String[] buckets = {"Small Bucket", "Medium Bucket", "Large Bucket"};
        int[] prices = {150, 250, 400};

        while (true) {
            System.out.println("\n--- Chicken Buckets Menu ---");
            for (int i = 0; i < buckets.length; i++) {
                System.out.println((i + 1) + ". " + buckets[i] + " Rs." + prices[i]);
            }
            System.out.println((buckets.length + 1) + ". Back to Main Menu");
            System.out.print("Choose your bucket: ");
            int choice = sc.nextInt();

            if (choice >= 1 && choice <= buckets.length) {
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                int total = prices[choice - 1] * qty;
                addlist.add(buckets[choice - 1], total);
                System.out.println(qty + " x " + buckets[choice - 1] + " added. Total Rs." + total);
            } else if (choice == buckets.length + 1) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

class BillView {
    void show(Addlist addlist) {
        addlist.showBill();
    }
}

class Addlist {
    int total = 0;

    void add(String item, int price) {
        System.out.println("Added: " + item + " Rs." + price);
        total += price;
    }

    void showBill() {
        System.out.println("\n--- Final Bill ---");
        System.out.println("Total Amount: Rs." + total);
    }
}
