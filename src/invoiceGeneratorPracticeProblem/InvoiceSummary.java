package invoiceGeneratorPracticeProblem;

public class InvoiceSummary {
	private final int nomOfRides;
	private final double totalFare;
	private final double averageFare;

	public InvoiceSummary(int nomOfRides, double totalFare) {
		this.nomOfRides = nomOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.nomOfRides;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		InvoiceSummary that = (InvoiceSummary) o;
		return nomOfRides == that.nomOfRides && Double.compare(that.totalFare, totalFare) == 0
				&& Double.compare(that.averageFare, averageFare) == 0;
	}
}
