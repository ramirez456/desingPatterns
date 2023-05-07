package main;
import main.Animal;

public class Jaguar extends Animal  implements IFelino {
    private int edad;
    private String peso;

    public int getEdad() {
        return edad;
    }

    public Jaguar(int edad, String peso) {
        this.edad = edad;
        this.peso = peso;
    }

    public Jaguar(int edad) {
        this.edad = edad;
    }

    public Jaguar(String peso) {
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void rugir() {
        System.out.println("Rugido de Jaguar");
    }
    public void maullar() {
        throw new UnsupportedOperationException("Jaguar no maulla.");
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
