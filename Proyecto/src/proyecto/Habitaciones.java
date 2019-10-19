package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

public class Habitaciones {

	private Scanner dato = new Scanner(System.in);
	private ArrayList<Habitacion> H = new ArrayList<Habitacion>();

	public class Habitacion {

		int nro_habitacion;
		String clase_habitacion;

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

	public void registrar_habitacion() {

		H.add(new Habitacion());

	}

	public void listar_habitaciones(int N, String busqueda) {

		if (H.isEmpty()) {
			System.out.println("No hay habitaciones");
		
			//MODO NORMAL
		}else if (N == 1 && busqueda == null) {
			for (Habitacion habitacion : H) {
				int i = 1;
				if (habitacion != null) {
					System.out.println("////////////////////");
					System.out.println("Habitacion N° -" + i);
					habitacion.mostrar_informacion_habitacion();
					System.out.println("////////////////////");
					System.out.println("--------------------");
					i++;

				}
			}//MODO BUSQUEDA
		} else if (N == 2) {
			for (Habitacion habitacion : H) {
				int i = 1;
				if (habitacion != null) {
					if (habitacion.clase_habitacion.contains(busqueda)
							|| String.valueOf(habitacion.nro_habitacion).contains(busqueda)) {
						System.out.println("////////////////////");
						System.out.println("Habitacion N° -" + i);
						habitacion.mostrar_informacion_habitacion();
						System.out.println("////////////////////");
						System.out.println("--------------------");
						i++;
					}
				}

			}
		}
	}

	public void modificar_habitacion() {
		if (!H.isEmpty()) {
			this.listar_habitaciones(1, null);
			System.out.println("Eliga el espacio el cual modificar");
			int op = dato.nextInt();
			H.set(op - 1, new Habitacion());
		} else {
			System.out.println("Nada que modificar");
		}

	}

	public void eliminar_habitacion() {
		if (!H.isEmpty()) {
			this.listar_habitaciones(1, null);
			System.out.println("Eliga el espacio el cual Eliminar");
			int op = dato.nextInt();
			H.remove(op - 1);
		} else {
			System.out.println("Nada que eliminar");
		}
	}

	public void buscar_habitacion() {

		System.out.println("Ingrese la clase o el numero de habitacion que quiera buscar");
		String op = dato.next();
		listar_habitaciones(2, op);

	}
}
