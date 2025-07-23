

import java.util.Scanner;
class weddish {
	void dishw() {
		Scanner s = new Scanner(System.in);
            OUTER:
            while (true) {
                System.out.print("Select your dishes : ");
                int a = s.nextInt();
                switch (a) {
                    case 1 ->                         {
                            System.out.println("You have selected : WEDNESDAY STRIPS BUCKET");
                            System.out.println("Amount : 719");
                            int amt = 719;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("WEDNESDAY STRIPS BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Wedadd();
                        }
                    case 2 ->                         {
                            System.out.println("You have selected : WEDNESDAY SPECIAL 15PCS BUCKET ");
                            System.out.println("Amount :  799");
                            int amt = 799;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" WEDNESDAY SPECIAL 15PCS BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Wedadd();
                        }
                    case 3 ->                         {
                            System.out.println("You have selected : WEDNESDAY STRIP BUCKET MEAL");
                            System.out.println("Amount : 699");
                            int amt = 699;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("WEDNESDAY STRIP BUCKET MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Wedadd();
                        }
                    case 4 ->                         {
                            System.out.println("You have selected : WEDNESDAY BUCKET");
                            System.out.println("Amount : 659");
                            int amt = 659;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("WEDNESDAY BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Wedadd();
                        }
                    case 5 ->                         {
                            System.out.println("You have selected : WEDNESDAY VARIETY CHICKEN MEAL");
                            System.out.println("Amount : 619");
                            int amt = 619;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("WEDNESDAY VARIETY CHICKEN MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.Wedadd();
                        }
                    case 6 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        break OUTER;
                        }
                    case 7 -> {
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