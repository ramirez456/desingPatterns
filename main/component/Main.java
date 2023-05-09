package main.component;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Teclado teclado = new Teclado();
        Computadora computadora = new Computadora(mouse, teclado);
        computadora.encender();
    }
}
