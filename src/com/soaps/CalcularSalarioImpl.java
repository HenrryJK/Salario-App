package com.soaps;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soaps.CalcularSalarioDao")
public class CalcularSalarioImpl implements CalcularSalarioDao {

	@Override
	public double calcularSalario(int hours, double tarifa) {
		double sueldo=0;
		if (hours<41) {
			sueldo=hours*tarifa;
		}else {
			sueldo=(40*tarifa)+((hours-40)*(tarifa*1.5));
		}
		return sueldo;
	}

}
