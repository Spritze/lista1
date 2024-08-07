import java.util.Scanner;

public class exe{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float soma, sub, mult, div, n1, n2;
        System.out.print("Digite o primeiro número: ");
        n1 = leia.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = leia.nextFloat();
        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        div = n1/n2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }
}