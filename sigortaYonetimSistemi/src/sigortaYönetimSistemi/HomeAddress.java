package sigortaYönetimSistemi;

public class HomeAddress implements Address {
	private String street;
	private String city;
	private String country;

	public HomeAddress(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}

	@Override
	public String getAddressInfo() {
		return "Home Address: " + street + ", " + city + ", " + country;
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
