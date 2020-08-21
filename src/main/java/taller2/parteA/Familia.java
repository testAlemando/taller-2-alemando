package taller2.parteA;

class Familia {
	Animal papa;
	Animal mama;
	Animal hijo;

	void imprimir() {
		String genero;
		if (hijo.genero.equals("M"))
			genero = "masculino";
		else
			genero = "femenino";
		System.out.println(papa.nombre + " es el papa, " 
			+ mama.nombre + " es la mama, y " + hijo.nombre 
			+ " es el hijo de genero " + genero);
	}
}

