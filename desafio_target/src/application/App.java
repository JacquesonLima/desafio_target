package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner prompt = new Scanner(System.in);
		
		try {
			System.out.print("Digite um valor para verificar se ele pertence a sequência de fibonacci: ");
			int num = prompt.nextInt();
			if (isFibonacci(num)) {
				System.out.printf("O número %s pertence a sequência de fibonacci %n", num);
			} else {
				System.out.printf("O número %s não pertence a sequência de fibonacci %n", num);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		prompt.nextLine();
		System.out.print("Digite uma string para verificar a quantidade de letras 'a': ");
        String input = prompt.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.printf("A letra 'a' ocorre %s vezes na string. %n", count);
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }
        
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;
        
        while (K < INDICE) {
        	K = K + 1;
        	SOMA = SOMA + K;
        }
        System.out.println("A soma é igual a: " + SOMA);
	}

	public static boolean isFibonacci(int num) {
		if (num < 0) {
			return false;
		}
		int a = 0;
		int b = 1;
		while (a < num) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		return a == num;
	}
	
	public static int countLetterA(String str) {
		int count = 0;
		
		String lowerCaseStr = str.toLowerCase();
		
		for (char c : lowerCaseStr.toCharArray()) {
			if (c == 'a') {
				count ++;
			}
		}
		return count;
	}
}