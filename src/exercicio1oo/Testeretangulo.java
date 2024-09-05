package exercicio1oo;
import java.util.Scanner;
public class Testeretangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("digite a Altura do retangulo:");
        retangulo.lado1 = sc.nextDouble();
        System.out.println("digite a Largura do retangulo:");
        retangulo.lado2 = sc.nextDouble();
        System.out.println("a area do retangulo é:"+retangulo.getArea());
    }
}

