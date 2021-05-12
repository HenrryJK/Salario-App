package com.soaps;

import java.util.Scanner;

public class ClienteService {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int horas;
		double tarifa;
		System.out.print("Horas trabajados:  ");
		horas= keyboard.nextInt();
		System.out.print("Tarifa o cuotas por la hora:   ");
	 tarifa= keyboard.nextDouble();
	
	 
		CalcularSalarioImplService calcular = new CalcularSalarioImplService();
		CalcularSalarioDao cliente = calcular.getCalcularSalarioImplPort();
		System.out.print("El Sueldo es de:  ");
		System.out.println(cliente.calcularSalario(horas, tarifa));
		keyboard.close();
	}
}
