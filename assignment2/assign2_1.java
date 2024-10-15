import java.util.Scanner;

public class assign2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value- ");
		int num1=sc.nextInt();
		String s1=Integer.toBinaryString(num1);
		
		System.out.println("Binary Equivalent-"+s1);
		
		String s2=Integer.toOctalString(num1);
		System.out.println("Octal Equivalent- "+s2);
		
		String s3=Integer.toHexString(num1);
		System.out.println("Hexadecimal Equivalent- "+s3);
		

	}

}
