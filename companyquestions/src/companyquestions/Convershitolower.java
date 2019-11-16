package companyquestions;

import java.util.Scanner;

public class Convershitolower {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		char c=0;
		for(int i=0;i<st.length();i++)
		{
			c=st.charAt(i);
			if(c>64&&c<91)
			{
				c=(char)((c+32));
			}
			System.out.print(c);
				
		}

	}

}
