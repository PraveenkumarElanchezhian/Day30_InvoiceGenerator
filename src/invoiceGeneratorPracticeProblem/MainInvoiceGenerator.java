package invoiceGeneratorPracticeProblem;

public class MainInvoiceGenerator {
	private static final int costPerMinute = 1;
	private static final double CostPerKilometer = 10;

	public double calculateFare(double distance, int time) {
		return distance * CostPerKilometer + time * costPerMinute;
	}
}
