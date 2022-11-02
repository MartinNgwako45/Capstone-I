/** calling all the methods of ProjectClass and personsClass inside the project main. */
/** importing all java.utill function */
/** I have tested my va (view all task) it working perfectly the name of the text file is ProjectFile.txt. */

import java.text.ParseException;
import java.util.*;

class Poised {

	@SuppressWarnings("unused")
	private static final String menu = null;


	public static String getStringData(String message){

		/** creating a scanner to get the message through the use of keyboard. */
		System.out.println(message);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	private static int getIntData(String message, int minValue){

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
				if( num > minValue)
					return num;
				else 
					System.out.println("Your number should be greater than " +  minValue);

			}
			catch(Exception e){
				System.out.println("Error, You have entered invalid input, kindly try again.");
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
					System.out.println("Your number should be greater than 0");
			}
			catch(Exception e){
				System.out.println("Error, You have entered invalid input, kindly try again.");
			}
		}while(true);
	}

	/** Main menu of the project */
	private static void menu(String menu){
		switch(menu){
		case "MAIN MENU":
			System.out.println("\n==== MAIN MENU ====\n===================\n"+
					"va.   View All Projects."+
					"\na .   Add New Project."+
					"\nup.   Update Project And Persons Info."+
					"\nfp.   Finalize The Projects."+
					"\ngr.   Generate Customer Receipt."+
					"\ndl.   Deleting A Projects."+
					"\ne .   Exit.");

			break;

			/** Sub menu 1 performs the action of editing all the project details */
		case "Update Menu":
			System.out.println( "\n================ M E N U ================ \n"
					+ "\n Please enter 1 to change the project number."
					+ "\n Please enter 2 to change the project name."
					+ "\n Please enter 3 to change the building type."
					+ "\n Please enter 4 to change the physical address of the project."
					+ "\n Please enter 5 to change the erf number of the project."
					+ "\n Please enter 6 to change the total fee charge of the project."
					+ "\n Please enter 7 to change the total amount of the fee paid to the project."
					+ "\n Please enter 8 to change the Deadline of the project."
					+ "\n Please enter 9 to change the details of the contractor."
					+ "\n Please enter 10 to change the details of the customer."
					+ "\n Please enter 11 to change the details of the architect.");

			break;

			/** Sub menu 2 performs the action of editing all the contractor details */
		case "Update Menue2":
			System.out.println("Please enter new contractor details below\n=========================================\n");
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Kindly enter 1 to change the contractor name."
					+ "\n kindly enter 2 to change the contractor surname."
					+ "\n kindly enter 3 to change the contractor contact number."
					+ "\n kindly enter 4 to change the contractor email address."
					+ "\n kindly enter 5 to change the contractor physical address.");
			break;

			/** Sub menu 3 performs the action of editing all the customer details */
		case "Update Menue3":
			System.out.println("Kindly enter new customer details below\n=========================================\n");
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Kindly enter 1 to change the customer name."
					+ "\n Kindly enter 2 to change the customer surname."
					+ "\n Kindly enter 3 to change the customer contact number."
					+ "\n Kindly enter 4 to change the customer email address."
					+ "\n Kindly enter 5 to change the customer physical address.");
			break;

			/** Sub menu 4 performs the action of editing all the architect details */
		case "Update Menue4":
			System.out.println("Please enter new architect details below\n=========================================\n");
			System.out.println("\n================= M E N U =================: \n"
					+ "\n Kindly enter 1 to change the architect name."
					+ "\n Kindly enter 2 to change the architect surname."
					+ "\n Kindly enter 3 to change the architect contact number."
					+ "\n Kindly enter 4 to change the architect email address."
					+ "\n Kindly enter 5 to change the architect physical address.");
			break;

		}
	}

	/** getting the projectClass from the getString scanner through the keyboard and pass it in 
		each variable to be display to the console.
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private static ProjectClass getProjectForm(){
		int projectNumber = getIntData("Kindly enter the number of the project.", 0);
		String projectName = getStringData("Kindly enter the name of the project.");
		String buildingType = getStringData("Kindly enter the type of the building for the project.\n"
				+ "House\n"
				+ "Apartment Block\n"
				+ "Store");
		String physicalAddress = getStringData("Kindly enter the physical address of the project.");
		String numberERF = getStringData("Kindly enter the ERF number of the project.");
		double totalFeeCharge = getDoubleData("Kindly enter the total fee being charge of the project.");
		double totalAmountPaid =getDoubleData("Kindly enter the total amount paid  to date of the project.");
		String projectDeadline = getStringData("Kindly enter the deadline of the project YYYY/MM/DD.");
		String projCom = getStringData("Kindly enter Yes or No to mark the project complete or uncompleted");

		/** persons objects created.*/
		System.out.println("capturing the Contractor details.\n================================\n");
		PersonsClass contractor = getPerson();
		System.out.println("\n");

		System.out.println("Capturing the Customer details. \n==============================");
		PersonsClass customer = getPerson();
		System.out.println("\n");

		System.out.println("Capturing the Architect details. \n==============================");
		PersonsClass architect = getPerson(); 
		System.out.println("\n");

		/** creating all the objects of ProjectClass */
		return new ProjectClass(projectNumber, projectName, buildingType, physicalAddress, numberERF, totalFeeCharge, 
				totalAmountPaid, projectDeadline, contractor, customer, architect, projCom);
	}	    

	public static PersonsClass getPerson(){

		/** getPerson method of personsClass which are constructor, costumer and architect
			through the keyboard. 
		 */
		String surname = getStringData("Kindly enter the surname of the person.");
		String name = getStringData("Kindly enter the name of the person.");
		String contactNumber = getStringData("Kindly enter the contact number of the person.");
		String emailAddress = getStringData("Kindly enter the email address of the person.");
		String physicalAddress = getStringData("Kindly enter the physical address of the person.");

		/** creating all the objects of personsClass */
		return new PersonsClass(surname, name, contactNumber, emailAddress, physicalAddress);

	}   

	public static void main(String[] args) throws ParseException{

		FileReader reader = new FileReader();
		/** reading order information from the file.*/
		reader.readFile();

		FileWriter fwriter = new FileWriter();

		/** OrderList object to store a list of object */
		ProjectList proj = ProjectList.getOnlyInstance();

		do {


			/** creating a main menu for the project */
			menu("MAIN MENU");

			String mainMenue = getStringData("");

			/** if menu is equal to "up", onlyinstance which is proj.projectName to perform the action. */
			if(mainMenue.equalsIgnoreCase("up")) {
				proj.projectNames();

				/** getting the project number that you want to perform the changes from the list of project. */
				int projectNumb = getIntData("Select a project above by enter a project number you want to update:", -1);
				ProjectClass newPoject = proj.getProjectClass(projectNumb);
				menu("Update Menu");

				/** Initialize userinput.netInt() to update */
				int update = getIntData("", 0);

				/** getting and setting the project number of the project in order to perform the new changes of the
				 * 	project number of the project.
				 * */
				if (update == 1) {
					int newProjectNumber = getIntData("Enter the new project number.", -1);
					newPoject.setProjectNumber(newProjectNumber);	
					System.out.println(newPoject);

				}

				/** getting and setting the project name of the project in order to perform the new changes of the. 
				 * 	project name of the project.
				 * */
				else if (update == 2) {
					String newProjectName = getStringData("Enter the new name of the project");
					newPoject.setProjectName(newProjectName);	
					System.out.println(newPoject);

				}

				/** getting and setting the building type of the project in order to perform the new changes of the. 
				 * 	building type of the project.
				 */
				else if (update == 3) {
					String newBuildingType = getStringData("Enter the new building type of the project.");
					newPoject.setBuildingType(newBuildingType);	
					System.out.println(newPoject);
				}

				/** getting and setting the physical address of the project in order to perform the new changes of the. 
				 * 	physical address of the project.
				 */
				else if (update == 4) {
					String newPhysicalAddress = getStringData("Enter the new physical address of the project.");
					newPoject.setPhysicalAddress(newPhysicalAddress);	
					System.out.println(newPoject);

				}

				/** getting and setting the erf number of the project in order to perform the new changes of the. 
				 * 	erf number of the project.
				 * */
				else if (update == 5) {
					String newErfNumber = getStringData("Enter the new erf number of the project.");
					newPoject.setErfNumber(newErfNumber);	
					System.out.println(newPoject);

				}

				/** getting and setting the total fee charge of the project in order to perform the new changes of the
				 * 	total fee charge for the project.
				 * */
				else if (update == 6) {
					double newTotalFeeCharge = getDoubleData("Enter the new total fee charge of the project.");
					newPoject.setTotalFeeCharge(newTotalFeeCharge);	
					System.out.println(newPoject);

				}

				/** getting and setting the amount paid of the project in order to perform the new changes of the 
				 * 	amount paid of the project.
				 * */
				else if (update == 7) {
					double newAmount = getDoubleData("Enter the new amount fee paid.");
					newPoject.setTotalAmount(newAmount);
					System.out.println(newPoject);

				}

				/** getting and setting the deadline of the project in order to perform the new changes of the 
				 * 	deadline of the project.
				 * */
				else if (update == 8) {
					String newDeadline = getStringData("Enter the new Deadline of the project.");
					newPoject.setProjectDeadline(newDeadline);	
					System.out.println(newPoject);

				}

				/** updating the contractor */
				else if(update == 9) { 
					menu("Update Menue2");

					/** Initialize userinput.netInt() to update2 */
					int update2 = getIntData("", 0);

					/** getting and setting the contractor new name. */
					if (update2 == 1) {
						String newName = getStringData("Enter new contact number of the contractor");
						newPoject.getContractor().setName(newName);
						System.out.print(newPoject);

					}

					/** getting and setting the contractor new surname. */
					else if (update2 == 2) {
						String newSurname = getStringData("Enter new contact number of the contractor");
						newPoject.getContractor().setSurname(newSurname);
						System.out.print(newPoject);

					}

					/** getting and setting the contractor new contact number. */
					else if (update2 == 3) {
						String newContactNumber = getStringData("Enter new contact number of the contractor");
						newPoject.getContractor().setContactNumber(newContactNumber);
						System.out.print(newPoject);

					}

					/** getting and setting the contractor new email address. */
					else if (update2 == 4) {
						String newEmailAddress = getStringData("Enter new email address of the contractor");
						newPoject.getContractor().setEmailAddress(newEmailAddress);
						System.out.print(newPoject);

					}

					/** getting and setting the contractor new physical address. */
					else if (update2 == 5) {
						String newPhysicalAddress = getStringData("Enter new physical address of the contractor");
						newPoject.getContractor().setPhysicalAddress(newPhysicalAddress);
						System.out.println(newPoject);

					}

				}

				/** updating the customer. */
				else if(update == 10) {
					menu("Update Menue3");

					/** Initialize userinput.netInt() to update3 */
					int update3 = getIntData("", 0);

					/** getting and setting the customer new name. */
					if (update3 == 1) {
						String newName = getStringData("Enter new contact number of the customer");
						newPoject.getCustomer().setName(newName);
						System.out.print(newPoject);


					}

					/** getting and setting the customer new surname. */
					else if (update3 == 2) {
						String newSurname = getStringData("Enter new contact number of the customer");
						newPoject.getCustomer().setSurname(newSurname);
						System.out.print(newPoject);

					}

					/** getting and setting the customer new contact number. */
					else if (update3 == 3) {
						String newContactNumber = getStringData("Enter new contact number of the customer");
						newPoject.getCustomer().setContactNumber(newContactNumber);
						System.out.print(newPoject);

					}

					/** getting and setting the customer new email address. */
					else if (update3 == 4) {
						String newEmailAddress = getStringData("Enter new email address of the customer");
						newPoject.getCustomer().setEmailAddress(newEmailAddress);
						System.out.print(newPoject);

					}

					/** getting and setting the customer new physical address. */
					else if (update3 == 5) {
						String newPhysicalAddress = getStringData("Enter new physical address of the customer");
						newPoject.getCustomer().setPhysicalAddress(newPhysicalAddress);
						System.out.println(newPoject);

					}

				}

				/** updating the architect */
				else if(update == 11) {
					menu("Update Menue4");

					/** Initialize userinput.netInt() to update4 */
					int update4 = getIntData("", 0);

					/** getting and setting the architect new name. */
					if (update4 == 1) {
						String newName = getStringData("Enter new contact number of the architect");
						newPoject.getArchitect().setSurname(newName);
						System.out.print(newPoject);

					}

					/** getting and setting the architect new surname. */
					else if (update4 == 2) {
						String newSurname = getStringData("Enter new contact number of the architect");
						newPoject.getArchitect().setName(newSurname);
						System.out.print(newPoject);

					}

					/** getting and setting the architect new contact number. */
					else if (update4 == 3) {
						String newContactNumber = getStringData("Enter new contact number of the architect");
						newPoject.getArchitect().setContactNumber(newContactNumber);
						System.out.print(newPoject);

					}

					/** getting and setting the architect new email address. */
					else if (update4 == 4) {
						String newEmailAddress = getStringData("Enter new email address of the architect");
						newPoject.getArchitect().setEmailAddress(newEmailAddress);
						System.out.print(newPoject);

					}

					/** getting and setting the architect new physical address. */
					else if (update4 == 5) {
						String newPhysicalAddress = getStringData("Enter new physical address of the architect");
						newPoject.getArchitect().setPhysicalAddress(newPhysicalAddress);
						System.out.println(newPoject);

					}


				}


				/** updating the project list */
				proj.deleteProject(projectNumb);
				proj.addProject(newPoject);


			}

			/** option to view all the project assigned from the text file. */
			else if(mainMenue.equalsIgnoreCase("va")) {
				System.out.println(proj);

			}

			/** option to add project to the text file. */
			else if(mainMenue.equalsIgnoreCase("a")) {
				proj.addProject(reader.readUserInput());



			}

			/** option to generate report of the project. */
			else if(mainMenue.equalsIgnoreCase("fp")) {
				proj.projectNames();

				int projectNumb = getIntData("\nSelect a project above by entering a project number you want to finalize:", -1);
				ProjectClass project = proj.getProjectClass(projectNumb);

				/** getting the total fee charge of the project and the total amount paid to the project
				 * to get the total amount that is been paid by the customer to the project.
				 */
				double totalFee = project.getTotalFeeCharge();
				double totalPaid = project.getTotalAmount();
				double grandTotal = totalFee - totalPaid;

				/** generating the receipt of the customer by getting the customer details, the total fee charge,
				 *	and the total amount paid and the balance of the projectClass.
				 */
				System.out.println("Project Report. \n=================");
				String receipt = "Project Report. \n=================";
				System.out.println(project.getProjectNumber());
				String projNumber = Integer.toString(project.getProjectNumber());
				System.out.println(project.getprojectName());
				String projName = (project.getprojectName());
				System.out.println(project.getbuildingType());
				String projBuilding = (project.getbuildingType());
				System.out.println(project.getphysicalAddress());
				String projPhyAddress = (project.getphysicalAddress());
				System.out.println(project.geterfNumber());
				String projErfNumber = (project.geterfNumber());
				System.out.println(project.getProjectDateline());
				String projDeadline = (project.getProjectDateline());
				String projCom = (project.getNo());
				System.out.println("\nCustomer Details.\n=================\n");
				String custDet = "\nCustomer Details. \n=================";
				System.out.println(project.getCustomer());
				PersonsClass cusDetails  = (project.getCustomer());
				System.out.println("\nContractor Details.\n====================\n");
				String conDet = "\nContractor Details. \n=================";
				PersonsClass conDetails = (project.getContractor());
				System.out.println(project.getContractor());
				System.out.println("\nArchitect Details.\n==================\n");
				String arcDet = "\nArchitect Details. \n=================";
				PersonsClass aechDetails = (project.getArchitect());
				System.out.println(project.getArchitect());
				System.out.println("\n-------------------------------------------------------");
				String calculation = "\n-----------------------------------------------------";
				System.out.println("The total fee charge of the project is: R"+ project.getTotalFeeCharge());
				String feeCharge = "The total fee charge of the project is: R"+ project.getTotalFeeCharge();
				System.out.println("The total amount being paid of the project is: R"+ project.getTotalAmount());
				String totalAmount = "The total amount being paid of the project is: R"+ project.getTotalAmount();
				System.out.println("The total balance to be paid is: R"+ grandTotal);
				String total = "The total balance to be paid is: R"+ grandTotal;
				System.out.println("\n------------------------------------------------------");
				String close = "\n-----------------------------------------------------";

				/** generating the customer receipt to the text file. */
				fwriter.finalizeReport( "Completed project.txt",receipt + "\n" + projNumber + "\n" + projName + "\n" + projBuilding + "\n" + projPhyAddress + "\n" + projErfNumber +  
						"\n" + projDeadline + "\n" + projCom + "\n" + custDet + "\n" + conDetails + "\n" + conDet +"\n" + aechDetails + "\n" + arcDet +"\n" + cusDetails + "\n" + calculation + "\n" + feeCharge + "\n" + totalAmount + "\n" + total + "\n" + close);

			}

			/** option to finalize the project. */
			else if(mainMenue.equalsIgnoreCase("gr")) {
				proj.projectNames();

				/** selecting the project number you want to generate receipt. */
				int projectNumb = getIntData("Select a project above by entering a project number you want to generate the receipt:", -1);
				ProjectClass project = proj.getProjectClass(projectNumb);

				/** getting the total fee charge of the project and the total amount paid to the project
				 * to get the total amount that is been paid by the customer to the project.
				 */
				double totalFee = project.getTotalFeeCharge();
				double totalPaid = project.getTotalAmount();
				double grandTotal = totalFee - totalPaid;

				/** generating the receipt of the customer by getting the customer details, the total fee charge,
				 *	and the total amount paid and the balance of the projectForm.
				 */
				System.out.println("Customer Receipt. \n=================");
				String receipt = "Customer Receipt. \n=================";
				System.out.println(project.getProjectNumber());
				String projNumber = Integer.toString(project.getProjectNumber());
				System.out.println(project.getprojectName());
				String projName = (project.getprojectName());
				System.out.println(project.getbuildingType());
				String projBuilding = (project.getbuildingType());
				System.out.println(project.getphysicalAddress());
				String projPhyAddress = (project.getphysicalAddress());
				System.out.println(project.geterfNumber());
				String projErfNumber = (project.geterfNumber());
				System.out.println(project.getProjectDateline());
				String projDeadline = (project.getProjectDateline());
				System.out.println("\nCustomer Details.\n=================\n");
				String custDet = "\nCustomer Details. \n=================";
				System.out.println(project.getCustomer());
				PersonsClass cusDetails  = (project.getCustomer());
				System.out.println("\n-------------------------------------------------------\n");
				String calculation = "\n-----------------------------------------------------";
				System.out.println("The total fee charge of the project is: R"+ project.getTotalFeeCharge());
				String feeCharge = "The total fee charge of the project is: R"+ project.getTotalFeeCharge();
				System.out.println("The total amount being paid of the project is: R"+ project.getTotalAmount());
				String totalAmount = "The total amount being paid of the project is: R"+ project.getTotalAmount();
				System.out.println("The total balance to be paid is: R"+ grandTotal);
				String total = "The total balance to be paid is: R"+ grandTotal;
				System.out.println("\n------------------------------------------------------");
				String close = "\n------------------------------------------------------";

				/** generating the customer receipt to the text file. */
				fwriter.generateReceipt("Customer Receipt.txt",receipt + "\n" + projNumber + "\n" + projName + "\n" + projBuilding + "\n" + projPhyAddress + "\n" + projErfNumber +  
						"\n" + projDeadline + "\n" + custDet + "\n" + cusDetails + "\n" + calculation + "\n" + feeCharge + "\n" + totalAmount + "\n" + total + "\n" + close);

			}

			/** option to delete a project and make an update as well to the text file. */
			else if(mainMenue.equalsIgnoreCase("dl")) {
				proj.projectNames();
				int projectNumb = getIntData("Select a project above by enter a project number to delete:", -1);
				proj.deleteProject(projectNumb);
				System.out.println("This project is successfully deleted\n");
				fwriter.updateProjectList();

			}

			/** option to exit the program.*/
			else if(mainMenue.equalsIgnoreCase("e")) {
				System.out.println("Good Bye");
				break;
			}

			/** updating the file */
			fwriter.updateProjectList();

		}while(true);

	}
}
