import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introducir Nombre");
		String nombre = scanner.nextLine();
		System.out.println("Introducir Apellidos");
		String apellidos = scanner.nextLine();
		
		System.out.println("Introducir Edad");
		int edad = scanner.nextInt();
		
		Persona p = new Persona(nombre, apellidos, edad);

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
}