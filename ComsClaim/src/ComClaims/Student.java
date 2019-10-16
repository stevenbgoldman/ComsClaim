package ComClaims;

public class Student
{

	private String lastName;
	private String firstName;
	private int ageOf;
	private String phoneNumber;
	private String addressLine1;
	private String addressLine2;
	private String addressCity;
	private int addressZipCode;
	private int addressZipCode4;
	
	
	 public Student() 
	{
		
	}
	 
	 
	 public Student (String firstName, String lastName) 
	 {
		 this.setFirstName(firstName);
		 this.setLastName(lastName);
	 }


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAgeOf() {
		return ageOf;
	}


	public void setAgeOf(int ageOf) {
		this.ageOf = ageOf;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getAddressZipCode4() {
		return addressZipCode4;
	}


	public void setAddressZipCode4(int addressZipCode4) {
		this.addressZipCode4 = addressZipCode4;
	}


	public int getAddressZipCode() {
		return addressZipCode;
	}


	public void setAddressZipCode(int addressZipCode) {
		this.addressZipCode = addressZipCode;
	}


	public String getAddressCity() {
		return addressCity;
	}


	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	} 
}
