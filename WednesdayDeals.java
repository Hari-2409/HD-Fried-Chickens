

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

 class WednesdayDeals {
        @SuppressWarnings("unused")
	void Wed() {
		Scanner s = new Scanner(System.in);
		Calendar calendar = new GregorianCalendar();
		int day = calendar.get(Calendar.DAY_OF_WEEK);

		if (day == 4) {
			System.out.println("You have selected WEDNESDAY DEALS👌👌");
			wed w2 = new wed();
            w2.wedoff();
			System.out.print("Select your dishes :");

		} else {
			System.out.println("Sorry ! Today is not wednesday😔😔");
			System.out.println("Yet you can view the dishes.");

			System.out.println("1.View the deals");
			System.out.println("2.Exit");
			int a = s.nextInt();
                    switch (a) {
                        case 1 -> {
                            wed w2 = new wed();
                            w2.wedoff();
                            Menu m = new Menu();
                            m.menus();
                            FullList f1 = new FullList();
                            f1.full();
                        }
                        case 2 -> System.out.println("Thank you ! Visit again🙏🙏");
                        default -> System.out.println("Invalid input ! Try again");
                    }

		}
	}

}
