package invoiceGeneratorPracticeProblem;

public class MainInvoiceGenerator {
	private static final int costPerMinute = 1;
	private static final double CostPerKilometer = 10;
	private static final double minimumFare = 5;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * CostPerKilometer + time * costPerMinute;
		if (totalFare < minimumFare)
			return minimumFare;
		return totalFare;
	}

	public double calculateFare(Rides[] rides) {
		double totalFare = 0;
		for (Rides ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return totalFare;
	}
}
