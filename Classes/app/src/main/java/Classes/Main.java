/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pessoa objetoPessoa = new Pessoa();

        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa: ");
        objetoPessoa.setPeso(leitorScanner.nextFloat());
        objetoPessoa.getPeso();
        System.out.println("Digite a altura da pessoa: ");
        objetoPessoa.setAltura(leitorScanner.nextFloat());

        System.out.println("IMC = " + objetoPessoa.calculaImc());

    }
}
