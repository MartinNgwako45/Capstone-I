import java.util.*;

public class ProjectList {
	/** Adding the object that will contain a list of project. */
	private ArrayList<ProjectClass> ProjectList;

	/** create a static Object of this class. */
	private static ProjectList onlyInstance= null;

	/** Make constructor private */
	private ProjectList (){
		ProjectList = new ArrayList<ProjectClass>();
	}


	/** get project to return the project. */
	public ProjectClass getProject(int projectNumb){
		return ProjectList.get(projectNumb);
	}

	/** Create a static method that return the instance of this class
	 *
	 */  
	public static ProjectList getOnlyInstance(){
		if(onlyInstance == null){
			onlyInstance = new ProjectList();
		}
		return onlyInstance;
	}

	/** Adding a project into the list object. */
	public void addProject(ProjectClass project){
		ProjectList.add(project);
	}

	/** method of project name from the project list. */
	public void projectNames(){
		int projectNumb = 0;
		for(ProjectClass project: ProjectList){
			System.out.println("Project Number: "+projectNumb+"\n=================\n\n"+project + "\n---------------------------------------\n");
			projectNumb++;
		}
	}

	/** return an project based on the index position. */ 
	public ProjectClass getProjectClass(int index){
		if(index >= 0 && index < ProjectList.size()){
			return ProjectList.get(index);
		}
		return null;
	}

	/** method of displaying the project menu. */
	public void projectMenue(){
		System.out.println("Please select a project by entering a number below\n--------------------------------------------------");
		int projectNumber = 0;
		for(ProjectClass project: ProjectList){
			System.out.println(projectNumber + ". "+project.getprojectName() + " - "+ project.getbuildingType() + " "+ project.getphysicalAddress() 
			+ " "+ project.geterfNumber() + " "+ project.getTotalFeeCharge() + " "+ project.getTotalAmount() + " "+ project.getProjectDateline() + " "+ 
			project.getContractor() + " "+ project.getCustomer() + " "+ project.getArchitect());
			projectNumber++;
		}    
	}

	/** method of deleting a project and update the text file. */
	public void deleteProject(int projectNumb){
		if(projectNumb < ProjectList.size()){
			ProjectList.remove(projectNumb);	

		}
	}

	/** method to view all the project in the list. */
	public String toString(){
		String displayProject = "";
		int projectNumb = 0;
		for(ProjectClass project: ProjectList){
			displayProject += "Project Number: "+projectNumb +"\n=================\n\n";
			displayProject += project;
			displayProject += "\n-------------------------------------------\n-------------------------------------------\n";
			projectNumb++;
		}
		return displayProject;
	}

	/** Formatting data for the file. */
	public String toFile(){
		String outFile = "";
		for(ProjectClass project: ProjectList){
			outFile += project.toFile() + "\n";
		}
		return outFile;
	}

}
