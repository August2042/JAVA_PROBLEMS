package oopsJava;

// Define the PaymentGateway interface with two abstract methods: processPayment and refundPayment
interface PaymentGateway {
	void processPayment(); // Abstract method for processing payments

	void refundPayment(); // Abstract method for refunding payments
}

// Implementation for PayPal payment gateway
class Paypal implements PaymentGateway {
	double processingAmount; // Amount to be processed
	double refundAmount; // Amount to be refunded

	// Constructor to set processing and refund amounts
	Paypal(double processingAmount, double refundAmount) {
		this.processingAmount = processingAmount;
		this.refundAmount = refundAmount;
	}

	// Implement the processPayment method for PayPal
	public void processPayment() {
		System.out.println("Processing payment of Rs." + processingAmount + " via PayPal.");
		System.out.println("Payment successful via PayPal.");
	}

	// Implement the refundPayment method for PayPal
	public void refundPayment() {
		System.out.println("Refunding payment of Rs." + refundAmount + " via PayPal.");
		System.out.println("Refund successful via PayPal.");
	}
}

// Implementation for Stripe payment gateway
class Stripe implements PaymentGateway {
	double processingAmount; // Amount to be processed
	double refundAmount; // Amount to be refunded

	// Constructor to set processing and refund amounts
	Stripe(double processingAmount, double refundAmount) {
		this.processingAmount = processingAmount;
		this.refundAmount = refundAmount;
	}

	// Implement the processPayment method for Stripe
	public void processPayment() {
		System.out.println("Processing payment of Rs." + processingAmount + " via Stripe.");
		System.out.println("Payment successful via Stripe.");
	}

	// Implement the refundPayment method for Stripe
	public void refundPayment() {
		System.out.println("Refunding payment of Rs." + refundAmount + " via Stripe.");
		System.out.println("Refund successful via Stripe.");
	}
}

// Main class to demonstrate interface and class implementations
public class LMS_Q2 {
	public static void main(String[] args) {

		// Create an instance of the Paypal class with specific amounts
		Paypal obj1 = new Paypal(1000, 800);

		// Create an instance of the Stripe class with specific amounts
		Stripe obj2 = new Stripe(2000, 1800);

		// Demonstrate PayPal payment processing and refunding
		System.out.println("PayPal Gateway:");
		obj1.processPayment();
		obj1.refundPayment();

		// Demonstrate Stripe payment processing and refunding
		System.out.println("\nStripe Gateway:");
		obj2.processPayment();
		obj2.refundPayment();
	}
}
