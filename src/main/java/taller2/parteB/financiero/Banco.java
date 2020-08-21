package taller2.parteB.financiero;

import java.util.ArrayList;

public class Banco{

	static ** int fondosNacionales;
    ** String nombre;
    ** int dineroTotal;
    
    private ArrayList<Cuenta> cuentas =  new ArrayList<Cuenta>();

    ** void retirarFondos(int cantidad){
    	dineroTotal -= cantidad;
    	Banco.fondosNacionales -=cantidad;
    }

    ** void agregarFondos(int cantidad){
    	dineroTotal += cantidad;
    	Banco.fondosNacionales +=cantidad;
    }

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta cuentaBancaria) {
		cuentas.add(cuentaBancaria);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreBanco) {
		nombre = nombreBanco;
	}

	public int getDineroTotal() {
		return dineroTotal;
	}

	public void setDineroTotal(int dinero) {
		dineroTotal = dinero;
		Banco.fondosNacionales +=dinero;
	}
    
	public static int getFondosNacionales() {
		return fondosNacionales;
	}
}