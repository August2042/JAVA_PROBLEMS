package comaparatorAndcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
	private String product_name;
	private double product_price;

	// Default constructor
	public Product() {
		super();
	}

	// Parameterized constructor
	public Product(String product_name, double product_price) {
		super();
		this.product_name = product_name;
		this.product_price = product_price;
	}

	// Getter for product_name
	public String getProduct_name() {
		return product_name;
	}

	// Setter for product_name
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	// Getter for product_price
	public double getProduct_price() {
		return product_price;
	}

	// Setter for product_price
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	// Override toString() method to provide a custom string representation
	@Override
	public String toString() {
		return "Product [product_name=" + product_name + ", product_price=" + product_price + "]";
	}

	// Implementing the compareTo method to define how products should be compared
	// based on their prices
	@Override
	public int compareTo(Product o) {
		// Compare products based on their prices
		return (int) (this.product_price - o.product_price);
	}
}

public class App10 {

	public static void main(String[] args) {
		// Create a list of Product objects
		List<Product> obj = new ArrayList<>();
		obj.add(new Product("Television", 55000));
		obj.add(new Product("Refrigerator", 50000));
		obj.add(new Product("Washing Machine", 45000));
		obj.add(new Product("Microwave Oven", 10000));
		obj.add(new Product("Air Conditioner", 60000));

		// Sort the list of products based on their prices
		Collections.sort(obj);

		// Print the sorted list of products

		for (Product products : obj) {
			System.out.println(products);
		}
	}
}

