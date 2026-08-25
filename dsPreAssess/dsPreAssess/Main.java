package dsPreAssess;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String file = "orders.txt";
		//showFileContents(file); //calls method to show file contents
		
		OrderDB orders = new OrderDB();
		orders.loadOrders(file);
		orders.showOrders();
		
		

	}
	public static void showFileContents(String file) { //just a method to show file contents 
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line;
			while((line = reader.readLine()) != null) {
				
				System.out.println(line);
				
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		catch(IOException e) {
			System.out.println("File unable to read");
		}
		
		
	}

}
