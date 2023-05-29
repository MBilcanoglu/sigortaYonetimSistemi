package sigortaYönetimSistemi;

public class BusinessAddress implements Address {
	private String street;
	private String city;
	private String country;

	public BusinessAddress(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String getAddressInfo() {
		return "Business Address: " + street + ", " + city + ", " + country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
