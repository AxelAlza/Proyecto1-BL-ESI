package proyecto;

public class Menu {

	public void principal() {
		System.out.println("Menu");
		System.out.println("");
		System.out.println("1-Habitaciones");
		System.out.println("2-Clientes");
		System.out.println("3-Reservas");
		System.out.println("0-Salir");
	}

	public void cliente() {
		System.out.println();
		System.out.println("1-Registrar");
		System.out.println("2-Modificar");
		System.out.println("3-Eliminar");
		System.out.println("4-Listar Todos");
		System.out.println("5-Buscar por CI");
		System.out.println("0-Volver");
	}

	public void habitaciones() {
		System.out.println("1-Registrar");
		System.out.println("2-Modificar");
		System.out.println("3-Eliminar");
		System.out.println("4-Listar todo");
		System.out.println("5-Buscar");
		System.out.println("0-Volver");
	}

	public void reservas() {
		System.out.println("1-Reservas");
		System.out.println("2-Lista de habitaciones y clientes");
		System.out.println("3-Consultado de habitaciones");
		System.out.println("0-Volver");
	}
}
