

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Entrance {

	public static void main(String args[]) throws IOException {
		Calendar calendar = new GregorianCalendar();
                @SuppressWarnings("unused")
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		Scanner scan = new Scanner(System.in);
                @SuppressWarnings("unused")
		BillView bv = new BillView();
		

            OUTER:
            while (true) {
                System.out.println("WELCOME BACK TO ^HD FRIED CHICKENS🍗🍗^");
                System.out.println("If you are new customer , kindly login to our page to enjoy your meals");
                System.out.println("1.Sign in(Create Acount)");
                System.out.println("2.Log in(Already Have an Account)");
                System.out.println("3.Exit app");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1 -> {
                            System.out.print("Create the user name : ");
                            String name = scan.next();
                            System.out.print("Enter the mobile number of " + name + " : ");
                            @SuppressWarnings("unused")
                            double no = scan.nextDouble();
                            System.out.println("Username registered successfully!");
                            System.out.println("ACCOUNT SUCCESSFULLY CREATED ! 👌👌");
                            System.out.println("Welcome , " + name);
                            System.out.println("Enjoy your orders");
                            Menu m1 = new Menu();
                            m1.menus();
                            FullList f1 = new FullList();
                            f1.full();
                            break OUTER;
                        }
                    case 2 -> {
                            System.out.print("Enter the user name : ");
                            String name = scan.next();
                            System.out.println("You already have an account ! you have logged in to your account 👍");
                            System.out.println("Welcome , " + name);
                            System.out.println("Enjoy your orders");
                            Menu m1 = new Menu();
                            m1.menus();
                            FullList f1 = new FullList();
                            f1.full();
                            break OUTER;
                        }
                    case 3 -> {
                        System.out.println("Thank you ! Visit again");
                        break OUTER;
                        }
                    default -> System.out.println("Invalid Input ! Try again");
                }
            }
	}
}