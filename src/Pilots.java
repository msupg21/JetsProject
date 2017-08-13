
public class Pilots {

	private String pilotName;
	private int flightHours;

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public int getFlightHours() {
		return flightHours;
	}

	public void setFlightHours(int flightHours) {
		this.flightHours = flightHours;
	}

	public Pilots(String pilotName, int flightHours) {
		this.pilotName = pilotName;
		this.flightHours = flightHours;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot name = ");
		builder.append(pilotName);
		builder.append(", flight Hours = ");
		builder.append(flightHours);
		return builder.toString();
	}

}
