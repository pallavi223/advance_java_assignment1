package src.com.nagarro.javatraining.assignment5.csvservices;


public class ProcessCsvFiles {

	/*
	 * Launches the Thread that read and Add csv files data to the data store
	 */
	public void initiateThreadClass() {

       //SearchCsvFiles fileSearch = new SearchCsvFiles();
		CsvHandler csvFileHandler = new CsvHandler();
		Thread t1 = new Thread(csvFileHandler);
		t1.start();

	}

}

