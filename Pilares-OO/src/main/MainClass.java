package main;
import core.ContaBancaria;
import core.ContaEspecial;

public class MainClass {
    static void main(String[] args) {

        ContaBancaria c1,c2; // declaração de forma genérica, por ter comportamentos diferentes
                             // em uma hierarquia
        c1 = new ContaBancaria(567, "Grsn");
        c2 = new ContaEspecial(568, "Moraes", 200.0f);

        System.out.println(c1);
        System.out.println(c2);

        c1.creditar(500.0);
        c2.creditar(800.0);

        IO.println("------------------------------");

        System.out.println(c1);
        System.out.println(c2);

        IO.println("------------------------------");

        if (c2.debitar(1000)){
            IO.println("Débito efetuado");
            IO.println(c2);
        }
        else {
            IO.println("Saldo Insuficientepara conta: " + c2.getNumero());
        }
    }
}
