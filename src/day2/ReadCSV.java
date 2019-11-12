package day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadCSV {

	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\saurgup4\\workspace\\Selenium2\\Saurabh_Selenium2\\src\\day2\\files\\UserAccounts.csv";
		FileReader fileReader = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fileReader);
		while(br.ready()) {
			String line = br.readLine();
			String[] elements = line.split(",");
			String name = elements[0];
			String email = elements[1];
			String phone = elements[2];
			String gender = elements[3];
			String password = elements[4];
			String country = elements[5];
			String weeklyEmail = elements[6];
			String monthlyEmail = elements[7];
			String occasionalEmail = elements[8];
			
			System.out.println("name:"+name);
			System.out.println("email:"+email);
			System.out.println("phone:"+phone);
			System.out.println("gender:"+gender);
			
			System.out.println();
			
			
		}
		
		
	}
}
