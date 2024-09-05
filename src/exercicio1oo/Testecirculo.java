package exercicio1oo;

import java.util.Scanner;

public class Testecirculo{
    public static void main(String[] args){
        Circulo area1 = new Circulo();
        Scanner area = new Scanner(System.in);
        System.out.println("Digite a raio do circulo: ");
        area1.raio = area.nextDouble();
        System.out.println("a area do circulo é:"+area1.getArea());
        System.out.println("o perimetro do circulo é:"+area1.getPerimetro());
        System.out.println("o diametro do circulo é:"+area1.getDiametro());
        Scanner diametro = new Scanner(System.in);
    }
}

