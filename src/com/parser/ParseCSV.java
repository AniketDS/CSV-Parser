package com.parser;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseCSV {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("C:\\Users\\Dell\\Documents\\Data.csv"));
		Scanner dataScanner = null;
		int index = 0;
		List<Parse> empList = new ArrayList<>();
		
		while (scanner.hasNextLine()) {
			
			dataScanner = new Scanner(scanner.nextLine());
			dataScanner.useDelimiter(",");
			Parse emp = new Parse();
			System.out.println();

			while (dataScanner.hasNext()) {
				
				String data = dataScanner.next();
				if (index == 0)
					emp.setName(data);
				else if (index == 1)
					emp.setPhone_no(data);
				else if (index == 2)
					emp.setEmail(data);
				else if (index == 3)
					emp.setApartmentNumber(data);
				else if (index == 4)
					emp.setLandmark(data);
				else if (index == 5)
					emp.setCity(data);
				else if (index == 6)
					emp.setState(data);
				else if (index == 7)
					emp.setPincode(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}

		scanner.close();

		System.out.println(empList);

	}
}