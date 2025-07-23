

import java.util.Scanner;
class sndish {
	void dishs() {
		Scanner s = new Scanner(System.in);
		System.out.print("Select your dishes : ");
            OUTER:
            while (true) {
                int a = s.nextInt();
                switch (a) {
                    case 1 ->                         {
                            System.out.println("You have selected : 2 PCS HOT AND CRISPY CHICKEN");
                            System.out.println("Amount : 148");
                            int amt = 148;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" 2 PCS HOT AND CRISPY CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 2 ->                         {
                            System.out.println("You have selected : SAUCY POPCORN * CARRY MINATI");
                            System.out.println("Amount : 199");
                            int amt = 199;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("SAUCY POPCORN * CARRY MINATI", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 3 ->                         {
                            System.out.println("You have selected : REGULAR POPCORN");
                            System.out.println("Amount : 99");
                            int amt = 99;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("REGULAR POPCORN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 4 ->                         {
                            System.out.println("You have selected : MEDIUM POPCORN");
                            System.out.println("Amount : 148");
                            int amt = 148;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 5 ->                         {
                            System.out.println("You have selected : LARGE POPCORN");
                            System.out.println("Amount : 199");
                            int amt = 199;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" LARGE POPCORN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 6 ->                         {
                            System.out.println("You have selected : MEDIUM FRIES");
                            System.out.println("Amount : 127");
                            int amt = 127;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("MEDIUM FRIES", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 7 ->                         {
                            System.out.println("You have selected :  LARGE FRIES ");
                            System.out.println("Amount : 189");
                            int amt = 189;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" LARGE FRIES", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 8 ->                         {
                            System.out.println("You have selected : 4 PCS HOT WINGS ");
                            System.out.println("Amount : 238");
                            int amt = 238;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" 4 PCS HOT WINGS", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 9 ->                         {
                            System.out.println("You have selected : PERI PERI 3 PCS CHICKEN STRIPS");
                            System.out.println("Amount : 199");
                            int amt = 199;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("PERI PERI 3 PCS CHICKEN STRIPS", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 10 ->                         {
                            System.out.println("You have selected : 2 PCS SMOKY RED CHICKEN");
                            System.out.println("Amount : 159");
                            int amt = 159;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem(" 2 PCS SMOKY RED CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 11 ->                         {
                            System.out.println("You have selected : CHICKEN AND FRIES BUCKET");
                            System.out.println("Amount : 299");
                            int amt = 299;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("CHICKEN AND FRIES BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 12 ->                         {
                            System.out.println("You have selected : POPCORN AND FRIES BUCKET");
                            System.out.println("Amount : 259");
                            int amt = 259;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("POPCORN AND FRIES BUCKET", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 13 ->                         {
                            System.out.println("You have selected : 4 PCS HOT AND CRISPY CHICKEN");
                            System.out.println("Amount : 148");
                            int amt = 148;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("4 PCS HOT AND CRISPY CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 14 ->                         {
                            System.out.println("You have selected : 1 PC HOT AND CRISPY CHICKEN");
                            System.out.println("Amount : 48");
                            int amt = 48;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("1 PC HOT AND CRISPY CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 15 ->                         {
                            System.out.println("You have selected : 1 PC SMOKY RED CHICKEN");
                            System.out.println("Amount : 58");
                            int amt = 58;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("1 PC SMOKY RED CHICKEN", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 16 ->                         {
                            System.out.println("You have selected : TANDOORI MASALA DIP 20 GM ");
                            System.out.println("Amount : 42");
                            int amt = 42;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("TANDOORI MASALA DIP 20 GM", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 17 ->                         {
                            System.out.println("You have selected : NASHVILLE HOT PEPPER DIP 20 GM");
                            System.out.println("Amount : 48");
                            int amt = 48;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("NASHVILLE HOT PEPPER DIP 20 GM", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 18 ->                         {
                            System.out.println("You have selected : PACK OF 4 DIPS 20 GM EACH");
                            System.out.println("Amount : 99");
                            int amt = 99;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("PACK OF 4 DIPS 20 GM EACH", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 19 ->                         {
                            System.out.println("You have selected : PACK OF 2 DIPS 20 GM EACH");
                            System.out.println("Amount : 59");
                            int amt = 59;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("PACK OF 2 DIPS 20 GM EACH", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 20 ->                         {
                            System.out.println("You have selected : THAI SPICY CHICKEN ROLL");
                            System.out.println("Amount : 108");
                            int amt = 108;
                            System.out.println("How many quantity you need to add ?");
                            int q = s.nextInt();
                            double fiam = amt * q;
                            System.out.println("Final amount : " + amt * q);
                            BillView bv = new BillView();
                            bv.additem("THAI SPICY CHICKEN ROLL", amt, q, fiam);
                            bv.printBill();
                            add s1 = new add();
                            s1.snacksadd();
                        }
                    case 21 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        break OUTER;
                        }
                    case 22 -> {
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