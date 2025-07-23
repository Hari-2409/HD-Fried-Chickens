

import java.util.Scanner;

class chickdish {
	void dishc() {
		Scanner s = new Scanner(System.in);
		System.out.print("Select your dishes : ");
            OUTER:
            while (true) {
                int a = s.nextInt();
                switch (a) {
                    case 1 ->                         {
                            System.out.println("You have selected : 5 PCS SMOKY RED CHICKEN");
                            System.out.println("Amount :  428.57");
                            double amt = 428.57;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("5 PCS SMOKY RED CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 14 -> {
                        System.out.println(" BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        break OUTER;
                        }
                    case 2 ->                         {
                            System.out.println("You have selected : 5 PCS SMOKY CHICKEN MOJITO COMBO");
                            System.out.println("Amount : 528.57");
                            double amt = 528.57;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem("5 PCS SMOKY CHICKEN MOJITO COMBO", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 3 ->                         {
                            System.out.println("You have selected : 8 PCS HOT AND CRISPY CHICKEN");
                            System.out.println("Amount : 599.05");
                            double amt = 599.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" 8 PCS HOT AND CRISPY CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 4 ->                         {
                            System.out.println("You have selected : 6 PCS HOT AND CRISPY CHICKEN");
                            System.out.println("Amount : 509.48");
                            double amt = 509.48;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" 6 PCS HOT AND CRISPY CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 5 ->                         {
                            System.out.println("You have selected : 4 PCS HOT AND CRISPY CHICKEN PEPSI COMBO ");
                            System.out.println("Amount : 458.05");
                            double amt = 458.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" 4 PCS HOT AND CRISPY CHICKEN PEPSI COMBO ", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 6 ->                         {
                            System.out.println("You have selected : PERI PERI 5 LEG PCS ");
                            System.out.println("Amount : 358.09");
                            double amt = 358.09;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem("PERI PERI 5 LEG PCS ", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 7 ->                         {
                            System.out.println("You have selected : 5 LEG PCS PEPSI COMBO ");
                            System.out.println("Amount : 499.00");
                            double amt = 499.00;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem("5 LEG PCS PEPSI COMBO ", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 8 ->                         {
                            System.out.println("You have selected : 6 PCS STRIPS AND PEPSI COMBO");
                            System.out.println("Amount : 469.35");
                            double amt = 469.35;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("6 PCS STRIPS AND PEPSI COMBO", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 9 ->                         {
                            System.out.println("You have selected : PERI PERI 10 PCS CHICKEN STRIPS AND 2 DIPS");
                            System.out.println("Amount : 719.33");
                            double amt = 719.33;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("PERI PERI 10 PCS CHICKEN STRIPS AND 2 DIPS", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 10 ->                         {
                            System.out.println("You have selected : PERI PERI 10 LEG PCS AND FOUR DIPS ");
                            System.out.println("Amount : 799.22");
                            double amt = 799.22;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" PERI PERI 10 LEG PCS AND FOUR DIPS", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 11 ->                         {
                            System.out.println("You have selected : PERI PERI 5 LEG PCS MEAL");
                            System.out.println("Amount : 799.22");
                            double amt = 799.22;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" PERI PERI 5 LEG PCS MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 12 ->                         {
                            System.out.println("You have selected :  PERI PERI 6 PCS CHICKEN STRIPS ");
                            System.out.println("Amount : 459.05");
                            double amt = 459.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem("PERI PERI 6 PCS CHICKEN STRIPS", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.chickadd();
                        }
                    case 13 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        break OUTER;
                        }
                    default -> System.out.println("Try again .. Invalid input");
                }
            }
	}
}
