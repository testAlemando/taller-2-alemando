package taller2.parteB.**;


public class Cuenta{

    ** Banco banco;

    int dinero;

    public void retirarDinero(int cantidad){
        dinero -= cantidad;
        banco.retirarFondos(cantidad);
    }

    public void agregarDinero(int cantidad){
        dinero += cantidad;
        banco.agregarFondos(cantidad);
    }

    public int verDinero(){
        return dinero;
    }
}