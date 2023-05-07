package main;

public class Rectangulo implements IFigura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
    public  double area(){
        return this.base * this.altura;
    }
}
