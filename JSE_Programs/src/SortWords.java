import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortWords {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Enter the String");
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String[] words=s.split(" ");
		
		System.out.println("Words berfore sorting");
		for(int i=0;i<words.length;i++)
			System.out.println(words[i]);
		
		for(int i=0;i<words.length;i++) {
			 char[] ch = new char[words[i].length()];
		        ch=words[i].toCharArray();
		 
		        Arrays.sort(ch);
		        words[i]=String.valueOf(ch);
		    
		}
		Arrays.sort(words);
		
		
		
		for(int l=0;l<words.length ;l++) {
			if(words[l].length()>words[l+1].length()) {
				
			}
		}
		
		
		
		
		System.out.println("Words after sorting");
		for(int i=0;i<words.length;i++)
			System.out.println(words[i]);	
		
		
	}
	public static String swap(String s2,int i,int j) {	
		char temp;
		
		char ch[]=
		s2.toCharArray();
		
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}

}
