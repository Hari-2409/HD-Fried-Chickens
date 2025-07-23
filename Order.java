

import java.util.Random;
import java.util.Scanner;

class Order {

        @SuppressWarnings("unused")
	void order() {
            OUTER:
            while (true) {
                Scanner s = new Scanner(System.in);
                System.out.println("Select your booking");
                System.out.println("1.DineIn");
                System.out.println("2.TakeAway");
                System.out.println("3.Deliver");
                int c = s.nextInt();
                switch (c) {
                    case 1 -> {
                            System.out.println("Kindly enter your number for payment");
                            String no = s.next();
                            System.out.println("Enter your PAYMENT password");
                            String pa = s.next();
                            System.out.println("Payment loading......");
                            System.out.println("******");
                            System.out.println("Payment successfull......");
                            System.out.println("******");
                            System.out.println("Wait for your orders....");
                            System.out.println("******");
                            Random run = new Random();
                            int ord = run.nextInt(9999);
                            System.out.println("Your order number : " + ord);
                            break OUTER;
                        }
                    case 2 -> {
                            System.out.println("Kindly enter your number for payment");
                            String no = s.next();
                            System.out.println("Enter your UPI password");
                            String pa = s.next();
                            System.out.println("Payment loading......");
                            System.out.println("******");
                            System.out.println("Payment successfull......");
                            System.out.println("******");
                            Random run = new Random();
                            int ord = run.nextInt(9999);
                            System.out.println("Your order number : " + ord);
                            System.out.println("Wait for your package...");
                            break OUTER;
                        }
                    case 3 -> {
                        while (true) {
                            System.out.println(
                                    "Remember , HD CHICKENS located in TIRUVALLUR ! Kindly add delivers from tiruvallur district");
                            System.out.println("Enter your location");
                            String lo = s.next();
                            System.out.println("Enter your district");
                            String di = s.next();
                            if (di.equalsIgnoreCase("tiruvallur")) {
                                System.out.println("Enter your mobile number to contact");
                                String n = s.next();
                                System.out.println("Kindly enter your number for payment");
                                double no = s.nextDouble();
                                System.out.println("Enter your UPI password");
                                String pa = s.next();
                                System.out.println("Payment loading......");
                                System.out.println("******");
                                System.out.println("Payment successfull......");
                                System.out.println("******");
                                Random run = new Random();
                                int ord = run.nextInt(9999);
                                System.out.println("Your order number : " + ord);
                                int min = run.nextInt(99);
                                System.out.println("We will reach your loaction within : " + min + "minutes");
                                System.out.println("Wait for your package...Thank you...Book again");
                                
                                break;
                            } else {
                                System.out.println("Can't deliver to " + di + "! Sorry !");
                                
                            }
                        }
                        break OUTER;
                    }
                    default -> System.out.println("Invalid input ! Try again");
                }
            }
	}
}
