import java.util.Scanner;
public class Main {

	public static double employee_bill_calculate(double bill)
	{
		double final_bill=(bill*0.7);
		final_bill=final_bill-((final_bill/100)*5);
		return final_bill;
	}
	public static double affliate_bill_calculate(double bill)
	{
		double final_bill=(bill*0.9);
		final_bill=final_bill-((final_bill/100)*5);
		return final_bill;
	}
	public static double customer_bill_calculate(double bill)
	{
		double final_bill=(bill*0.95);
		final_bill=final_bill-((final_bill/100)*5);
		return final_bill;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		System.out.println("It's Grocerry?(yes/no)");
		String grocery=sc.nextLine();	
		
		System.out.println("Enter your bill: ");
		double bill=sc.nextFloat();
		double final_bill=0;
		if(grocery.equals("yes"))
		{
			final_bill=bill-((bill/100)*5);
		}else
		{
			System.out.println("Hii "+name+" Choose the one which you belong to: ");		
			System.out.println("1.Employee of the store\n2.Affliate of the store\n3.Customer");
			int choice=sc.nextInt();

			switch(choice)
			{
				case 1:
					final_bill=employee_bill_calculate(bill);
					break;
				case 2:
					final_bill=affliate_bill_calculate(bill);
				case 3:
					System.out.println("Are you a customer over 2 years(yes/no):");
					String status=sc.nextLine();
					if(status.equals("yes"))
					{
						final_bill=customer_bill_calculate(bill);
					}
					else
					{
						final_bill=bill-((bill/100)*5);
					}
			}
			
		}
		System.out.println("You have to Pay $"+final_bill);
	}

}

