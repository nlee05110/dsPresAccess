package dsPreAssess;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class OrderDB implements OrderDBInterface {
	String[] arr = new String[11];
	
	@Override
	public void loadOrders(String fileName) {
		
		String file = "orders.txt";
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			
			String line;
			int count = 0;
			
			while(((line = reader.readLine()) != null) && count <= 10) {
				
				arr[count] = String.valueOf(line); //Loads each line in file into the 'arr' array
				count++;
				
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		
		catch(IOException e) {
			System.out.println("File unable to read");
		}

		
	}

	@Override
	public void showOrders() {
		
		String arrLine = "";
			String line2= "";
			String[] splitArr = null;
			int index = 0;
			
			while(index < arr.length) {
				
				arrLine = arr[index];	 //creates a string from the index of 'arr' array
				splitArr = arrLine.split(",");	//splits string into the new 'splitArr' array
				int index2 = 0;
				
				while(index2 < splitArr.length) {
					index2++;
				}
				if(index == 0) { 	//formatted to display headers of the file
					System.out.printf(splitArr[0] + " " + splitArr[2] + "\t\t      " + splitArr[3] + "\n");
					System.out.println("-------- -------\t\t\s\s\s\s\s\s------------");
					
				}else {		//formatted to display contents of each line from 'splitArr' array
					Double totalAmount = Double.valueOf(splitArr[3]); 	//double variable to display float of value in two decimal places
					System.out.printf("+%s\t\s%-26s%15.2f%n", splitArr[0], splitArr[2], totalAmount);
					
				}
				index++;
				
			}
		
		
	}

}
