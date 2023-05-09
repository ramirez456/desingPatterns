package main.felino;

public class Main {
    public static void main(String[] args) {

        IFelino yagua = new Jaguar(10,14.5);
        yagua.cazar();

        Jaguar jaguar1 = new Jaguar(10,14.5);
        jaguar1.cazar();

        IFelinoSalvaje jaguar2 = new Jaguar(10,14.5);
        jaguar2.cazar();

    }
}
