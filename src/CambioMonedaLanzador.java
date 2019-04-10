import java.util.Scanner;
public class CambioMonedaLanzador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		double cantidad = 0.0;
		double cambio = 0;
		CambioMoneda cambiomoneda;
		boolean fin = true;
		
		while (fin == true) {
		System.out.println("Bienvenido, el valor por defecto es 1,09. ¿Desea cambiarlo?");
		String comando = teclado.nextLine().toLowerCase();
		switch(comando) {
		case "si":
			System.out.println("Introduzca el nuevo valor de cambio");
			cambio = teclado.nextDouble();
			teclado.nextLine();
			cambiomoneda = new CambioMoneda(cambio);
			cambiomoneda.CambioMoneda(cambio);
			fin = false;
			break;
			
			case "no":
				fin = false;
				break;
		}
		}
		
		System.out.println("Escoja una opción: ");
		System.out.println("1- Cambiar de Euros a Dolares.");
		System.out.println("2- Cambiar de Dolares a Euros.");
		
		
		System.out.println("\n¿Número de opción?");
		opcion = teclado.nextInt();
		
		System.out.println("Introduzca la cantidad a cambiar: ");
		cantidad = teclado.nextDouble();
		cambiomoneda = new CambioMoneda(cantidad);
		teclado.nextLine();
		
		switch(opcion) {
		case 1:
			System.out.println("La cantidad introducida equivale a " + cambiomoneda.EurosDolares(cantidad) + " Dolares");
			break;
			
			case 2:
				System.out.println("La cantidad introducida equivale a " + cambiomoneda.DolaresEuros(cantidad) + " Euros");
				break;
		}
		
		teclado.close();
	}

}
