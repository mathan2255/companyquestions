package companyquestions;

import java.util.Scanner;

public class Decryptceasershift {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Message");
		String st=s.nextLine();
		System.out.println("Enter key");
		int key=s.nextInt();
		char[] c=st.toCharArray();
		for(int i=0;i<st.length();i++)
		{
			if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
			{
				c[i]=(char) (c[i]+key);
			}
			
			System.out.print(c[i]);
		}
		System.out.println("\nenter decrypt key");
		int key2=s.nextInt();
		for(int i=0;i<st.length();i++)
		{    if(key==key2) {
			if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z')
			{
				c[i]=(char) (c[i]-key2);
			}}
			
			System.out.print(c[i]);
		}
		
		

	}

}
