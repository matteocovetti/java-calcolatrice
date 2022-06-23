package jana60;

public class CalcoliTest {

	public static void main(String[] args) {

		// prova metodo somma
		System.out.println("La somma è: " + CalcoliHelper.somma(8, 9));

		// prova sottrazione
		System.out.println("La sottrazione è: " + CalcoliHelper.sottrazione(0, 10));

		// prova differenza
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10, 2));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(2, 10));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10, 10));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10, -2));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(-2, 10));

		// prova moltiplicazione
		System.out.println("La moltiplicazione è: " + CalcoliHelper.moltiplicazione(5, 9));

		// prova valore assoluto
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(5));
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(-5));
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(0));

		// prova minimo
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(10, 3));
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(2, 10));
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(9, 9));

		// prova massimo
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(10, 3));
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(2, 16));
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(18, 18));
	}

}
