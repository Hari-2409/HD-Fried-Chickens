

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
 class FullList {

	void full() {
		Scanner name = new Scanner(System.in);
		System.out.println("Welcome to the menulist of HD FOOD ORDER");
		System.out.println("Enjoy your meals");
		System.out.print("Select the menu you wish to view :");

		int c = name.nextInt();
		switch (c) {
		case 1 -> {
                    WednesdayDeals w1 = new WednesdayDeals();
                    w1.Wed();
                    Calendar calendar = new GregorianCalendar();
                    int day = calendar.get(Calendar.DAY_OF_WEEK);
                    if (day == 4) {
                        weddish a = new weddish();
                        a.dishw();
                    } else {
                        System.out.println("");
                        Menu m = new Menu();
                        m.menus();
                        FullList f1 = new FullList();
                        f1.full();
                        
                    }
                }
		case 2 -> {
                    GoldEdition g1 = new GoldEdition();
                    g1.gold();
                    golddish b = new golddish();
                    b.dishg();
                }
		case 3 -> {
                    VarietyBuckets v1 = new VarietyBuckets();
                    v1.vabu();
                    vardish cc = new vardish();
                    cc.dishv();
                }
		case 4 -> {
                    ChickenBuckets c1 = new ChickenBuckets();
                    c1.Chick();
                    chickdish cd = new chickdish();
                    cd.dishc();
                }
		case 5 -> {
                    BoxMeals m1 = new BoxMeals();
                    m1.meal();
                    boxdish b1 = new boxdish();
                    b1.dishb();
                }
		case 6 -> {
                    Burger b3 = new Burger();
                    b3.Burg();
                    burgdish f = new burgdish();
                    f.dishb();
                }
		case 7 -> {
                    Snacks s1 = new Snacks();
                    s1.snack();
                    sndish g = new sndish();
                    g.dishs();
                }
		case 8 -> System.out.println("Thank you ! Visit again !");
		default -> {
                    System.out.println("Invalid input ! Try again ");
                    Menu m = new Menu();
                    m.menus();
                    FullList a = new FullList();
                    a.full();
                }

		}

	}
}
