import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReverseMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("enter the string :");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		StringBuffer sb=new StringBuffer(s1);
		sb=sb.reverse();
		System.out.println(sb);

		String s2=sb.toString();
		if(s1.equals(s2)) {
			System.out.println("Entered STring is palindrome");
		}
		else
			System.out.println("entered string is not palindrome"); 

}
}