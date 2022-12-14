package practic_13.Num_3;

import java.util.StringTokenizer;

public class Address {
	private String country;
	private String region;
	private String city;
	private String street;
	private String house;
	private String housing;
	private String flat;

	public void Split(String address) {
		String[] array = address.split(",");
		this.country = array[0];
		this.region = array[1];
		this.city = array[2];
		this.street = array[3];
		this.house = array[4];
		this.housing = array[5];
		this.flat = array[6];
	}

	public void Tokenizer(String address) {
		StringTokenizer tokenizer = new StringTokenizer(address, " ,.;");
		this.country = tokenizer.nextToken();
		this.region = tokenizer.nextToken();
		this.city = tokenizer.nextToken();
		this.street = tokenizer.nextToken();
		this.house = tokenizer.nextToken();
		this.housing = tokenizer.nextToken();
		this.flat = tokenizer.nextToken();
	}
	@Override
	public String toString() {
		return "Address{" +
				"country='" + country + '\'' +
				", region='" + region + '\'' +
				", city='" + city + '\'' +
				", street='" + street + '\'' +
				", house='" + house + '\'' +
				", housing='" + housing + '\'' +
				", flat='" + flat + '\'' +
				'}';
	}
}
