package main.component;

public class Computadora {
    private Mouse mouse;
    private Teclado teclado;

    public Computadora(Mouse mouse, Teclado teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }
    public Computadora() {
        this.mouse = new Mouse();
        this.teclado = new Teclado();
    }

    public void encender() {
        this.mouse.conectar();
        this.teclado.conectar();
    }
}
