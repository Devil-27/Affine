import java.util.*;
public class Affine {
	public static void main (String[] args) throws java.lang.Exception
	{
		char[] ch=new char[100];
		int a,b;
		Scanner sc=new Scanner(System.in);	
		char cn='A';
		int y=0;
		for(int i=0;i<26;i++)
		{
			ch[i]=(char)(cn+i);
		}
		System.out.println("enter the message");
		String str=sc.next();
		System.out.println("enter both the key");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=0;i<str.length();i++)
		{
		    for(int j=0;j<=25;j++)
		    {
		        if(str.charAt(i)==ch[j])
		        {
		            y=(a*j+b)%26;
		            System.out.print(ch[y]);
		            y=0;
		            break;
		        }
		    }
		}
		sc.close();
}
}