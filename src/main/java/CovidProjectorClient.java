// Work in progress. Project was paused first due to professional project commitments and then due to 
// focus on more relevant Python based data analysis of the Covid Surge and resource shortage in India. 
 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CovidProjectorClient {
	
	private double maskers = 0.0;
	private boolean caseEntry;
	private int avgCases = 0;
	private List<Integer> casesDataset = new ArrayList<Integer>();
	private int linExp = 0;

	public CovidProjectorClient(double maskers, boolean caseEntry, int avgCases, List<Integer> casesDataset, int linExp) {
		this.maskers = maskers;
	        this.linExp = linExp;
		if(!caseEntry) 
		this.avgCases = avgCases;
		else
			this.casesDataset = casesDataset;
		
	}
	  public static void main(String[] args) {
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Please make sure you have the following data on hand:");
		  System.out.println("1. Average number of Daily Cases the area is seeing");
		  System.out.println("Or");
		  System.out.println("1. List of Daily Case numbers Over at least the Past 14 days");
		  System.out.println("2. Is the trend linear or exponential? (If you are entering just the average number of daily cases)");
		  System.out.println("3. Approximately what proportion of the community's population is practicing social distancing?");
		  
		 
		  System.out.println("Enter 0 if you want to enter an average number of daily cases and 1 if you want to enter a dataset then hit enter");
		  int entryOption = scanner.nextInt();
		  
		  int mainAvgCases = 0;
		  int mainlinExp = 0;
		  List<Integer> maincasesDataset = new ArrayList<Integer>();
		  boolean mainCaseEntry = false; 
		  if(entryOption == 0) {
			  System.out.println("Please enter the average number of daily cases then hit enter");	
			  mainAvgCases  = scanner.nextInt();
			
			  
			  System.out.println("Enter 0 if the trend of Total Number of Cases is Linear and Enter 1 if it is Exponential");
			  mainlinExp = scanner.nextInt();
			  if(mainlinExp != 0 && mainlinExp != 1) {
				  System.out.println("Invalid entry, please re-run client and only enter 0 or 1 in this section");
			  }
		  }
		  
		  else if (entryOption == 1) {
			  System.out.println("Please enter the number of cases from first day to last and hit enter one by one. Enter at least 14. Enter -1 when done");
			  int entry = 0;
			  mainCaseEntry = true;
			  int c = 1;
			  while(entry != -1) {
				  System.out.println("Day "+ c + " Number of Cases (or -1 to Exit)");
				  entry = scanner.nextInt();
				  maincasesDataset.add(entry);
				  c++;
			  }
		  }
		  
		  else
			  System.out.println("Invalid choice of entry method, please re-run the client and enter only 0 or 1 at this step");
		  
		  System.out.println("Please enter the proportion of community population following social distancing guidelines as proportion of 1");
		  double mainMaskers = scanner.nextDouble(); 
		  
		  CovidProjectorClient client = new CovidProjectorClient(mainMaskers, mainCaseEntry, mainAvgCases,maincasesDataset,mainlinExp);
		 
		  /* To be moved to Unit testing program
		  System.out.println("Maskers: "+ client.maskers);
		  System.out.println("MainCaseEntry: "+ client.caseEntry);
		  System.out.println("Maskers: "+ client.avgCases);
		  System.out.println("Maskers: "+ client.linExp);
		  System.out.println("Successfully created Client");
		  */
		 
		  
	    }
	  
	  
	  
	  
	 
	
}
