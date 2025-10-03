package Application;

import Rentagulo.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a largura e a altura do retangulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
        System.out.println(retangulo.diagonal());
    }

}
