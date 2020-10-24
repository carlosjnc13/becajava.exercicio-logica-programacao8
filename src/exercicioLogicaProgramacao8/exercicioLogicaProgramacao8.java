package exercicioLogicaProgramacao8;
import java.util.Scanner;
import java.util.Arrays;


public class exercicioLogicaProgramacao8 {

	public static void main(String[] args) {
		
		Scanner Leitor = new Scanner(System.in);
		int[] array = new int[10];
		int i = 0;
		
		while(i < 10) {
			
			try {
			System.out.println("Digite um numero:");
			array[i] = Leitor.nextInt();
			i++;
			}
			
			catch (java.util.InputMismatchException e){
				System.out.println("digite apenas numeros!!!");
				Leitor.nextLine();
		}
	}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
}
}