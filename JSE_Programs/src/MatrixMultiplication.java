import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter the row size of the first array");
int r1=sc.nextInt();
System.out.println("enter the coloumn size of the first array");
int c1=sc.nextInt();
System.out.println("enter the elements in first array");
int f[][]=new int[r1][c1];
for(int i=0;i<r1;i++) {
	for(int j=0;j<c1;j++) {
		f[i][j]=sc.nextInt();
	}
}
	System.out.println("elements in first array");
for(int i=0;i<r1;i++) {
	for(int j=0;j<c1;j++) {
		System.out.print(f[i][j]+"\t");
	}System.out.println();
}
System.out.println("enter the row size of the first array");
int r2=sc.nextInt();
System.out.println("enter the coloumn size of the first array");
int c2=sc.nextInt();
System.out.println("enter the elements in second array");
int s[][]=new int[r2][c2];
for(int i=0;i<r2;i++) {
	for(int j=0;j<c2;j++) {
		s[i][j]=sc.nextInt();
	}
}
System.out.println("elements in second array");
for(int i=0;i<r2;i++) {
for(int j=0;j<c2;j++) {
	System.out.print(s[i][j]+"\t");
}System.out.println();
}
int[][] mul=new int[r1][c2];
if(c1==r2) {
	
	for(int i=0;i<r1;i++) {
		for(int j=0;j<c2;j++){
			for(int k=0;k<r2;k++) {
			sum=sum+f[i][k]*s[k][j];
		}
			mul[i][j]=sum;
			sum=0;
	}
	
}
System.out.println("the multipication is");
for(int i=0;i<r1;i++) {
	for(int j=0;j<c2;j++) {
		System.out.print(mul[i][j]+"\t");
	}
	System.out.println();
}

	}
	sc.close();
}
}
