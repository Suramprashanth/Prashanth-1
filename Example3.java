import java.util.Scanner;
class Example3
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		int b=sc.nextInt();
		System.out.println("Enter the hight:");
		int h=sc.nextInt();
		float area=0.5f*b*h;
		System.out.println("area of triangle is="+area);

	}
}