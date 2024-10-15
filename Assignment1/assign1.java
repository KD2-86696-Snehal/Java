import java.util.Scanner;

public class assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double num1=0;
		System.out.println("Enter a value- ");
		if(sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.println("Enter double type value");
			}
			else
			{
				//System.out.println("heyyy");
				num1=sc.nextDouble();
				System.out.println(num1);
			}
			
		}

		
		System.out.println("Enter 2nd value- ");
		double num2=0;
		if(sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.println("Enter double type value");
			}
			else
			{
				//System.out.println("heyyy");
				num2=sc.nextDouble();
				System.out.println(num2);
				
			}
			
		}
		
		if (num1!=0 && num2!=0)
		{
			
		double avg=(num1+num2)/2;
		System.out.println("Average of two numbers is = "+avg);
		
		}
		
	}

}
