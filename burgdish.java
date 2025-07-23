
import java.util.Scanner;



class burgdish {
	void dishb() {
		Scanner s = new Scanner(System.in);
		System.out.print("Select your dishes : ");
            OUTER:
            while (true) {
                int a = s.nextInt();
                switch (a) {
                    case 1 ->                         {
                            System.out.println("You have selected : 2 CHANA BURGER");
                            System.out.println("Amount : 228");
                            int amt = 228;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" 2 CHANA BURGER", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 2 ->                         {
                            System.out.println("You have selected : 2 CHANA BURGER AND FRIES COMBO");
                            System.out.println("Amount : 258");
                            int amt = 258;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("2 CHANA BURGER AND FRIES COMBO", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 3 ->                         {
                            System.out.println("You have selected : 2 CHANA BURGER AND FRIES MEAL");
                            System.out.println("Amount : 289");
                            int amt = 289;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("F2 CHANA BURGER AND FRIES MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 4 ->                         {
                            System.out.println("You have selected : GOLD EDITION CHICKEN ZINGER AND FRIES ");
                            System.out.println("Amount : 389");
                            int amt = 389;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("GOLD EDITION CHICKEN ZINGER AND FRIES ", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 5 ->                         {
                            System.out.println("You have selected : SPICY ZINGER BURGER ");
                            System.out.println("Amount : 319");
                            int amt = 319;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" SPICY ZINGER BURGER ", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 6 ->                         {
                            System.out.println("You have selected : SPICY ZINGER BURGER AND CHICKEN MEAL");
                            System.out.println("Amount : 399");
                            int amt = 399;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" SPICY ZINGER BURGER AND CHICKEN MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 7 ->                         {
                            System.out.println("You have selected : SPICY ZINGER BURGER AND POPCORN MEAL ");
                            System.out.println("Amount : 379");
                            int amt = 379;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("SPICY ZINGER BURGER AND POPCORN MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 8 ->                         {
                            System.out.println("You have selected : ZINGER PRO BURGER");
                            System.out.println("Amount : 409");
                            int amt = 409;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("ZINGER PRO BURGER", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 9 ->                         {
                            System.out.println("You have selected : ZINGER PRO PEPSI COMBO");
                            System.out.println("Amount : 499");
                            int amt = 499;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" ZINGER PRO PEPSI COMBO", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 10 ->                         {
                            System.out.println("You have selected : ZINGER PRO BURGER AND POPCORN MEAL");
                            System.out.println("Amount : 519");
                            int amt = 519;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("ZINGER PRO BURGER AND POPCORN MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 11 ->                         {
                            System.out.println("You have selected : ZINGER PRO BURGER AND CHICKEN MEAL");
                            System.out.println("Amount : 559");
                            int amt = 559;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" ZINGER PRO BURGER AND CHICKEN MEAL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 12 ->                         {
                            System.out.println("You have selected : CLASSIC ZINGER");
                            System.out.println("Amount : 359");
                            int amt = 359;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("CLASSIC ZINGER", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 13 ->                         {
                            System.out.println("You have selected :  CLASSIC ZINGER WITH CHEESE");
                            System.out.println("Amount : 379");
                            int amt = 379;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("CLASSIC ZINGER WITH CHEESE", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 14 ->                         {
                            System.out.println("You have selected : CLASSIC ZINGER MOJITO COMBO");
                            System.out.println("Amount : 429");
                            int amt = 429;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.printBill();
                            bv.additem("CLASSIC ZINGER MOJITO COMBO", amt, q, fiam);
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 15 ->                         {
                            System.out.println("You have selected : INDIAN TANDOORI ZINGER BURGER ");
                            System.out.println("Amount : 399");
                            int amt = 399;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("INDIAN TANDOORI ZINGER BURGER ", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 16 ->                         {
                            System.out.println("You have selected : TANDOORI ZINGER BURGER WITH CHEESE");
                            System.out.println("Amount : 429");
                            int amt = 429;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("TANDOORI ZINGER BURGER WITH CHEESE", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 17 ->                         {
                            System.out.println("You have selected : PANEER ZINGER BURGER");
                            System.out.println("Amount : 299");
                            int amt = 299;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("PANEER ZINGER BURGER", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 18 ->                         {
                            System.out.println("You have selected : CHICKEN AND CRISPERS COMBO ");
                            System.out.println("Amount : 599");
                            int amt = 599;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("CHICKEN AND CRISPERS COMBO", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 19 ->                         {
                            System.out.println("You have selected : KFC FAVORITES");
                            System.out.println("Amount : 619");
                            int amt = 619;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("KFC FAVORITES", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 20 ->                         {
                            System.out.println("You have selected : FAMILY FEAST");
                            System.out.println("Amount : 589");
                            int amt = 589;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("FAMILY FEAST", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.burgeradd();
                        }
                    case 22 -> {
                        System.out.println(" BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        break OUTER;
                        }
                    case 21 -> {
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
