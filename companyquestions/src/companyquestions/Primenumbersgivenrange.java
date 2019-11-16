package companyquestions;
import java.util.Scanner;

public class Primenumbersgivenrange {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		System.out.println("Enter the lower and upper limit");
		int l=s.nextInt();
		int h=s.nextInt();
		
		int i,j;

		for(i=l;i<=h;i++)
		{
			int c=0;
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
				{
				  c++;
				}
				
			}
			
			
			if(c==1)
			System.out.printf("%d ",i);
			
		}
		

		}

	}
