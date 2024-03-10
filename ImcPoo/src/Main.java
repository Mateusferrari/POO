import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente("João", 105, 1.70);

        System.out.println("o nome é: " + paciente1.getNome());

        System.out.println(paciente1.calcularIMC());


    }
}