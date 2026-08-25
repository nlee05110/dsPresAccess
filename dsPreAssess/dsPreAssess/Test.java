package dsPreAssess;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) { //this was my first attempt of loading the file, but it does not load file contents into an array
		String fileName = "orders.txt";
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			String line = "";
			int count = 0;
			
			
			while(((line = reader.readLine()) != null) && count <= 10) {
				
				
				if(count == 0) {
					String arr[] = line.split(","); 
					System.out.printf(arr[0] + " " + arr[2] + "\t\t\t" + arr[3] + "\n");
					System.out.println("-------- -------			------------");
				}else {
					
					
					String arr[] = line.split(",");
					Double amount = Double.valueOf(arr[3]);
					System.out.printf("+%s\t\s%-23s\t%12.2f%n", arr[0], arr[2], amount);
				
				}
				
				count++;	
				
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		
		}
		catch(IOException e) {
			System.out.println("Could not read file");
		}

	}

}
