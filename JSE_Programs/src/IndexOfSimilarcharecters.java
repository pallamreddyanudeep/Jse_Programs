import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOfSimilarcharecters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter the string :");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();int n=0,a;
		System.out.println("enter the string you want to search");
		String s=br.readLine();
		int l=s.length();
		for(int i=0;i<s1.length();i++){
			if(n<s1.length()) {
		    a=s1.indexOf(s, n);
			System.out.println("is is at :"+a);
			n=a+l;		
		}
	}

}
}
