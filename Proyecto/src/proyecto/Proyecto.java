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
				Menu.limpiar();
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
					System.out.println("Hecho");
					Menu.Continuar();
					break;
				case 3: // ELIMINAR-------------------------

					System.out.println("Usted eligio Eliminar--------");
					H.eliminar_habitacion();
					System.out.println("Hecho");
					Menu.Continuar();
					break;
				case 4: // LISTAR TODOO---------------------

					System.out.println("Usted eligio Listar todo-------");
					Habitaciones.listar_habitaciones(1, null);
					Menu.Continuar();
					break;
				case 5: // BUSCAR---------------------------

					System.out.println("Usted eligio Buscar------------");
					H.buscar_habitacion();
					Menu.Continuar();
					break;

				case 0:
					System.out.println("Usted eligio Volver---------");

					break;

				default:
					System.out.println("Usted no selecciono una opcion valida---------");

				}
				break;

			case 2: // MENU CLIENTES------------------------
				Menu.limpiar();
				menu.cliente();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH CLIENTES-----------

				case 1:
					System.out.println("Usted eligio Registrar");
					C.Registrar_Cliente();
					break;
				case 2:
					System.out.println("Usted eligio Modificar");
					C.Modificar_Cliente();
					break;
				case 3:
					C.Eliminar_Cliente();
					System.out.println("Usted eligio Eliminar");
					break;
				case 4:
					Clientes.Listar_Cliente(1, null);
					System.out.println("Usted eligio Listar todo");
					break;
				case 5:
					System.out.println("Usted eligio Buscar por CI");
					C.Buscar_Cliente();
					break;
				case 0:
					System.out.println("Usted eligio Volver");
					break;
				default:
					System.out.println("Usted selecciono una opcion valida");
				}
				break;

			case 3: // MENU RESERVAS--------------------------
				Menu.limpiar();
				menu.reservas();
				op2 = dato.nextInt();

				switch (op2) { // SWITCH RESERVAS-------------

				case 1:
					System.out.println("Usted eligio Reservar");
					R.reservar();
					break;
				case 2:
					R.mostrar_reservas();
					Menu.Continuar();
					break;
				case 3:
					Habitaciones.listar_habitaciones(3, null);
					Menu.Continuar();
					break;
				case 4:
					System.out.println("Usted eligio liberar");
					R.liberar();
					Menu.Continuar();
				case 0:
					break;

				}
				break;

			case 0:
				System.exit(0);
			}

		} while (true);

	}

}
