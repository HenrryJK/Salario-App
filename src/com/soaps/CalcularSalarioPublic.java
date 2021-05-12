package com.soaps;

import javax.xml.ws.Endpoint;

public class CalcularSalarioPublic {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:6060/soap/salario", new CalcularSalarioImpl());
		System.out.println("Funciona!!");
	}
}
