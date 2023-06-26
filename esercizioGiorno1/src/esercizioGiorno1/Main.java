package esercizioGiorno1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//ESERCIZIO 1
		System.out.println("Project1: esercizioGiorno1");
		
		//ESERCIZIO 2
		int num1 = 10;
		int num2 = 5;
		System.out.println("Il risultato della moltiplicazione tra num1 e num2 è: " + moltiplica(num1, num2));
		
		String nome = "Francesco";
		System.out.println(concatena(nome, num1));
		
		//ESERCIZIO 3

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome");
		String name = input.nextLine();
		System.out.println("Inserisci il tuo cognome");
		String cognome = input.nextLine();
		System.out.println("Inserisci la tua città");
		String citta = input.nextLine();
		
		concatenaStringa(name, cognome, citta);
		
		//ESERCIZIO 4
		
		//INPUT CALCOLO AREA RETTANGOLO
        System.out.println("Inserisci la lunghezza del rettangolo");
        double lunghezza = Double.parseDouble(input.nextLine());
        System.out.println("Inserisci la larghezza del rettangolo");
        double larghezza = Double.parseDouble(input.nextLine());
        double perimetro = perimetroRettangolo(lunghezza, larghezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        
        
        //INPUT CALCOLO PARI E DISPARI
       
        System.out.println("inserisci un numero");
        int c = Integer.parseInt(input.nextLine());
        int risultato = (pariDispari(c));
        System.out.println("Il risultato è: " +  risultato );
       
       
        //INPUT CALCOLO AREA 
	    
		System.out.println("Inserisci la lunghezza del primo lato");
	    double lato1 = Double.parseDouble(input.nextLine());
        System.out.println("Inserisci la lunghezza del secondo lato");
	    double lato2 = Double.parseDouble(input.nextLine());
	    System.out.println("Inserisci la lunghezza del terzo lato");
	    double lato3 = Double.parseDouble(input.nextLine());
        double area = areaTriangolo(lato1, lato2, lato3);
	    System.out.println("Il perimetro del triangolo è: " + area);
	    input.close();
		
	}
	//METODO MOLTIPLICAZIONE
	public static int moltiplica(int a, int b) {
		return a * b;
	}
	
	//METODO CONCATENAZIONE
	public static String concatena(String str, int a) {
		return str + a;
	}
	
	//METODO CONCATENA STRINGA
	public static void concatenaStringa(String str1, String str2, String str3) {
		System.out.println(str3 + " " + str2 + " " + str1);
	}

	//METODO CALCOLO PERIMETRO RETTANGOLO
	public static double perimetroRettangolo(double lunghezza, double larghezza) {
		double perimetro = 2 * (lunghezza + larghezza);
		return perimetro;
	}
	
	//METODO PARI E DISPARI
	public static int pariDispari(int c) {
		if(c % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	//METODO CALCOLO AREA TRIANGOLO
	public static double areaTriangolo(double lato1, double lato2, double lato3) {
		 double semiperimetro = (lato1 + lato2 + lato3) / 2;
		 double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
         return area;
	}
}
