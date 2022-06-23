package jana60;

public class CalcoliHelper {
	/*
	 * Creare una classe di helper CalcoliHelper. Come visto a lezione, strutturare
	 * la classe in modo che non possa essere istanziata (cio� non posso creare
	 * oggetti di tipo CalcoliHelper con la parola chiave new) e che presenti i
	 * seguenti metodi static: - Somma di due numeri interi - Differenza tra due
	 * numeri interi - Moltiplicazione di due numeri interi - Valore assoluto di un
	 * numero intero - Minimo tra due numeri interi - Massimo tra due numeri interi
	 * Create anche una classe CalcoliTest con il metodo main in cui testate tutti i
	 * metodi della vostra classe di helper (con un esempio per ogni casistica)
	 */

	/*
	 * BONUS 1: per ogni metodo scrivetene una versione che esegue le stesse
	 * operazioni ma su parametri double. Il fatto di dover scrivere lo stesso
	 * metodo per tipi di parametro diversi applica nella pratica uno dei principi
	 * di programmazione ad oggetti�Quale? Scrivetelo in un commento all�interno del
	 * vostro codice!
	 */

	/*
	 * Il principio della programmazione ad oggetti applicato nel bonus 1 � quello
	 * dell'overload. Ovvero creare pi� metodi con lo stesso nome ma con parametri
	 * diversi.
	 */

	// costruttore private
	private CalcoliHelper() {

	}

	// metodi

	// metodo somma
	public static int somma(int x, int y) {
		return x + y;
	}

	// overload somma
	public static double somma(double x, double y) {
		return x + y;
	}

	// metodo sottrazione
	public static int sottrazione(int x, int y) {
		return x - y;
	}

	// overload sottrazione
	public static double sottrazione(double x, double y) {
		return x - y;
	}

	// metodo differenza
	public static int differenza(int x, int y) {
		if (x >= y) {
			return x - y;
		} else {
			return y - x;
		}
	}

	// overload differenza
	public static double differenza(double x, double y) {
		if (x >= y) {
			return x - y;
		} else {
			return y - x;
		}
	}

	// metodo moltiplicazione
	public static int moltiplicazione(int x, int y) {
		return x * y;
	}

	// overload moltiplicazione
	public static double moltiplicazione(double x, double y) {
		return x * y;
	}

	// metodo valore assoluto
	public static int valoreAssoluto(int x) {
		if (x >= 0) {
			return x;
		} else {
			return -x;
		}
	}

	// overload valore assoluto
	public static double valoreAssoluto(double x) {
		if (x >= 0) {
			return x;
		} else {
			return -x;
		}
	}

	// metodo minimo tra due interi
	public static int minimo(int x, int y) {
		if (x >= y) {
			return y;
		} else {
			return x;
		}
	}

	// overload minimo tra due interi
	public static double minimo(double x, double y) {
		if (x >= y) {
			return y;
		} else {
			return x;
		}
	}

	// metodo massimo tra due interi
	public static int massimo(int x, int y) {
		if (x >= y) {
			return x;
		} else {
			return y;
		}
	}

	// overload massimo tra due interi
	public static double massimo(double x, double y) {
		if (x >= y) {
			return x;
		} else {
			return y;
		}
	}

}
