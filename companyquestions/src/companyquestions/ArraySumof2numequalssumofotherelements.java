package companyquestions;

import java.util.Scanner;

public class ArraySumof2numequalssumofotherelements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int ar[]=new int[n+1];
		int sum=0,s1 = 0,sum1;
		System.out.println("Enter array element");
		for(int i=0;i<n;i++)
		{
			ar[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+ar[i];
		}
		if(sum%2==0)
		{
			s1=sum/2;
		}
		for(int i=0;i<n;i++)
		{
			sum1=sum=ar[i];
		}
		
		
		
		
		
		
	}

}
