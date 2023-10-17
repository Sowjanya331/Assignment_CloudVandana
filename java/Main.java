public class Main
{
	public static void main(String[] args) {
		int a[]=new int[26];
		int fl=1;
		String s="abcdefghijklmnopqrstuvwxYZ";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
		    a[s.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++)
		{
		    if(a[i]<1)
		    fl=0;
		}
		if(fl==0)
		System.out.println("Not a pangram");
		else 
		System.out.println("Pangram");
	}
}
