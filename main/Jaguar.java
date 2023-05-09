package main;
import main.Animal;

public class Jaguar extends Animal  implements IFelinoSalvaje {
    private int edad;
    private double peso;

    public int getEdad() {
        return edad;
    }

    public Jaguar(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public Jaguar(int edad) {
        this.edad = edad;
    }

    public Jaguar(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void rugir() {
        System.out.println("Rugido de Jaguar");
    }

    public void cazar() {
        System.out.println("Cazar de Jaguar");
    }

    public void dormir() {
        System.out.println("Dormir de Jaguar");
    }
    public  void  comer() {
        System.out.println("Comer de Jaguar");
    }
    //Polimorfismo tambien se puede llamar como sobre escribir un metodo
    @Override
    public String toString() {
        return "Jaguar {" +
                "edad=" + edad +
                ", peso='" + peso + '\'' +
                '}';
    }

}
