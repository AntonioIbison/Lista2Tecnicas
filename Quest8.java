package Lista2;

public class Quest8 {
	public static void main(String[] args) {
		
		/*Imprima a saída:
		0 - 100
		1 - 99
		2 - 98
		...
		49 - 51*/
		
		int i=0;
		int j=0;
		
		for(i=0,j=100;i<50 && j>=51;i++,j--){
		System.out.print(i + " - " + j + "\n");
	}

}}
