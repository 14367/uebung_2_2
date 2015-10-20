package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		double a = 8;
		double b = 3;
		
		double erstesBinom = a*a;
		double gemischtesDoppeltesProdukt = a*b*2;
		double zweitesBinom = b*b;
		
		double loesung = erstesBinom + zweitesBinom + gemischtesDoppeltesProdukt;
		
		System.out.println("Ergebnis = "+ loesung);

	}

}
