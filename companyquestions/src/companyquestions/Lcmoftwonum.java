package companyquestions;
import java.util.Scanner;

public class Lcmoftwonum {
public static void main(String arg[])
		{
			Scanner s=new Scanner(System.in);
					int a=s.nextInt();
					int b=s.nextInt();
					int lcm = 0;
					int max=(a>b)?a:b;
					for(int i=max;i<=(a*b);i++)
					{
						if(i%a==0&&i%b==0) {
							lcm=i;
					
							System.out.println(lcm);
							break;
					
						}
					}
					
		}
						

	}


	
