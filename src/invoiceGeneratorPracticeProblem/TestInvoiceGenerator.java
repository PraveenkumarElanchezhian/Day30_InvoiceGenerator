package invoiceGeneratorPracticeProblem;

import org.junit.Assert;
import org.junit.Test;

public class TestInvoiceGenerator {
// Calc Fare of one ride ::	
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		MainInvoiceGenerator invoiceGenerator = new MainInvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

// Calc Fare of one ride ::	
	@Test
	public void givenLessDistanceORTime_ShouldReturnTotalFare() {
		MainInvoiceGenerator invoiceGenerator = new MainInvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

// Calc Fare of multiple ride ::	
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		MainInvoiceGenerator invoiceGenerator = new MainInvoiceGenerator();
		Rides[] rides = { new Rides(2.0, 5), new Rides(0.1, 1) };
		double fare = invoiceGenerator.calculateFare(rides);
		Assert.assertEquals(30, fare, 0.0);
	}

// Invoice Summary ::
	@Test
	public void MultipleRides_ShouldReturnTotalFare() {
		MainInvoiceGenerator invoiceGenerator = new MainInvoiceGenerator();
		Rides[] rides = { new Rides(2.0, 5), new Rides(0.1, 1) };
		InvoiceSummary Summary = invoiceGenerator.CalcFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInvoiceSummary, Summary);
	}
}