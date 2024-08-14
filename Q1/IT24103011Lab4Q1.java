import java.util.Scanner;

    public class IT24103011Lab4Q1 {
		 public static void main(String[] args) { 
		 
		  Scanner sc = new Scanner(System.in);
		  
		    System.out.print("Enter a number: ");
			int numb = sc.nextInt();
			  
			  
			if(numb> 0){
				System.out.println("The number is: Positive");
				
			}else if(numb<0){
			    System.out.println("The number is: Negative");
				
			}else{
			    System.out.println("The number is Zero");
			}
			
		 }
		 
	}