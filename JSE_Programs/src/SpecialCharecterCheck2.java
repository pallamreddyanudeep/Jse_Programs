import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpecialCharecterCheck2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c,count,flag=0,i,count1=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String :");
		String s=br.readLine();
		char[] ch=s.toCharArray();
		
		
		
		for( i=0;i<ch.length;i++) {
			count=0;c=0;
		 
			
			if(ch[i]>=48 && ch[i]<=57) {
				c=1; 
				
			}
			else if(ch[i]>=65 && ch[i]<=90) {
				c=1; 
				
			}
			else if(ch[i]>=97 && ch[i]<=122) {
				c=1;  
			
			}
			else{
				c=2;
				
			}
			switch(c){
			case 1:
					continue;
			case 2:	++count;
					count1++;	
					
			default:System.out.println("end of loop exit");
			
			
			}
			if(count>0) {
				System.out.println(ch[i]+"is a special charecter \n");
				flag=1;
			}
		
		}
	    if(flag==0)	
			System.out.println("there are no special charecter in the String");
	    else {
	    	System.out.println("the number of sepical charecter in the string is "+count1);
	    }
	}

}
