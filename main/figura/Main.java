package main.figura;

import main.felino.IFelino;
import main.felino.IFelinoSalvaje;
import main.felino.Jaguar;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(10,14.5);
        Rectangulo rectangulo =  new Rectangulo(10,14.5);

        Presentacion presentacion = new Presentacion();

        presentacion.area(triangulo);
        presentacion.area(rectangulo);

    }
}
