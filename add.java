
import java.util.Scanner;
 class add {

	void snacksadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from snacks");

		System.out.println("2 . View menu");
		System.out.println("3 .View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        Snacks aq = new Snacks();
                        aq.snack();
                        sndish aq1 = new sndish();
                        aq1.dishs();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println(" BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }
	}

	void burgeradd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from burger");

		System.out.println("2 . View menu");
		System.out.println("3 . View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        Burger aq = new Burger();
                        aq.Burg();
                        burgdish aq2 = new burgdish();
                        aq2.dishb();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println("BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }
	}

	void Wedadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from Wednesday Deals");

		System.out.println("2 . View menu");
		System.out.println("3 . View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        wed aq = new wed();
                        aq.wedoff();
                        weddish x = new weddish();
                        x.dishw();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println("BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }
	}

	void chickadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from chicken buckets");

		System.out.println("2 . View menu");
		System.out.println("3 . View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        ChickenBuckets aq = new ChickenBuckets();
                        aq.Chick();
                        chickdish aq4 = new chickdish();
                        aq4.dishc();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println(" BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }
	}

	void varadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from variety buckets");

		System.out.println("2 . View menu");
		System.out.println("3 . View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        VarietyBuckets aq = new VarietyBuckets();
                        aq.vabu();
                        vardish v2 = new vardish();
                        v2.dishv();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println("BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }
	}

	void Goldadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from gold edition ");

		System.out.println("2 . View menu");
		System.out.println("3 . View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        GoldEdition aq = new GoldEdition();
                        aq.gold();
                        golddish g = new golddish();
                        g.dishg();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println("BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }
	}

	void Boxadd() {
		Scanner s = new Scanner(System.in);
		System.out.println("You can add other items too");
		System.out.println("1 . Add item from box meals");

		System.out.println("2 . View menu");
		System.out.println("3 . View cart");
            OUTER:
            while (true) {
                int h = s.nextInt();
                switch (h) {
                    case 1 -> {
                        BoxMeals aq = new BoxMeals();
                        aq.meal();
                        boxdish b = new boxdish();
                        b.dishb();
                        break OUTER;
                        }
                    case 2 -> {
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        }
                    case 3 -> {
                        System.out.println("BILL DELIVERED");
                        System.out.println("PROCEED PAYMENT TO CONFIRM YOUR ORDERS");
                        Order o1 = new Order();
                        o1.order();
                        Enquiry e1 = new Enquiry();
                        e1.enquiry();
                        break OUTER;
                        }
                    default -> System.out.println("Invalid input .. Try again ");
                }
            }

	}
}