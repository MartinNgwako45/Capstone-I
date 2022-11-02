/** Java program made up of a persons class, containing an attribute, constructor, getter method, 
 *	setter method and a toString method.
 */

public class PersonsClass {
	/** attributes */
	private String surname;
	private String name;
	private String contactNumber;
	private String emailAddress;
	private String physicalAddress;



	/** Method constructor */
	public PersonsClass(String surname, String name, String contactNumber, String emailAddress, String physicalAddress){
		this.surname = surname;
		this.name = name; 
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
		this.physicalAddress = physicalAddress;

	}

	/** Accessory / getter methods */	  
	public String getSurname(){
		return surname;
	}
	public String getContactNumber(){
		return contactNumber;
	}

	public String getName(){
		return name;
	}

	public String getEmail(){
		return emailAddress;
	}

	public String getPhysicalAddress(){
		return physicalAddress;
	}

	/** Accessory / setter methods */
	public void setSurname(String surname){
		this.surname = surname;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setContactNumber(String contactNumber){
		this.contactNumber = contactNumber;
	}

	public void setEmailAddress(String email){
		this.emailAddress = email;
	}

	public void setPhysicalAddress(String physicalAddress){
		this.physicalAddress = physicalAddress;
	}

	/** The toString method */
	public String toString(){
		return "Surname: "+surname +
				"\nName: "+ name +
				"\nContact Number: " + contactNumber +
				"\nEmail Address: "+ emailAddress +
				"\nPysical Address: "+ physicalAddress;

	}
	/** method to format the data for the file */
	public String toFile(){
		return surname + ", "+ name + ", "+ contactNumber + ", "+emailAddress + ", "
				+physicalAddress;

	}

}
