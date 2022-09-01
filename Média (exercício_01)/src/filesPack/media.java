package filesPack;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int n1 = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int n2 = leia.nextInt();
		
		System.out.println("A média do aluno foi: " + (((n1*2)+(n2*3))/(2+3)));
	}

}
