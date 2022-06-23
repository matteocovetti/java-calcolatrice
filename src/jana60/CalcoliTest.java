package jana60;

public class CalcoliTest {

	public static void main(String[] args) {

		// prova metodo somma
		System.out.println("La somma �: " + CalcoliHelper.somma(8, 9));

		// prova sottrazione
		System.out.println("La sottrazione �: " + CalcoliHelper.sottrazione(0, 10));

		// prova differenza
		System.out.println("La differenza �: " + CalcoliHelper.differenza(10, 2));
		System.out.println("La differenza �: " + CalcoliHelper.differenza(2, 10));
		System.out.println("La differenza �: " + CalcoliHelper.differenza(10, 10));
		System.out.println("La differenza �: " + CalcoliHelper.differenza(10, -2));
		System.out.println("La differenza �: " + CalcoliHelper.differenza(-2, 10));

		// prova moltiplicazione
		System.out.println("La moltiplicazione �: " + CalcoliHelper.moltiplicazione(5, 9));

		// prova valore assoluto
		System.out.println("Il valore assoluto �: " + CalcoliHelper.valoreAssoluto(5));
		System.out.println("Il valore assoluto �: " + CalcoliHelper.valoreAssoluto(-5));
		System.out.println("Il valore assoluto �: " + CalcoliHelper.valoreAssoluto(0));

		// prova minimo
		System.out.println("Il valore minimo �: " + CalcoliHelper.minimo(10, 3));
		System.out.println("Il valore minimo �: " + CalcoliHelper.minimo(2, 10));
		System.out.println("Il valore minimo �: " + CalcoliHelper.minimo(9, 9));

		// prova massimo
		System.out.println("Il valore massimo �: " + CalcoliHelper.massimo(10, 3));
		System.out.println("Il valore massimo �: " + CalcoliHelper.massimo(2, 16));
		System.out.println("Il valore massimo �: " + CalcoliHelper.massimo(18, 18));
	}

}
