/** Java program made up of a project class, containing an attribute, constructor, getter method, 
 *	setter method and a toString method.
 */

public class ProjectClass {

	/** Attributes */
	private int projectNumber;
	private String projectName;
	private String buildingType;
	private String physicalAddress;
	private String erfNumber;
	private double totalFeeCharge;
	private double totalAmountPaid;
	private String projectDeadline;
	private String no;

	/** person objects */
	private PersonsClass contractor;
	private PersonsClass customer;
	private PersonsClass architect;


	/** constructor */
	public ProjectClass(int ProjectNumber, String projectName, String buildingType, String physicalAddress,String erfNumber, double totalFeeCharge, 
			double totalAmountPaid, String projDeadline, PersonsClass contractor, PersonsClass customer, PersonsClass architect, String No){
		this.projectNumber = ProjectNumber;
		this.projectName = projectName; 
		this.buildingType = buildingType;
		this.physicalAddress = physicalAddress;
		this.erfNumber = erfNumber;
		this.totalFeeCharge = totalFeeCharge;
		this.totalAmountPaid = totalAmountPaid;
		this.projectDeadline = projDeadline;
		this.contractor = contractor;
		this.customer = customer;
		this.architect = architect;
		this.no = No;

	}



	/** Accessory / getter methods */	
	public PersonsClass getContractor() {
		return contractor;
	}

	public PersonsClass getCustomer() {
		return customer;
	}

	public PersonsClass getArchitect() {
		return architect;
	}



	public int getProjectNumber(){
		return projectNumber;
	}

	public String getprojectName(){
		return projectName;
	}
	public String getProjectDateline(){
		return projectDeadline;
	}

	public String getbuildingType(){
		return buildingType;
	}

	public String getphysicalAddress(){
		return physicalAddress;
	}

	public String geterfNumber(){
		return erfNumber;
	}

	public double getTotalAmount() {
		return 	totalAmountPaid;
	}

	public double getTotalFeeCharge() {
		return totalFeeCharge;
	}

	public String getNo() {
		return no;
	}


	/** Accessory / setter methods */	
	public void setProjectNumber(int projectNumber){
		this.projectNumber = projectNumber;
	}

	public void setProjectName(String projectname){
		this.projectName = projectname;
	}

	public void setErfNumber(String erfNumber){
		this.erfNumber = erfNumber;
	}

	public void setBuildingType(String buildingType){
		this.buildingType = buildingType;
	}

	public void setPhysicalAddress(String physicalAddress){
		this.physicalAddress = physicalAddress;
	}

	public void setTotalAmount(double totalamountpaid){
		this.totalAmountPaid = totalamountpaid;
	}

	public void setTotalFeeCharge(double totalfeecharge) {
		this.totalFeeCharge = totalfeecharge;
	}

	public void setProjectDeadline(String projectdeadline){
		this.projectDeadline = projectdeadline;
	}

	public void setCustomer(PersonsClass costomer) {
		this.customer = costomer;
	}

	public void setNo(String No) {
		this.no = No;
	}


	/** The toString method */
	public String toString(){
		return "Project Number: "+ projectNumber +
				"\nProject Name: "+ projectName +
				"\nType of building: " + buildingType +
				"\nPhysical Address: "+ physicalAddress +
				"\nERF Number: "+ erfNumber +
				"\nTotal Fee Charge R"+ totalFeeCharge +
				"\nTotal Amount: R"+ totalAmountPaid +
				"\nProject Dateline: "+ projectDeadline +
				"\nMark Task Com/Uncom: "+ no +
				"\n\nContractor Details\n==================\n\n"+ contractor +
				"\n\nCustomer Details\n================\n\n"+ customer +
				"\n\nArchitect Details\n=================\n\n"+ architect;




	}

	/** method to format the data for the file */
	public String toFile(){
		return projectNumber + ", "+ projectName + ", "+ buildingType + ", "+ physicalAddress + ", "+erfNumber + ", "
				+totalFeeCharge + ", "+totalAmountPaid+ ", "+ projectDeadline+ ", "+
				contractor.toFile() + ", "+ customer.toFile() + ", "+ architect.toFile() + ", " + no;
	}

}
