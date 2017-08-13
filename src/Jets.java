
public class Jets {
	private String jetName;
	private double jetSpeed;
	private double jetRange;
	private double jetPrice;
	private double mach;
	private Pilots pilot;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jets [jetName=");
		builder.append(jetName);
		builder.append(", jetSpeed=");
		builder.append(jetSpeed);
		builder.append(", jetRange=");
		builder.append(jetRange);
		builder.append(", jetPrice=");
		builder.append(jetPrice);
		builder.append(", mach=");
		builder.append(mach);
		builder.append(", pilot=");
		builder.append(pilot);
		builder.append("]");
		return builder.toString();
	}

	public String getJetName() {
		return jetName;
	}

	public void setJetName(String jetName) {
		this.jetName = jetName;
	}

	public double getJetSpeed() {
		return jetSpeed;
	}

	public void setJetSpeed(double jetSpeed) {
		this.jetSpeed = jetSpeed;
	}

	public double getJetRange() {
		return jetRange;
	}

	public void setJetRange(double jetRange) {
		this.jetRange = jetRange;
	}

	public double getJetPrice() {
		return jetPrice;
	}

	public void setJetPrice(double jetPrice) {
		this.jetPrice = jetPrice;
	}

	public double getMach() {
		return mach;
	}

	public void setMach(double mach) {
		this.mach = mach;
	}

	public Pilots getPilot() {
		return pilot;
	}

	public void setPilot(Pilots pilot) {
		this.pilot = pilot;
	}

	public Jets() {
		this.jetName = " ";
		this.jetSpeed = 0.0;
		this.jetRange = 0.0;
		this.jetPrice = 0.0;
		this.mach = 0.0;
	}

	public Jets(String jetName, double jetSpeed, double jetRange, double jetPrice) {
		super();
		this.jetName = jetName;
		this.jetSpeed = jetSpeed;
		this.jetRange = jetRange;
		this.jetPrice = jetPrice;

	}

}