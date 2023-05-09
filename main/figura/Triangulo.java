package main.figura;

public class Triangulo implements IFigura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString(){
        return "Base: " + this.base + " Altura: " + this.altura;
    }

    public double area(){
        return this.base * this.altura / 2;
    }

}
