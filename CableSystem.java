import java.util.*;
import java.io.*;

/**
 *   Class that implements a collection of cable tv channels
 *   in an array. 
 */

/*
 * Analysis of search performance:
 * 
 * 
 * 
 */


public class CableSystem {

	private Channel[] channelArray;
	private int numChannels;
	
	/**
	 * Initializes the cable system with the tv channels specified
	 * in the file given by the name in the parameter. The data in
	 * the file must be in increasing order by channel name,
	 * one channel per line: channel number followed by one space
	 * followed by the channel name.
	 * @param datafilename Name of file with cable tv channel data
	 */
	public CableSystem(String datafilename) {
		
		Scanner filescan = null;
		try {
			filescan = new Scanner(new File(datafilename));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found. Ending program.");
			System.exit(1);
		}

		numChannels = filescan.nextInt();
		filescan.nextLine();					// Why?
		channelArray = new Channel[numChannels];
		for (int i = 0; i < numChannels; i++) {
			int number = filescan.nextInt(); 
			String name = filescan.nextLine().substring(1); // Why substring(1)?
			channelArray[i] = new Channel(number, name);
		}

	}
	
	/**
	 * Searches the cable system for the channel number
	 * given the channel name using linear search. Outputs
	 * the number of channels examined.
	 * @param channelName the name of the channel desired
	 * @return the number of the channel if the cable system has the channel name, -1 otherwise
	 */
	public int search1(String channelName) {

		// Remove the following line when you complete this method	
		return -999;

	}
	
	/**
	 * Searches the cable system for the channel number
	 * given the channel name using binary search. Outputs
	 * the number of channels examined.
	 * @param channelName the name of the channel desired
	 * @return the number of the channel if the cable system has the channel name, -1 otherwise
	 */
	public int search2(String channelName) {
		
		// Remove the following line when you complete this method
		return -999;

	}

	/**
	 * Returns the contents of the current cable system as a string.
	 * @return The string representation of the entire cable system.
	 */
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("numChannels = " + numChannels + "\n");
		for (int i = 0; i < channelArray.length; i++) {
			if (channelArray[i] != null)
				sb.append("channelArray[" + i + "] = " + channelArray[i].toString() + "\n");
			else
				sb.append("channelArray[" + i + "] = NULL\n");
		}
		return sb.toString();

	}
	
	// TESTING METHOD
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input channel data file name: ");
		String filename = scan.nextLine();
		
		CableSystem fios = new CableSystem(filename);
		System.out.println("\nCABLE SYSTEM CHANNELS:");
		System.out.println(fios);		// calls toString implicitly
		
		System.out.println("\nTESTING LINEAR SEARCH:");

		for (int i = 1; i <= 5; i++) { 
			System.out.print("Enter a channel name: ");
			String channelName = scan.nextLine();
			int channelNumber = fios.search1(channelName);
			if (channelNumber != -1)
				System.out.println(channelName + " " + channelNumber);
			else
				System.out.println(channelName + " NOT FOUND");
		}

		System.out.println("\nTESTING BINARY SEARCH:");
		for (int i = 1; i <= 5; i++) { 
			System.out.print("Enter a channel name: ");
			String channelName = scan.nextLine();
			int channelNumber = fios.search2(channelName);
			if (channelNumber != -1)
				System.out.println(channelName + " " + channelNumber);
			else
				System.out.println(channelName + " NOT FOUND");
		}
		
	}
	
}