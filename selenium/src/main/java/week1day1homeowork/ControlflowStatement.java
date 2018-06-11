package week1day1homeowork;

public class ControlflowStatement {

	public static void main(String[] args) {
		
		//String[] signalstatus= {"Green","Red","Yellow"};
		String signalStatus="";
		
		if(signalStatus=="Green")
				{
			System.out.println("Start");
				}
		
		else if(signalStatus=="Red")
		{
			 System.out.println("Stop");
		}
		else if(signalStatus=="Yellow")
		{
			System.out.println("Ready");
		}else {
			System.out.println("get lost");
		}

		// switch case//
		
				
		int number=20; 
		
	    switch(number){  
	    case 10: System.out.println("10");  
	    break;
	    
	    case 20: System.out.println("20");  
	    case 30: System.out.println("30");  
	    default:System.out.println("Not in 10, 20 or 30"); 
	    }
	}

}
