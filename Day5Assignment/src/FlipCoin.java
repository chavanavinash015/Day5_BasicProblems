import java.util.*;

public class FlipCoin {

	public static void main(String[] args) {
		int Heads=0;
		int Tails=0;
		int Count=0;
		
	Double randomvalue =0.0;
	System.out.println("Enter Number");
	
	Scanner n=new Scanner(System.in);
     int Flips=n.nextInt();
     
     while (Count <= Flips ) {
    	 randomvalue=Math.random();
    	 System.out.println(Count+" "+randomvalue);
    	 if(randomvalue<0.5) {
    		 Heads++;
    		 System.out.println("Heads");
    	 }
    	 else {
    		 Tails++;
    		 System.out.println("Tails");
    		 
    	 }
    	 Count++;
    	 
     }
    	 System.out.println();
    	 System.out.println("Number of Heads:" +Heads);
    	 System.out.println("Number Of Tails:" +Tails);
    	 
    	double HeadPercent=(double)Heads/Flips+100;
    	double TailPercent=(double)Tails/Flips+100;
    	
     System.out.println("Percentage Of Heads :" +HeadPercent);
     System.out.println("Percentage Of Tails :" +TailPercent);
	}
}
	

