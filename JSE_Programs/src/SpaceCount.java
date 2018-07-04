import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpaceCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		int count=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
	
	System.out.println("The Number of spaces in the Array is :"+count);

	}
}
