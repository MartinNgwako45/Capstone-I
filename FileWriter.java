import java.util.*;

public class FileWriter {

	ProjectList list;

	public FileWriter(){
		list = ProjectList.getOnlyInstance();
	}

	public void updateProjectList(){
		try{
			Formatter outFile = new Formatter("ProjectFile.txt");

			outFile.format(list.toFile());
			outFile.close();
			System.out.println("\nThe file was succefully updated.");

		}catch(Exception ex){
			System.out.println("The project was failed to add to the text file.");
		}
	}

	public void finalizeReport(String rname, String data){
		try{
			Formatter outFile = new Formatter(rname);
			outFile.format(data);
			outFile.close();
			System.out.println("The project was successfully finalize");

		}catch(Exception e){
			System.out.println("Failed to finalize the project");
		}
	}

	public void generateReceipt(String reportName, String data1){
		try{
			Formatter outFile1 = new Formatter();
			outFile1.format(data1);
			outFile1.close();
			System.out.println("\nThe receipt was successfully generated");

		}catch(Exception e){
			System.out.println("Failed to generate the receipt");
		}
	}
}
