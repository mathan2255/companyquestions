package companyquestions;
import java.util.Scanner;
public class Reverseoffibonacci {

	public static void main(String[] args) {
	
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the limit");
				int n=s.nextInt();
				int a=0,b=1,c=0;
				int i=0;
				int ar[]=new int[n];
				int ar1[]=new int[2];
				ar1[0]=a;
				ar1[1]=b;
				while(i<=n-3)
				{
					c=a+b;
					
					ar[i]=c;
					a=b;
					b=c;
					i++;
				}
				for(i=n-3;i>=0;i--) {
		System.out.printf("%d ",ar[i]);}
		System.out.printf("%d %d ",ar1[1],ar1[0]);

			}

		}

