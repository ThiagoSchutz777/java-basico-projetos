package Main;

import Funcionario.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.print("Funcionario: " + funcionario.nome + ", " );
        System.out.printf("$ %.2f%n", funcionario.salarioLiquido());

        System.out.println("Qual a porcentagem você deseja aumentar do salário? ");
        funcionario.aumentarSalario(sc.nextDouble());
        System.out.print("Dados atualizados: " + funcionario.nome  + ", $");
        System.out.printf("%.2f%n", funcionario.salarioBruto);

        sc.close();

    }
}