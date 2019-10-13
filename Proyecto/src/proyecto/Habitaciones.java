package proyecto;
import java.util.Scanner;
public class Habitaciones {
Scanner dato = new Scanner(System.in);
public int registrarnumero() {

	
int numero;
System.out.println("Ingrese un numero de habitacion");
numero = dato.nextInt();

return numero;
}
public String registronombre() {
String nombre;
System.out.println("Ingrese la clase de la habitacion de habitacion (Suite, Comun , Etc)");
nombre = dato.next();


return nombre;





	



}
}
