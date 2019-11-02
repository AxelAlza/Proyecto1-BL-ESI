package proyecto;

import java.util.ArrayList;
import java.util.Scanner;

import proyecto.Clientes.Cliente;
import proyecto.Habitaciones.Habitacion;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Reservas {

	Scanner dato = new Scanner(System.in);
	private ArrayList<Reserva> R = new ArrayList<Reserva>();

	private class Reserva {

		String fecha_entrada;
		StringBuffer fecha_salida;
		Habitacion habitacion;
		Cliente cliente;

		public Reserva() {
			this.habitacion = Habitaciones.getHabitacion();
			this.cliente = Clientes.getCliente();
			System.out.println("La fecha de entrada por defecto es hoy y no puede cambiarla");
			LocalDateTime fecha = LocalDateTime.now();
			DateTimeFormatter fechaf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			this.fecha_entrada = fecha.format(fechaf);
			System.out.println("Ingrese Fecha de Salida");
			System.out.println("Dia");
			String dia = dato.next();
			System.out.println("Mes");
			String mes = dato.next();
			System.out.println("Año");
			String año = dato.next();
			StringBuffer Fecha = new StringBuffer(10);
			Fecha = Fecha.append(dia);
			Fecha = Fecha.append("/");
			Fecha = Fecha.append(mes);
			Fecha = Fecha.append("/");
			Fecha = Fecha.append(año);
			this.fecha_salida = Fecha;

		}

		public void mostrar_info() {
			System.out.println("Habitacion-------------");
			this.habitacion.mostrar_informacion_habitacion();
			System.out.println("Cliente----------------");
			this.cliente.Mostrar_informacion_de_Cliente();
			System.out.println("/////////////////////////");
			System.out.println("Fecha de Entrada - " + this.fecha_entrada);
			System.out.println("Fecha de Salida - " + this.fecha_salida);
		}
	}

	public void reservar() {
		Menu.limpiar();
		R.add(new Reserva());
	}

	public void liberar() {
		Menu.limpiar();
		this.mostrar_reservas();
		int op = dato.nextInt();
		R.get(op).habitacion.reservado = false;
		R.remove(op - 1);

	}

	public void mostrar_reservas() {
		Menu.limpiar();
		for (Reserva reserva : R) {
			System.out.println("Reserva nro - " + (R.indexOf(reserva) + 1));
			reserva.mostrar_info();
		}
	}

}
