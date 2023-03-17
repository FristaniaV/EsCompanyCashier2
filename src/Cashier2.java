import java.util.Scanner;

public class Cashier2 {

	public Cashier2() {
		String menu;
		int quantity;
		float money, total1, total2, total3;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("ES Companies Portal - Cashier App 2");
			System.out.println("===================================");
			System.out.println("1. Keyboard - $49.99");
			System.out.println("2. Mouse - $19.99");
			System.out.println("3. Monitor - $99.99");
			System.out.println("4. Exit");
			System.out.println("Choose: ");
			menu = scan.nextLine();

			if (menu.equalsIgnoreCase("Keyboard")) {
				do {
					System.out.println("Input Quantity [1...20]: ");
					quantity = scan.nextInt();
					scan.nextLine();
					if (quantity < 0 || quantity > 20) {
						System.out.println("Out of Stock!\n");
						System.out.println("Thanks for using this application :D");
					}
				} while (quantity < 0 || quantity > 20);

				System.out.println("Item's name: Keyboard");
				System.out.println("Price: 49.99");
				System.out.println("Quantity: " + quantity);
				total1 = (float) (quantity * 49.99);
				System.out.println("Total: " + total1);

				do {
					System.out.println("Input your money [min: " + total1 + "]: ");
					money = scan.nextFloat();
					scan.nextLine();
				} while (money < total1);

				System.out.println("Change: " + (float) (money - total1));

			} else if (menu.equalsIgnoreCase("Mouse")) {
				do {
					System.out.println("Input Quantity [1...20]: ");
					quantity = scan.nextInt();
					scan.nextLine();
					if (quantity < 0 || quantity > 20) {
						System.out.println("Out of Stock!\n");
						System.out.println("Thanks for using this application :D");
					}
				} while (quantity < 0 || quantity > 20);

				System.out.println("Item's name: Mouse");
				System.out.println("Price: 19.99");
				System.out.println("Quantity: " + quantity);
				total2 = (float) (quantity * 19.99);
				System.out.println("Total: " + total2);

				do {
					System.out.println("Input your money [min: " + total2 + "]: ");
					money = scan.nextFloat();
					scan.nextLine();
				} while (money < total2);

				System.out.println("Change: " + (float) (money - total2));

			} else if (menu.equalsIgnoreCase("Monitor")) {
				do {
					System.out.println("Input Quantity [1...20]: ");
					quantity = scan.nextInt();
					scan.nextLine();
					if (quantity < 0 || quantity > 20) {
						System.out.println("Out of Stock!\n");
						System.out.println("Thanks for using this application :D");
					}
				} while (quantity < 0 || quantity > 20);

				System.out.println("Item's name: Monitor");
				System.out.println("Price: 99.99");
				System.out.println("Quantity: " + quantity);
				total3 = (float) (quantity * 99.99);
				System.out.println("Total: " + total3);

				do {
					System.out.println("Input your money [min: " + total3 + "]: ");
					money = scan.nextFloat();
					scan.nextLine();
				} while (money < total3);

				System.out.println("Change: " + (float) (money - total3));

			}

		} while (!menu.equalsIgnoreCase("Exit"));

		scan.close();

	}

	public static void main(String[] args) {
		new Cashier2();

	}

}
