import java.text.DecimalFormat;

public class Hanger {

	public static DecimalFormat money = new DecimalFormat("0.00");
	public static DecimalFormat mach = new DecimalFormat("0.00");
	public static DecimalFormat range = new DecimalFormat("0.00");
	Jets jets[];

	public Hanger() {
		jets = new Jets[5];
		String[] jetModel = { "Booger Dropper", "Poop Machine", "Horny Hornet", "Blue Falcon", "Article 15 Fighter" };
		double[] jetPrice = { 54623434, 45033000, 34325522, 26233344, 42232222 };
		double[] jetSpeed = { 4.3, 3.2, 3.54, 3.21, 3.1 };
		double[] jetRange = { 3444, 3451, 6332, 5232, 2344 };
		String[] jetPilot = { "Harambe", "Marty Mcfly", "Dirty Harry", "Tyler Durden", "Tony Montana" };
		int[] flightHours = { 1_090_000_111, 5322, 4222, 5532, 9924 };

		for (int i = 0; i < 5; i++) {
			Pilots p1 = new Pilots(jetPilot[i], flightHours[i]);
			Jets j = new Jets(jetModel[i], jetSpeed[i], jetRange[i], jetPrice[i]);
			j.setPilot(p1);
			jets[i] = j;

		}

	}

	public void listFleet() {
		Jets[] j = getJets();
		System.out.println("Here is what exist in your hanger: ");
		for (int counter = 0; counter < j.length; counter++) {
			System.out.println();
			System.out.println(j[counter].getJetName() + "\n" + "Price $"
					+ (new DecimalFormat("0.00").format(j[counter].getJetPrice())) + "\t\tTop speed(Mach) "
					+ (new DecimalFormat("0.00").format(j[counter].getJetSpeed())) + "\t\tJet range(miles) "
					+ (new DecimalFormat("0.00").format(j[counter].getJetRange())));
			System.out.println("This jet is operated by: " + j[counter].getPilot());
		}
		System.out.println();
	}

	public void viewFastest() {
		System.out.println("Here is all you need to know about the fastest jet!");
		Jets[] jetsTemp = getJets();
		Jets max = jetsTemp[0];
		for (int counter = 0; counter < jetsTemp.length; counter++) {
			if (jetsTemp[counter].getJetSpeed() > max.getJetSpeed()) {
				max = jetsTemp[counter];
			}
		}
		System.out.println();
		System.out.println(max.getJetName());
		System.out.println(max.getPilot());
		System.out.println();
		System.out.println("Range in miles: " + (new DecimalFormat("0.00").format(max.getJetRange())));
		System.out.println("Price $" + (new DecimalFormat("0.00").format(max.getJetPrice())) + "\nJet speed in Mach: "
				+ (new DecimalFormat("0.00").format(max.getJetSpeed())));
		System.out.println();
	}

	public void viewLongest() {
		System.out.println("Here is all you need to know about the jet with best range!");
		Jets[] jetsTemp = getJets();
		Jets max = jetsTemp[0];
		for (int counter = 0; counter < jetsTemp.length; counter++) {
			if (jetsTemp[counter].getJetRange() > max.getJetRange()) {
				max = jetsTemp[counter];
			}
		}
		System.out.println();
		System.out.println(max.getJetName());
		System.out.println(max.getPilot());
		System.out.println();
		System.out.println("Range in miles: " + (new DecimalFormat("0.00").format(max.getJetRange())));
		System.out.println("Price $" + (new DecimalFormat("0.00").format(max.getJetPrice())) + "\nJet speed in Mach: "
				+ (new DecimalFormat("0.00").format(max.getJetSpeed())));
		System.out.println();
	}

	public void addJet(Jets j) {
		Jets[] add = new Jets[jets.length + 1];
		for (int i = 0; i < jets.length; i++) {
			add[i] = jets[i];

		}

		add[add.length - 1] = j;
		jets = add;
	}

	public Jets[] getJets() {
		return jets;
	}

	public void setJets(Jets[] jets) {
		this.jets = jets;
	}

}
