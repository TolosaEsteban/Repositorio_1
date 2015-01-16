package proyectoEntornos;

public class Tesoreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VARIABLES
		int ingresos[] = { 10, 40, 60, 120, 3 };
		int gastos[] = { -5, -120, -65};
		int balance = 0;
		int i;
		// LOGICA

		for (i = 0; i < ingresos.length; i++) {

			balance = balance + ingresos[i];

		}

		for (i = 0; i < gastos.length; i++) {

			balance = balance + gastos[i];

		}

		System.out.println("Balance total: " + balance);

		// IMPRESION
	}

}
