package Lista2;

import java.util.Scanner;

public class Quest11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i=0,j=0;
		int valores;
		System.out.println("Insira valores para a sequencia: ");
		
		valores=input.nextInt();
		
		for(;i<=valores;i++) {
			for(j=0;j<=1;j++) {
				System.out.print(i + " - "+ j + "\n");
			}
			for(j=0;j<=2;j++) {
				System.out.print(i + " - "+ j + "\n");
}
		}}}
