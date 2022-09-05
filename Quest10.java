package Lista2;

import java.util.Scanner;

public class Quest10 {
	public static void main(String[] args){
		
		
		int i=0,j=0;
		int tdireita, tesquerda;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um valor para o teto da esquerda");
		tesquerda=input.nextInt();
		
		System.out.println("Insira um valor para o teto da direita");
		tdireita=input.nextInt();
		
		for(;i<=tesquerda+1;i++) {
			for(;j<=tdireita;j++) {
				System.out.print(i + " - "+ j + "\n");
}
}
}
}