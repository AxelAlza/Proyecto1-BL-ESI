package proyecto;

import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {

		// Variables Miscelaneas----------------------------
		Scanner dato = new Scanner(System.in);
		int op2;
		int op;
		// -------------------------------------------------

		// Instancias de clases------------------------------
		Habitaciones H = new Habitaciones();
		Reservas R = new Reservas();
		Clientes C = new Clientes();
		Menu menu = new Menu();
		// -------------------------------------------------

		// PROGRAMA-----------------------------------------
		do {
		
			menu.principal();
			op = dato.nextInt();

			switch (op) { // MENU PRINCIPAL-----------------

			case 1: // MENU HABITACIONES
			
				menu.habitaciones();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH HABITACIONES-------

				case 1: // REGISTRAR------------------------

				
					System.out.println("Usted eligio Registrar--------");
					H.registrar_habitacion();

					break;
				case 2: // MODIFICAR------------------------
				
					System.out.println("Usted eligio Modificar-------");
					H.modificar_habitacion();
					break;
				case 3: // ELIMINAR-------------------------
				
					System.out.println("Usted eligio Eliminar--------");
					H.eliminar_habitacion();
					break;
				case 4: // LISTAR TODOO---------------------
			
					System.out.println("Usted eligio Listar todo-------");
					H.listar_habitaciones(1, null);
					break;
				case 5: // BUSCAR---------------------------
				
					System.out.println("Usted eligio Buscar------------");
					H.buscar_habitacion();
					break;

				case 0:
					System.out.println("Usted eligio Volver---------");

					break;

				default:
					System.out.println("Usted no selecciono una opcion valida---------");

				}
				break;

			case 2: // MENU CLIENTES------------------------
				
				menu.cliente();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH CLIENTES-----------

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

			case 3: // MENU RESERVAS--------------------------
				
				menu.reservas();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH RESERVAS-------------

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
