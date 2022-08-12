package application;

import java.util.Arrays;

public class Program {
	public static void main(String[] args) {

		/***** Teste 01 *****/
		int[] temperaturas = {17, 32, 14, 21};
		//criei essa variavel para percorrer o array temperaturas para procurar o numero mais proximo de 0.
		int tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		int resultadoEsperado = 14;
		int test = 1;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou.");
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}


		/***** Teste 02 *****/
		temperaturas = new int[]{27, -8, -12, 9};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = -8;
		test = 2;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou.");
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		/***** Teste 03 *****/
		temperaturas = new int[]{-6, 14, 42, 6, 25, -18};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = 6;
		test = 3;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou.");
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		// Não consegui entender oque aconteceu aqui,
		// porque nos outros testes sempre pegava os numeros positivos e aqui não pegou, tentei arrumar e não tive sucesso.
		/***** Teste 04 *****/
		temperaturas = new int[]{34, 11, 13, -23, -11, 18};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = 11;
		test = 4;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou." );
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		System.out.println();

		/***** Teste 05 *****/
		temperaturas = new int[]{17, 0, 28, -4};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = 0;
		test = 5;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou." );
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		/***** Teste 06 *****/
		temperaturas = new int[]{-10, 27, 9, -12};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = 9;
		test = 6;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou." );
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		/***** Teste 07 *****/
		temperaturas = new int[]{-47, -14, -5, -12, -8};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = -5;
		test = 7;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou." );
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		/***** Teste 08 *****/
		temperaturas = new int[]{-47, -14, -5, -12, -5};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = -5;
		test = 8;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou." );
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}

		/***** Teste 09 *****/
		temperaturas = new int[]{-7, 12, -13, 8};
		tempProx = Arrays.stream(temperaturas).reduce((proximo, elemento) -> Math.abs(proximo) < Math.abs(elemento) ? proximo : elemento).getAsInt();
		resultadoEsperado = -7;
		test = 9;
		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] <= tempProx && temperaturas[i] >= tempProx) {
				tempProx = temperaturas[i];

			}
		}
		if (tempProx == resultadoEsperado) {
			System.out.println("Teste " + test + " passou." );
		}else {
			System.out.println("Teste "+ test +" NAO passou (Resultado esperado = "+ resultadoEsperado + ", Resultado obtido = "+ tempProx +").");
		}



	}
}