package application;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) throws Exception {

			// Utilizei uma Biblioteca de data do java

			/****** Test 1 ******/
			LocalDate initialDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			LocalDate finalDate = LocalDate.parse("2018-01-02", DateTimeFormatter.ISO_LOCAL_DATE);

			// A classe Duration mede uma quantidade de tempo em segundos e nanossegundos
			Duration diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());

			// A Duration diff é convertida em dias utilizando o método toDays()
			long result = diff.toDays();
			long expectedOutcome = 1;
			int test = 1;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}


			/****** Test 2 ******/
			initialDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2018-02-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 31;
			test = 2;
			if (result == expectedOutcome){
				System.out.println("Teste 2 passou.");
			}else {
				System.out.println("Teste 2 NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 3 ******/
			initialDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2018-02-02", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 32;
			test = 3;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 4 ******/
			initialDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2018-02-28", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 58;
			test = 4;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 5 ******/
			initialDate = LocalDate.parse("2018-01-15", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2018-03-15", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 59;
			test = 5;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 6 ******/
			initialDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2019-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 365;
			test = 6;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 7 ******/
			initialDate = LocalDate.parse("2018-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2020-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 730;
			test = 7;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 8 ******/
			initialDate = LocalDate.parse("2018-12-31", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2019-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 1;
			test = 8;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 9 ******/
			initialDate = LocalDate.parse("2018-05-31", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2018-06-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 1;
			test = 9;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 10 ******/
			initialDate = LocalDate.parse("2018-05-31", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2019-06-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 366;
			test = 10;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 11 ******/
			initialDate = LocalDate.parse("2016-02-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2016-03-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 29;
			test = 11;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 12 ******/
			initialDate = LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2016-03-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 60;
			test = 12;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 13 ******/
			initialDate = LocalDate.parse("1981-09-21", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2009-02-12", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 10006;
			test = 13;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 14 ******/
			initialDate = LocalDate.parse("1981-07-31", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2009-02-12", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 10058;
			test = 14;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 15 ******/
			initialDate = LocalDate.parse("2004-03-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2009-02-12", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 1809;
			test = 15;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 16 ******/
			initialDate = LocalDate.parse("2004-03-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2009-02-12", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 1809;
			test = 16;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 17 ******/
			initialDate = LocalDate.parse("1900-02-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("1900-03-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 28;
			test = 17;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 18 ******/
			initialDate = LocalDate.parse("1899-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("1901-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 730;
			test = 18;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 19 ******/
			initialDate = LocalDate.parse("2000-02-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2000-03-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome =  29;
			test = 19;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

			/****** Test 20 ******/
			initialDate = LocalDate.parse("1999-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
			finalDate = LocalDate.parse("2001-01-01", DateTimeFormatter.ISO_LOCAL_DATE);

			diff = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());
			result = diff.toDays();
			expectedOutcome = 731;
			test = 20;
			if (result == expectedOutcome){
				System.out.println("Teste " + test + " passou." );
			}else {
				System.out.println("Teste "+ test +" NAO passou, Resultado esperado = " + result + ", Resultado obtido = " + expectedOutcome);
			}

		}
}

