import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedWriter bw = null;
		
		ArrayList<People> humans = new ArrayList<People>();
		People dave = new People("Dave", "Heating engineer", 46);
		People janette = new People("Janette", "Sailor", 22);
		People geoffrey = new People("Geoffrey", "Drug dealer", 82);
		People lisa = new People("Lisa", "Television presenter", 36);
		People malcomme = new People("Malcomme", "Oil rig worker", 9);
		
		humans.add(dave);
		humans.add(janette);
		humans.add(geoffrey);
		humans.add(lisa);
		humans.add(malcomme);
		
		try {
			File file = new File("C:\\Users\\MPadwick\\testFile.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			for(People person : humans) {
				bw.write(person.toString() + "\r\n");
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
		finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch(Exception ex) {
				System.out.println("Error in closing the BufferedWriter"+ex);
			}
		}
	}
}
