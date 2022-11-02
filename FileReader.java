import java.util.*;
import java.io.*;

public class FileReader {
	private ProjectList proj;

	public FileReader(){

		/** Creating an object of the projectList */
		proj = ProjectList.getOnlyInstance();

	}

	@SuppressWarnings("unused")
	private static final String menu = null;


	public static String getStringData(String message){

		/** creating a scanner to get the message through the use of keyboard. */
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	private static int getIntData(String message){

		/** Handling any error inputed by the user in oder for the program not to scratch in do while
		 *	loop in other for the error message to keep displaying on the console until the user input
		 *	the correct message. 
		 */
		do{
			try{
				System.out.println(message);
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				int num = input.nextInt();
				if( num > 0)
					return num;
				else 
					System.out.println("Your number must be greater than 0");

			}
			catch(Exception e){
				System.out.println("Error, You have entered invalid input, Please try again.");
			}
		}while(true);
	}

	private  static double getDoubleData(String message){
		do{
			try{
				System.out.println(message);
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				double num = input.nextDouble();
				if( num > 0)
					return num;
				else 
					System.out.println("Your number must be greater than 0");
			}
			catch(Exception e){
				System.out.println("Error, You have entered invalid input, Please try again.");
			}
		}while(true);
	}

	public ProjectClass readUserInput(){
		int projectNumber = getIntData("Please enter the number of the project.");
		String projectName = getStringData("Please enter the name of the project.");
		String buildingType = getStringData("Please enter the type of the building for the project.\n"
				+ "House\n"
				+ "Apartment Block\n"
				+ "Store");
		String physicalAddress = getStringData("Please enter the physical address of the project.");
		String numberERF = getStringData("Please enter the ERF number of the project.");
		double totalFeeCharge = getDoubleData("Please enter the total fee beein charge of the project.");
		double totalAmountPaid =getDoubleData("Please enter the total amount paide  to date of the project.");
		String projectDeadline = getStringData("Please enter the deadline of the project YYYY/MM/DD.");
		String no = getStringData("Please enter Yes or No to mark the project complete or uncomplete");

		/** persons objects created. */
		System.out.println("capturing the Contractor details.\n================================\n");
		PersonsClass contractor = getPerson();
		System.out.println("\n");

		System.out.println("Capturing the Customer details. \n==============================");
		PersonsClass customer = getPerson();
		System.out.println("\n");

		System.out.println("Capturing the Architect details. \n==============================");
		PersonsClass architect = getPerson(); 
		System.out.println("\n");

		/** creating all the objects of ProjectForm */
		return new ProjectClass(projectNumber, projectName, buildingType, physicalAddress, numberERF, totalFeeCharge, 
				totalAmountPaid, projectDeadline, contractor, customer, architect, no);
	}

	private PersonsClass getPerson(){

		/** getPerson method of persons which are constructor, costumer and architect through the keyboard. */
		String surname = getStringData("Please enter the surname of the preson.");
		String name = getStringData("Please enter the name of the person.");
		String contactNumber = getStringData("Please enter the contact number of the person.");
		String emailAddress = getStringData("Please enter the email address of the person.");
		String physicalAddress = getStringData("Please enter the physical address of the person.");

		/** creating all the objects of persons */
		return new PersonsClass(surname, name, contactNumber, emailAddress, physicalAddress);
	}


	public void readFile(){
		try{
			File projectFile = new File("ProjectFile.txt");
			@SuppressWarnings("resource")
			Scanner input = new Scanner(projectFile);

			while(input.hasNext()){
				String line = input.nextLine();
				String dataList [] = line.split(", ");


				/** collecting customer data */
				String contSurname = dataList[8], contName = dataList[9], contContactNumber = dataList[10], contEmailAddress = dataList[11], contPhysicalAddres = dataList[12];
				/** creating an object of the contractor */
				PersonsClass contractor = new PersonsClass(contSurname, contName, contContactNumber, contEmailAddress, contPhysicalAddres);

				/** collecting customer data */
				String custSurname = dataList[13], custName = dataList[14], custContactNumber = dataList[15], custEmailAddress = dataList[16], custPhysicalAddres = dataList[17];
				/** creating an object of the customer */
				PersonsClass customer = new PersonsClass(custSurname, custName, custContactNumber, custEmailAddress, custPhysicalAddres);

				/** collecting customer data */
				String archSurname = dataList[18], archName = dataList[19], archContactNumber = dataList[20], archEmailAddress = dataList[21], archPhysicalAddres = dataList[22];

				/** creating an object of the customer */
				PersonsClass architect = new PersonsClass(archSurname, archName, archContactNumber, archEmailAddress, archPhysicalAddres);


				/** collecting the projectForm information */
				int projectNumber = Integer.parseInt(dataList[0]); 
				String projectName = dataList[1], buildingType =dataList[2], physicalAddress = dataList[3], numberERF = dataList[4], projectDeadline = dataList[7], No = dataList[23]; 
				double totalFeeCharge = Double.parseDouble(dataList[5]);
				double totalAmountPaid = Double.parseDouble(dataList[6]); 

				/** creating the object of the driver */
				ProjectClass Project = new ProjectClass(projectNumber,  projectName,  buildingType, physicalAddress, numberERF, totalFeeCharge, totalAmountPaid, projectDeadline,  contractor, customer, architect, No);

				proj.addProject(Project);
			}

			/** exception error message */
		}catch(Exception e){
			System.out.println("Failed to complete the operation of reading data from the file.");
		}
	}

}
