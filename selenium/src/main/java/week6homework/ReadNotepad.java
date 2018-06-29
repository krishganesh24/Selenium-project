package week6homework;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class ReadNotepad {

	public static void main(String[] args) throws IOException {


		FileReader file = new FileReader("./data/Test.txt");
		BufferedReader br = new BufferedReader(file);

		String x="";
		while((x=br.readLine())!=null) 
				{
			System.out.println(x);
				}

		br.close();
	}

}
