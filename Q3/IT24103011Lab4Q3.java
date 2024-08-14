import java.util.Scanner;

    public class IT24103011Lab4Q3 {
		 public static void main(String[] args) { 
		 
		  Scanner sc = new Scanner(System.in);
		  
		    System.out.print("Enter a number: ");
			int numb = sc.nextInt();
			  
			  
			String output =(numb>0)? "The number is: Positive" : (numb<0)? "The number is: Negative" : "The number is Zero";			
		 
		 System.out.println(output);
		 
		 }
		 
	}