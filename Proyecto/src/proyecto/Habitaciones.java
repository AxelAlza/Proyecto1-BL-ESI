package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Habitaciones {

	static Scanner dato = new Scanner(System.in);
	static ArrayList<Habitacion> H = new ArrayList<Habitacion>();

	public class Habitacion {

		int nro_habitacion;
		String clase_habitacion;
		boolean reservado = false;

		private Habitacion() {

			System.out.println("Ingresar nro de habitacion");
			this.nro_habitacion = dato.nextInt();
			System.out.println("Ingresar clase de habitacion (comun, penthouse, suite, deluxe, etc.)");
			this.clase_habitacion = dato.next();
		}

		public void mostrar_informacion_habitacion() {
			System.out.println("Nro de habitacion - " + this.nro_habitacion);
			System.out.println("Clase - " + this.clase_habitacion);
		}
	}

	public static Habitacion getHabitacion() {
		Menu.limpiar();
		listar_habitaciones(3, null);
		System.out.println("Seleccione que habitacion quiere reservar");
		int op = dato.nextInt();
		if (H.get(op - 1).reservado != true) {
			H.get(op - 1).reservado = true;
			return H.get(op - 1);
		}
		else {
			throw new IllegalArgumentException("Eliga una habitacion disponible");
		
				
		
		}
	}

	public void registrar_habitacion() {
		Menu.limpiar();
		H.add(new Habitacion());

	}

	public static void listar_habitaciones(int N, String busqueda) {
		Menu.limpiar();
		if (H.isEmpty()) {
			System.out.println("No hay habitaciones");

			// MODO NORMAL
		} else if (N == 1) {
			for (Habitacion habitacion : H) {

				System.out.println("////////////////////");
				System.out.println("Habitacion N° -" + (H.indexOf(habitacion) + 1));
				habitacion.mostrar_informacion_habitacion();
				System.out.println("////////////////////");
				System.out.println("--------------------");

			} // MODO BUSQUEDA
		} else if (N == 2) {
			for (Habitacion habitacion : H) {
				if (habitacion.clase_habitacion.contains(busqueda)
						|| String.valueOf(habitacion.nro_habitacion).contains(busqueda)) {
					System.out.println("////////////////////");
					System.out.println("Habitacion N° -" + (H.indexOf(habitacion) + 1));
					habitacion.mostrar_informacion_habitacion();
					System.out.println("////////////////////");
					System.out.println("--------------------");

				}

			} // MODO CONSULTA RESERVA
		} else if (N == 3) {
			for (Habitacion habitacion : H) {

				System.out.println("////////////////////");
				System.out.println("Habitacion N° -" + (H.indexOf(habitacion) + 1));
				habitacion.mostrar_informacion_habitacion();
				System.out.println("////////////////////");
				if (habitacion.reservado == true) {
					System.out.println("RESERVADO");
				} else {
					System.out.println("DISPONIBLE");
				}
				System.out.println("--------------------");

			}
		}
	}

	public void modificar_habitacion() {
		Menu.limpiar();
		if (!H.isEmpty()) {
			Habitaciones.listar_habitaciones(1, null);
			System.out.println("Eliga el espacio el cual modificar");
			int op = dato.nextInt();
			H.set(op - 1, new Habitacion());
		} else {
			System.out.println("Nada que modificar");
		}

	}

	public void eliminar_habitacion() {
		Menu.limpiar();
		if (!H.isEmpty()) {
			Habitaciones.listar_habitaciones(1, null);
			System.out.println("Eliga el espacio el cual Eliminar");
			int op = dato.nextInt();
			H.remove(op - 1);
		} else {
			System.out.println("Nada que eliminar");
		}
	}

	public void buscar_habitacion() {
		Menu.limpiar();
		System.out.println("Ingrese la clase o el numero de habitacion que quiera buscar");
		String op = dato.next();
		listar_habitaciones(2, op);

	}
}
