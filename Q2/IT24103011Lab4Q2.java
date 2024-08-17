import java.util.Scanner;
public class IT24103011Lab4Q2{
	public static void main (String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter exam marks out of 100:  ");
		int a= sc.nextInt();
		if (a< 0 || a > 100)
		{
		System.out.print("Invalid input for exam marks. Terminating process");
		}
		else if (a >= 0 || a <= 100){
			System.out.print("Please enter labsubmission marks out of 100:  ");
			int b = sc.nextInt();
			
				if (b< 0 || b> 100){
					System.out.print("Invalid input for exam marks. Terminating program");
				}
				else if (a >= 0 || a <= 100){
					System.out.print("Enter exam percentage:  ");
					int c = sc.nextInt ();
					System.out.print("Enter lab submission percentage:  ");	
					int d = sc.nextInt ();
						
						if ((c+d)>100){
							System.out.print ("The percentages must add up to 100 Terminating program");
						}
						else if ((c+d)<=100){
							float final_marks= ((a*c)/100)+((b*d)/100);
							System.out.print ("Final Exam Marks : "+final_marks );
						}
				}
		}
	}
}
