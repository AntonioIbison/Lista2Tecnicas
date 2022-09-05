package Lista2;

public class Quest6 {
	public static void main(String[] args) {
		
		/*6)Imprima a saída:
		0 - 33
		1 - 32
		2 - 31
		...
		99 - -66*/
		
		int i=0;
		int j=0;
		
		for(i=0,j=33;i<100 && j>=-66;i++,j-- ){
		System.out.print(i + " - " + j + "\n");
		}
	}

}
