package SeleniumChallenges;

public class GetFilename {

	public static void main(String[] args) {

		String str = "C:\\Programs\\TextFile.txt";
	
		String[] sp=str.split("\\");
		
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		                     
		
	
	}

}
