package taller2.parteB;

import taller2.parteB.financiero.Banco;

public class Main {

	public static void main(final String[] args) {
		
		Banco banco1 =  new Banco();
		banco1.setDineroTotal(150000);
		banco1.setNombre("Banco de la prosperidad");
		
		Banco banco2 =  new Banco();
		banco2.setDineroTotal(50000);
		banco2.setNombre("Banco del dinero");
		
		
		Persona persona1 = new Persona();
		persona1.nombre = "Alejandro";
		persona1.setEdad(20);
		
		Persona persona2 = new Persona();
		persona2.nombre = "Jaime";
		persona2.setEdad(48);
		
		persona1.cuentaBancaria.banco =  banco2;
		banco2.setCuentas(persona1.cuentaBancaria);
		persona2.cuentaBancaria.banco =  banco2;
		banco2.setCuentas(persona2.cuentaBancaria);
		
		persona1.cuentaBancaria.agregarDinero(100000);
		
		persona2.cuentaBancaria.agregarDinero(10000);
		
		persona2.cuentaBancaria.retirarDinero(5600);
		
		System.out.println(persona2.cuentaBancaria.verDinero());
		
		System.out.println(Banco.getFondosNacionales());
		
	}

}
