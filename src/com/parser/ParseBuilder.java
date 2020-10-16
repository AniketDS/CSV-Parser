package com.parser;

public class ParseBuilder {
	private String name = "";
	private String phone_no = "";
	private String email = "";
	private String apartmentNumber = "";
	private String landmark = "";
	private String city = "";
	private String state = "";
	private String pincode = "";
	
	public ParseBuilder()
	{
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.apartmentNumber = apartmentNumber;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
	}

	public ParseBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public ParseBuilder setPhone_no(String phone_no) {
		this.phone_no = phone_no;
		return this;
	}

	public ParseBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public ParseBuilder setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
		return this;
	}

	public ParseBuilder setLandmark(String landmark) {
		this.landmark = landmark;
		return this;
	}

	public ParseBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public ParseBuilder setState(String state) {
		this.state = state;
		return this;
	}

	public ParseBuilder setPincode(String pincode) {
		this.pincode = pincode;
		return this;
	}
	
	public Parse getDetails()
	{
		return new Parse(name, phone_no, email, apartmentNumber, landmark, city, state, pincode);
	}

}
