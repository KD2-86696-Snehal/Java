import java.util.Scanner;

public class assign2_2 {


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=new int[20];
		int choice=-1;
		double total=0;
		Scanner sc=new Scanner(System.in);
		while (choice!=0){
		System.out.println("-----WELCOME-----");
		System.out.println("1.Dosa");
		System.out.println("2.Idli");
		System.out.println("3.Misal");
		System.out.println("4.Samosa");
		System.out.println("5.Generate bill");
		System.out.println("0.Exit");
		System.out.println("Enter your choice");
		 choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:
		{
			
			System.out.println("enter quantity= ");
			int qunt=sc.nextInt();
			double price=100;
			 total+=(qunt*price);
			 //System.out.println(total);
			
			
			
		}
		break;
		case 2:
		{
			System.out.println("enter quantity= ");
			int qunt=sc.nextInt();
			double price=50;
			 total+=(qunt*price);
			
			
			
		}
		break;
		case 3:
		{
			System.out.println("enter quantity= ");
			int qunt=sc.nextInt();
			double price=90;
			 total+=(qunt*price);
			
			
		}
		break;
		case 4:
		{
			System.out.println("enter quantity= ");
			int qunt=sc.nextInt();
			double price=10;
			 total+=(qunt*price);
			
			
		}
		break;
		case 5:
		{
			System.out.println("-------------------");
			System.out.println("Total Bill- "+total);
			System.out.println("-------------------");
			System.exit(0);
			
		}
		break;
		case 0:
		{
		System.exit(0);
		}
		break;
		default:
		{
			System.out.println("Invalid Choice");
			
		}
		}
		
	}
	}
}
