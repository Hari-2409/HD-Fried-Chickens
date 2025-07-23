

import java.util.Scanner;


class boxdish {
	
		void dishb() {
			Scanner s = new Scanner(System.in);
			System.out.print("Select your dishes : ");
                    OUTER:
                    while (true) {
                        int a = s.nextInt();
                        switch (a) {
                            case 1 ->                                 {
                                    System.out.println("You have selected : ALL CHICKEN BOX");
                                    System.out.println("Amount : 179.0");
                                    double amt = 179.05;
                                    System.out.println("How many quantity you need to add ? ");
                                    int q = s.nextInt();
                                    double fiam = amt * q;
                                    System.out.println("Final amount : " + amt * q);
                                    BillView bv = new BillView();
                                    bv.additem("ALL CHICKEN BOX", amt, q, fiam);
                                    bv.printBill();
                                    add s1 = new add();
                                    s1.Boxadd();
                                }
                            case 2 ->                                 {
                                    System.out.println("You have selected : CLASSIC ZINGER BOX");
                                    System.out.println("Amount : 208.57");
                                    double amt = 208.57;
                                    System.out.println("How many quantity you need to add ?");
                                    int q = s.nextInt();
                                    double fiam = amt * q;
                                    System.out.println("Final amount : " + amt * q);
                                    BillView bv = new BillView();
                                    bv.additem("CLASSIC ZINGER BOX", amt, q, fiam);
                                    bv.printBill();
                                    add s1 = new add();
                                    s1.Boxadd();
                                }
                            case 3 ->                                 {
                                    System.out.println("You have selected : POPCORN RICE BOX ");
                                    System.out.println("Amount : 238.48");
                                    double amt = 238.48;
                                    System.out.println("How many quantity you need to add ?");
                                    int q = s.nextInt();
                                    double fiam = amt * q;
                                    System.out.println("Final amount : " + amt * q);
                                    BillView bv = new BillView();
                                    bv.additem("POPCORN RICE BOX", amt, q, fiam);
                                    bv.printBill();
                                    add s1 = new add();
                                    s1.Boxadd();
                                }
                            case 4 ->                                 {
                                    System.out.println("You have selected : TANDOORI ZINGER BOX ");
                                    System.out.println("Amount : 248.36");
                                    double amt = 248.36;
                                    System.out.println("How many quantity you need to add ?");
                                    int q = s.nextInt();
                                    double fiam = amt * q;
                                    System.out.println("Final amount : " + amt * q);
                                    BillView bv = new BillView();
                                    bv.additem("TANDOORI ZINGER BOX", amt, q, fiam);
                                    bv.printBill();
                                    add s1 = new add();
                                    s1.Boxadd();
                                }
                            case 5 -> {
                                Menu m = new Menu();
                                m.menus();
                                FullList f1 = new FullList();
                                f1.full();
                                break OUTER;
                                }
                            case 6 -> {
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
