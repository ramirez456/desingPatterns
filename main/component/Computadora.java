package main.component;

public class Computadora {
    private IMouse mouse;
    private ITeclado teclado;

    public Computadora(IMouse mouse, ITeclado teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public void encender() {
        this.mouse.conectar();
        this.teclado.conectar();
    }
}
