import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean falsche_zahl = false;
		int i_eingabe = 0;
		
		System.out.println("Geben Sie nun eine Zahl, bis zu der Primzahlen berechnet werden sollen: ");
		
		do{
			String eingabe = s.next();
			falsche_zahl = false;
			try{
				i_eingabe= Integer.parseInt(eingabe);
				if(i_eingabe < 0){
					falsche_zahl = true;
				}
			} catch(Exception e){
				System.out.println("Bitte geben sie eine gültige Zahl ein:");
				falsche_zahl = true;
			}
			
		}while(falsche_zahl);
		
		s.close();
			
		System.out.println("Ihre Eingabe: " + i_eingabe + "\n" + "Haben Sie ein wenig Geduld. Ihre Primzahlen werden berechnet!" + "\n" + "...");	
		
		ArrayList<Integer> list = prime(i_eingabe);
		String list_s = list.toString();
		System.out.println("Prime Numbers = " + list_s);
	}
	
	public static ArrayList<Integer> prime(int value) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		boolean prim;
		
		for(int i = 0; i <= value; i++){
			
			prim = true;
      	
      		for (int j = 2; j <= i/2; j++) {
        		if (i % j == 0) {
        			prim = false;
        			break;
        		}
      		}
			
			if(prim){
				list.add(i);
			}
		}
	return list;
	}
}


