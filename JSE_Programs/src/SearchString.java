import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchString {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of cities into the String Arrey");
		int size=Integer.parseInt(br.readLine());
		String[] s=new String[size];
		System.out.println("Enter the  cities into the String Arrey");
		for(int i=0;i<size;i++)
		s[i]=br.readLine();
		System.out.println("Enter the  city you want yo search ");
		String s2=br.readLine();
		for(int i=0;i<size;i++)
		if(s2.equalsIgnoreCase(s[i])) {
			System.out.println(s2+" is at "+ (i+1) +" position ");
		}
			
	}

}