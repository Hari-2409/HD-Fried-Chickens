

import java.util.Scanner;

class golddish {
	void dishg() {
		Scanner s = new Scanner(System.in);
		System.out.print("Select your dishes : ");
            OUTER:
            while (true) {
                int a = s.nextInt();
                switch (a) {
                    case 1 ->                         {
                            System.out.println("You have selected : CHICKEN ZINGER AND FRIES");
                            System.out.println("Amount : 299.05");
                            double amt = 299.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("CHICKEN ZINGER AND FRIES", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Goldadd();
                        }
                    case 2 ->                         {
                            System.out.println("You have selected : CHICKEN ZINGER AND FRIES WITH PEPSI");
                            System.out.println("Amount : 347.62");
                            double amt = 347.62;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem("CHICKEN ZINGER AND FRIES WITH PEPSI", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Goldadd();
                        }
                    case 3 ->                         {
                            System.out.println("You have selected : VEG ZINGER");
                            System.out.println("Amount : 208.57");
                            double amt = 208.57;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem("VEG ZINGER", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Goldadd();
                        }
                    case 4 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        break OUTER;
                        }
                    case 5 -> {
                        System.out.println(" BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        break OUTER;
                        }
                    default -> System.out.println("Try again .. Invalid input");
                }
            }
	}
}
