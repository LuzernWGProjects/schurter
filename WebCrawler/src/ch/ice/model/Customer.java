package ch.ice.model;

/**
 * @author Marco
 *
 */
public class Customer {
	
	private String customerID;
	private String customerName;
	private String countryCode;
	private String countryName;
	private String zipCode;
	private String customerNameShort;
	private Website customersWebsite;
	
	public String getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public String getCustomerNameShort() {
		return customerNameShort;
	}
	
	public void setCustomerNameShort(String customerNameShort) {
		this.customerNameShort = customerNameShort;
	}

	public Website getCustomersWebsite() {
		return customersWebsite;
	}

	public void setCustomersWebsite(Website customersWebsite) {
		this.customersWebsite = customersWebsite;
	}
	
	@Override
	public String toString() {
		return "Customer ID: "+this.getCustomerID()+"; Customer Name: "+this.getCustomerName()+"; Customer Zipcode: "+this.getZipCode()+";";
	}
}
