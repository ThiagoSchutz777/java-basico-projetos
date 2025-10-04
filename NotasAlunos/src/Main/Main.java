package Main;

import Aluno.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno e as notas dos 3 trimestres");
        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());

        if (aluno.notaFinal() < 60) {
            System.out.println("Não passou");
            System.out.printf("Faltou %.2f pontos%n", aluno.pontosFaltando());
        } else {
            System.out.println("Passou");
        }
    }
}