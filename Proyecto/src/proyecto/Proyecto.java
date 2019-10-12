package proyecto;

import java.util.Scanner;

public class Proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dato = new Scanner(System.in);

		do {
			System.out.println("Menu");
			System.out.println("");
			System.out.println("1-Habitaciones");
			System.out.println("2-Clientes");
			System.out.println("3-Reservas");
			System.out.println("0-Salir");
			int op2;
			int op;
			op = dato.nextInt();

			switch (op) // Menu principal
			{
			case 1:
				System.out.println("1-Registrar");
				System.out.println("2-Modificar");
				System.out.println("3-Eliminar");
				System.out.println("4-Listar todo");
				System.out.println("5-Buscar");
				System.out.println("0-Volver");
				op2 = dato.nextInt();
				switch (op2) // Habitaciones
				{
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
					System.out.println("Usted eligio Buscar");
					break;
				case 0:
					System.out.println("Usted eligio Volver");
					break;
				default:
					System.out.println("Usted no selecciono una opcion valida");

				}

			case 2:
				System.out.println();
				System.out.println("1-Registrar");
				System.out.println("2-Modificar");
				System.out.println("3-Eliminar");
				System.out.println("4-Listar Todos");
				System.out.println("5-Buscar por CI");
				System.out.println("0-Volver");
				op2 = dato.nextInt();
				switch (op2) {
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
					System.out.println("Usted no seleccion una opcion valida");
				}

			case 3:
				System.out.println("1-Reservas");
				System.out.println("2-Lista de habitaciones y clientes");
				System.out.println("3-Consultado de habitaciones");
				System.out.println("0-Volver");
				op2 = dato.nextInt();
				switch (op2) {

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
