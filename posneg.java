package meena;

import java.util.Scanner;

public class posneg {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
int n=a.nextInt();
if(n>0)
{
	System.out.println("positive");
}else if(n<0)
{
	System.out.println("negative");
}else
{
	System.out.println("zero");
}
	}

}
