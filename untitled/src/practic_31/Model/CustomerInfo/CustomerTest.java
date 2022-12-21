package practic_31.Model.CustomerInfo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CustomerTest {
	@Test
	void getFirstName() {
		Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
		assertEquals("first", customer.getFirstName());
	}

	@Test
	void getAge() {
		Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
		assertEquals(25, customer.getAge());
	}

	@Test
	void getAddress() {
		Customer customer = new Customer("first", "last", 25, new Address("String cityName", 225, "String streetName", 2, 'c', 12));
		assertEquals(new Address("String cityName", 225, "String streetName", 2, 'c', 12), customer.getAddress());
	}
}
