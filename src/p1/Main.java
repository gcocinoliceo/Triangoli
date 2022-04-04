package p1;
import java.io.*;

public class Main {
    public static int intScan() {
        int intoutput = 0;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        try {
            intoutput = Integer.valueOf(kb.readLine()).intValue();
        } catch (Exception e) {
            System.out.println("Data error.");
            intScan();
        }

        return intoutput;
    }

	public static void main (String[] args) {
		int input=0, l1, l2, l3;
		System.out.println("1. Calcola perimetro triangolo\n"+
			 			   "2. Calcola perimetro triangolo isoscele\n"+
			 			   "3. Calcola perimetro triangolo equilatero\n");
		
		switch(input) {
			case 1:
				System.out.println("Inserisci i tre lati separati da un new line");
				l1 = intScan();
				l2 = intScan();
				l3 = intScan();
				Triangolo t = new Triangolo(l1, l2, l3);
				System.out.println("Il perimetro è "+ t.getPerimeter()+"\n");
			case 2:
				System.out.println("Inserisci il lato obliquo e la base separati da un new line");
				l1 = intScan();
				l2 = intScan();
				TriangoloIsoscele t1 = new TriangoloIsoscele(l1, l2);
				System.out.println("Il perimetro è "+ t1.getPerimeter()+"\n");
			case 3:
				System.out.println("Inserisci il lato");
				l1 = intScan();
				TriangoloEquilatero t2 = new TriangoloEquilatero(l1);
				System.out.println("Il perimetro è "+ t2.getPerimeter()+"\n");
			default:
			
		}
	}
 
 	
}
