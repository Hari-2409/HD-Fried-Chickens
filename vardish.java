

import java.util.Scanner;

class vardish {
	void dishv() {
		Scanner s = new Scanner(System.in);
		System.out.print("Select your dishes : ");
            OUTER:
            while (true) {
                int a = s.nextInt();
                switch (a) {
                    case 1 ->                         {
                            System.out.println("You have selected : ULTIMATE SAVINGS BUCKET");
                            System.out.println("Amount : 659.02");
                            double amt = 659.02;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" ULTIMATE SAVINGS BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 2 ->                         {
                            System.out.println("You have selected : ALL IN ONE BUCKET");
                            System.out.println("Amount : 519.05");
                            double amt = 519.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" ALL IN ONE BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 3 ->                         {
                            System.out.println("You have selected : BUCKET FOR TWO");
                            System.out.println("Amount : 619.09");
                            double amt = 619.09;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("BUCKET FOR TWO", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 4 ->                         {
                            System.out.println("You have selected : BIG 12");
                            System.out.println("Amount : 679.05");
                            double amt = 679.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" BIG 12", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 5 ->                         {
                            System.out.println("You have selected : MINGLES BUCKET MEAL");
                            System.out.println("Amount :  479.05");
                            double amt = 479.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" MINGLES BUCKET MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 6 ->                         {
                            System.out.println("You have selected : BIG 8");
                            System.out.println("Amount : 529.05");
                            double amt = 529.05;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" BIG 8", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 7 ->                         {
                            System.out.println("You have selected : STAY HOME BUCKET");
                            System.out.println("Amount : 529.98");
                            double amt = 529.98;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            System.out.println("Final amount : " + amt * q);
                            double fiam = amt * q;
                            BillView bv = new BillView();
                            bv.additem(" STAY HOME BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.varadd();
                        }
                    case 8 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        break OUTER;
                        }
                    case 9 -> {
                        System.out.println(" BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input ! Try again");
                }
            }
	}
}