import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBufferMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("enter the string :");
				BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
				StringBuffer s1=new StringBuffer(br.readLine());
				System.out.println("first string is :"+s1);
				
				System.out.println("enter another String to append");
			//	StringBuffer s2=new StringBuffer(br.readLine());
				s1=s1.append(br.readLine());
				System.out.println("first string after appending is :"+s1);
				
				System.out.println("Enter the index of you want to enter ");
				int n=Integer.parseInt(br.readLine());
				System.out.println("enter another String to insert");
				s1=s1.insert(n, br.readLine());
				System.out.println("first string after inserting is :"+s1);
				
				System.out.println("Enter the start index of you want to delete ");
				int s=Integer.parseInt(br.readLine());
				System.out.println("Enter the index of you want ro enter ");
				int e=Integer.parseInt(br.readLine());
				s1=s1.delete(s, e);
				System.out.println("first string after deleting is :"+s1);
			
	}

}
