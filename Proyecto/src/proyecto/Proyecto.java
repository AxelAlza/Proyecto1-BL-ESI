package proyecto;

import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {

		// Variables Miscelaneas
		Scanner dato = new Scanner(System.in);
		Menu menu = new Menu();
		int inc = 0;
		int op2;
		int op;
		// ----------------------------------------------

		// Variables Habitaciones------------------------
		Habitaciones H = new Habitaciones();
		int[] numerodehabitaciones = new int[3];
		String[] nombredehabitaciones = new String[3];
		// ----------------------------------------------

		
		
		// PROGRAMA
		do {

			menu.principal();
			op = dato.nextInt();

			switch (op) { // MENU PRINCIPAL

			case 1: // MENU HABITACIONES
				menu.habitaciones();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH HABITACIONES

				case 1: // REGISTRAR

					System.out.println("Usted eligio Registrar--------");
					do {

						if (numerodehabitaciones[inc] == 0) {

							numerodehabitaciones[inc] = H.registrarnumero();

							nombredehabitaciones[inc] = H.registronombre();
							System.out.println("--------------");

							break;

						} else {
							inc++;
						}
					} while (inc <= 2);

					break;
				case 2: // MODIFICAR
					System.out.println("Usted eligio Modificar-------");
					System.out.println("Seleccione la posicion a modificar");

					for (int i = 0; i <= 2; i++) {
						if (nombredehabitaciones[i] != null) {
							System.out.println("--------------");
							System.out.println("Habitacion numero " + (i + 1) + ":");
							System.out.println("Nro° - " + numerodehabitaciones[i]);
							System.out.println("Clase - " + nombredehabitaciones[i]);
							System.out.println("--------------");
						}

					}
					op2 = dato.nextByte();
					numerodehabitaciones[(op2 - 1)] = H.registrarnumero();
					nombredehabitaciones[(op2 - 1)] = H.registronombre();

					break;
				case 3: // ELIMINAR
					System.out.println("Usted eligio Eliminar--------");
					for (int i = 0; i <= 2; i++) {
						if (nombredehabitaciones[i] != null) {
							System.out.println("--------------");
							System.out.println("Habitacion numero " + (i + 1) + ":");
							System.out.println("Nro° - " + numerodehabitaciones[i]);
							System.out.println("Clase - " + nombredehabitaciones[i]);
							System.out.println("--------------");
						} else {
							System.out.println("--------------");
							System.out.println("Habitacion numero " + (i + 1) + ": Vacio");
							System.out.println("--------------");

						}

					}

					op2 = dato.nextByte();
					numerodehabitaciones[(op2 - 1)] = 0;
					nombredehabitaciones[(op2 - 1)] = null;

					break;
				case 4: // LISTAR TODOO

					System.out.println("Usted eligio Listar todo-------");
					for (int i = 0; i <= 2; i++) {
						if (nombredehabitaciones[i] != null) {
							System.out.println("--------------");
							System.out.println("Habitacion numero " + (i + 1) + ":");
							System.out.println("Nro° - " + numerodehabitaciones[i]);
							System.out.println("Clase - " + nombredehabitaciones[i]);
							System.out.println("--------------");
						} else {
							System.out.println("--------------");
							System.out.println("Habitacion numero " + (i + 1) + ": Vacio");
							System.out.println("--------------");

						}

					}

					break;
				case 5: // BUSCAR
					System.out.println("Usted eligio Buscar---------");
					System.out.println("Escriba la clase o el numero de su habitacion");
					String buscar = dato.next();
					for (int i = 0; i <= 2; i++) {
						if (nombredehabitaciones[i] != null) {
							if (nombredehabitaciones[i].contains(buscar)
									|| buscar.contains(String.valueOf(numerodehabitaciones[i])))
								System.out.println("--------------");
							System.out.println("Habitacion nro " + (i + 1));
							System.out.println("Nro° - " + numerodehabitaciones[i]);
							System.out.println("Clase - " + nombredehabitaciones[i]);
							System.out.println("--------------");
						}

					}

					break;
				case 0:
					System.out.println("Usted eligio Volver---------");
					break;
				default:
					System.out.println("Usted no selecciono una opcion valida---------");

				}
				break;

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
				break;

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
				break;
			}

		} while (true);

	}

}
