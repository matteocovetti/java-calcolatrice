package jana60;

public class CalcoliTest {

	public static void main(String[] args) {

		// prova metodo somma
		System.out.println("La somma è: " + CalcoliHelper.somma(8, 9));
		// prova metodo somma overload
		System.out.println("La somma è: " + CalcoliHelper.somma(15.34, 14.25));

		// prova sottrazione
		System.out.println("La sottrazione è: " + CalcoliHelper.sottrazione(0, 10));
		// prova sottrazione overload
		System.out.println("La sottrazione è: " + CalcoliHelper.sottrazione(18.25, 10.20));

		// prova differenza
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10, 2));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(2, 10));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10, 10));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10, -2));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(-2, 10));
		// prova differenza overload
		System.out.println("La differenza è: " + CalcoliHelper.differenza(15.96, 10.46));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(10.46, 15.96));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(15.96, 15.96));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(15.96, -10.46));
		System.out.println("La differenza è: " + CalcoliHelper.differenza(-15.96, 10.46));

		// prova moltiplicazione
		System.out.println("La moltiplicazione è: " + CalcoliHelper.moltiplicazione(5, 9));
		// prova moltiplicazione overload
		System.out.println("La moltiplicazione è: " + CalcoliHelper.moltiplicazione(18.67, 3.15));

		// prova valore assoluto
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(5));
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(-5));
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(0));
		// prova valore assoluto overload
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(14.63));
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(-14.63));
		System.out.println("Il valore assoluto è: " + CalcoliHelper.valoreAssoluto(0));

		// prova minimo
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(10, 3));
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(2, 10));
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(9, 9));
		// prova minimo overload
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(17.98, 6.54));
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(7.35, 7.68));
		System.out.println("Il valore minimo è: " + CalcoliHelper.minimo(17.98, 17.98));

		// prova massimo
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(10, 3));
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(2, 16));
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(18, 18));
		// prova massimo overload
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(15.34, 6.44));
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(2.48, 9.54));
		System.out.println("Il valore massimo è: " + CalcoliHelper.massimo(15.34, 15.34));
	}

}
