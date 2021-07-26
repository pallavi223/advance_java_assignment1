package src.com.nagarro.javatraining.assignment5.main;

import src.com.nagarro.javatraining.assignment5.csvservices.ProcessCsvFiles;
import src.com.nagarro.javatraining.assignment5.customexception.NewCustomException;
import src.com.nagarro.javatraining.assignment5.userinterface.UserInteractor;

// Main class of the program
public class ProgramLauncher {

	public static void main(String[] args) {

		try {
		/*
		 * Initializes the class that perform all csv files related operations
		 */
		ProcessCsvFiles launcher = new ProcessCsvFiles();
		launcher.initiateThreadClass();

		/*
		 * This will interact with user. Will take Input , validate it further
		 * and Finally Search for the flights
		 */

		UserInteractor interactor = new UserInteractor();
			interactor.userInput();		
		} catch (NewCustomException exception) {

			exception.printMessage();
		}

	}

}
