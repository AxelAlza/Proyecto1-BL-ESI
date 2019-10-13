package proyecto;

import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int inc = 0;
		Scanner dato = new Scanner(System.in);
		int op2;
		int op;
		Menu menu = new Menu();
		Habitaciones H = new Habitaciones();
		int[] numerodehabitaciones = new int[3];
		String[] nombredehabitaciones = new String[3];
		do {

			menu.principal();
			op = dato.nextInt();

			switch (op) { // MENU PRINCIPAL

			case 1: // MENU HABITACIONES
				menu.habitaciones();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH HABITACIONES

				case 1:

					System.out.println("Usted eligio Registrar");
					do {

						if (numerodehabitaciones[inc] == 0) {

							numerodehabitaciones[inc] = H.registrarnumero();

							nombredehabitaciones[inc] = H.registronombre();

							break;

						} else {
							inc++;
						}
					} while (inc <= 2);

					break;
				case 2:
					System.out.println("Usted eligio Modificar");
					System.out.println("Seleccione la posicion a modificar");

					for (int i = 0; i <= 2; i++) {
						System.out.println("Habitacion numero " + i);
						System.out.println(numerodehabitaciones[i]);
						System.out.println(nombredehabitaciones[i]);
					}

					op2 = dato.nextByte();
					numerodehabitaciones[op2] = H.registrarnumero();
					nombredehabitaciones[op2] = H.registronombre();

					break;
				case 3:
					System.out.println("Usted eligio Eliminar");
					for (int i = 0; i <= 2; i++) {
						System.out.println("Habitacion numero " + i);
						System.out.println(numerodehabitaciones[i]);
						System.out.println(nombredehabitaciones[i]);
					}

					op2 = dato.nextByte();
					numerodehabitaciones[op2] = 0;
					nombredehabitaciones[op2] = null;

					break;
				case 4:

					System.out.println("Usted eligio Listar todo");
					for (int i = 0; i <= 2; i++) {
						System.out.println("Habitacion nro " + i);
						System.out.println(numerodehabitaciones[i]);
						System.out.println(nombredehabitaciones[i]);

					}

					break;
				case 5:
					System.out.println("Usted eligio Buscar");
					break;
				case 0:
					System.out.println("Usted eligio Volver");
					break;
				default:
					System.out.println("Usted no selecciono una opcion valida");

				}

			case 2: // MENU CLIENTES

				menu.cliente();

				op2 = dato.nextInt();

				switch (op2) { // SWITCH CLIENTES

				case 1:
					System.out.println("Usted eligio Registrar");
					break;
				case 2:
					System.out.println("Usted eligio Modificar");
					break;
				case 3:
					System.out.println("Usted eligio Eliminar");
					break;
				case 4:
					System.out.println("Usted eligio Listar todo");
					break;
				case 5:
					System.out.println("Usted eligio Buscar por CI");
					break;
				case 0:
					System.out.println("Usted eligio Volver");
					break;
				default:
					System.out.println("Usted selecciono una opcion valida");
				}

			case 3: // MENU RESERVAS
				menu.reservas();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH RESERVAS

				case 1:
					System.out.println("Usted eligio Reservas");
					break;
				case 2:
					System.out.println("Usted eligio lista de habitaciones y clientes");
					break;
				case 3:
					System.out.println("Usted eligio consultar estado de habitacion");
					break;
				case 0:
					break;

				}

			}

		} while (true);

	}

}
