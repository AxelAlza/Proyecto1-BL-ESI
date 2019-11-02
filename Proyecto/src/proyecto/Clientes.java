package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Clientes {

	static Scanner dato = new Scanner(System.in);

	static ArrayList<Cliente> C = new ArrayList<Cliente>();

	public class Cliente {
		String Nombre;
		String Apellido;
		String Cedula;
		String Nro_telefono;
		String Email;

		public void Mostrar_informacion_de_Cliente() {

			System.out.println("Nombre y Apellido - " + this.Nombre + " " + this.Apellido);
			System.out.println("Cedula - " + this.Cedula);
			System.out.println("Telefono - " + this.Nro_telefono);
			System.out.println("Email - " + this.Email);
		}

		private Cliente() {

			System.out.println("Ingresar Nombre : ");
			this.Nombre = dato.nextLine();
			System.out.println("Ingresar Apellido : ");
			this.Apellido = dato.nextLine();
			System.out.println("Ingresar Cedula : ");
			this.Cedula = dato.nextLine();
			System.out.println("Ingresar Nro de telefono : ");
			this.Nro_telefono = dato.nextLine();
			System.out.println("Ingresar Email : ");
			this.Email = dato.nextLine();

		}
	}

	public void Registrar_Cliente() {
		C.add(new Cliente());

	}

	public static Cliente getCliente() {
		Menu.limpiar();
		Listar_Cliente(1, null);
		System.out.println("A nombre de quien estara la habitacion?" + "");
		int op = dato.nextInt();
		return C.get(op - 1);
	}

	public static void Listar_Cliente(int N, String busqueda) {

		Menu.limpiar();
		if (C.isEmpty()) {
			System.out.println("No hay habitaciones");

			// MODO NORMAL
		} else if (N == 1) {
			for (Cliente cliente : C) {

				System.out.println("////////////////////");
				System.out.println("Cliente N° -" + (C.indexOf(cliente) + 1));
				cliente.Mostrar_informacion_de_Cliente();
				System.out.println("////////////////////");
				System.out.println("--------------------");

			} // MODO BUSQUEDA
		} else if (N == 2) {
			for (Cliente cliente : C) {
				if (cliente.Cedula.contains(busqueda)) {
					System.out.println("////////////////////");
					System.out.println("Cliente N° -" + (C.indexOf(cliente) + 1));
					cliente.Mostrar_informacion_de_Cliente();
					System.out.println("////////////////////");
					System.out.println("--------------------");

				}
			}
		}

	}

	public void Modificar_Cliente() {
		if (!C.isEmpty()) {
			Clientes.Listar_Cliente(1, null);
			System.out.println("Que cliente quiere modificar");
			int op = dato.nextInt();
			C.set(op - 1, new Cliente());
		} else {
			System.out.println("Nada que modificar");
		}

	}

	public void Eliminar_Cliente() {
		if (!C.isEmpty()) {
			Clientes.Listar_Cliente(1, null);
			System.out.println("Que cliente quiere eliminar");
			int op = dato.nextInt();
			C.remove(op - 1);
		} else {
			System.out.println("Nada que eliminar");
		}

	}

	public void Buscar_Cliente() {

		System.out.println("Busque cliente por cedula - Ingrese una");
		String busqueda = dato.next();
		Clientes.Listar_Cliente(2, busqueda);

	}
}
