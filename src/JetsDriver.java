import java.util.Scanner;

public class JetsDriver {

	Hanger h1 = new Hanger();

	public static void main(String[] args) {
		JetsDriver app = new JetsDriver();
		app.run();

	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		int choice = 0;

		while (choice != 5) {
			System.out.println("\u2708" + "\t\u2708"+"\t\u2708" + "\t\u2708"+ "\t\u2708");
			System.out.println("******* Welcome to Jets *******");
			System.out.println("Select from the following options");
			System.out.println();
			System.out.println("(1) List fleet");
			System.out.println("(2) View fastest jet");
			System.out.println("(3) View jet with longest range");
			System.out.println("(4) Add a new pilot and jet to the fleet");
			System.out.println("(5) Quit");
			choice = kb.nextInt();
			if (choice == 1) {
				h1.listFleet();
			} else if (choice == 2) {
				h1.viewFastest();
			} else if (choice == 3) {
				h1.viewLongest();
			} else if (choice == 4) {
				addJet();
			} else if (choice == 5) {
				System.out.println("\nLater nerd");
			}

		}
	}

	public void addJet() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the name of your jet");
		String jetModel = kb.nextLine();
		System.out.println("What is the top speed of your jet?");
		double jetSpeed = kb.nextDouble();
		double mach = jetSpeed * 0.001349;
		jetSpeed = mach;
		System.out.println("What is the top range of your jet?");
		double jetRange = kb.nextDouble();
		System.out.println("What is the price of your jet?");
		double jetPrice = kb.nextDouble();
		System.out.println("What is your pilots first name?");
		String firstName = kb.next();
		System.out.println("What is your pilots last name?");
		String lastName = kb.next();
		String jetPilot = firstName + " " + lastName;
		System.out.println("How many flight hours does your pilot have?");
		int flightHours = kb.nextInt();
		System.out.println("*************************************");
		System.out.println("Your new jet and pilot has been added!!!");

		Pilots p1 = new Pilots(jetPilot, flightHours);
		Jets j = new Jets(jetModel, jetSpeed, jetRange, jetPrice);
		j.setPilot(p1);
		h1.addJet(j);

	}

}
