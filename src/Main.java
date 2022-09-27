import br.com.dio.Calculadora;
import br.com.dio.Emprestimo;
import br.com.dio.Mensagem;
import br.com.dio.Quadrilateros;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Método Classe Mensagem boas vindas
         */
        System.out.printf("Olá, " + Mensagem.boasVindas() + "\n");
        /*
        Variavel scan criada a partir da Classe Scanner
         */
        Scanner scan = new Scanner(System.in);
        /*
        Método Classe Quadrilátero
        Área do quadrado
         */
        double lado;
        System.out.println("Digite a medida do lado do quadrado");
        lado = scan.nextInt();
        double areaQuadradro = Quadrilateros.areaQuadrilatero(lado);
        System.out.printf("A área do quadrado é: " + areaQuadradro + "\n");
        /*
        Área do retângulo
         */
        double base, alturaRetangulo;
        System.out.println("Digite a medida da base do retângulo:");
        base = scan.nextDouble();
        System.out.println("Digite a medida da base do rentângulo:");
        alturaRetangulo = scan.nextDouble();
        double areaRetangulo = Quadrilateros.areaQuadrilatero(base, alturaRetangulo);
        System.out.printf("A área do retângulo é: " + areaRetangulo + "\n");
        /*
        Área do trapézio
         */
        double baseMaior, baseMenor, alturaTrapezio;
        System.out.println("Digite a medida da base MAIOR do trapézio");
        baseMaior = scan.nextDouble();
        System.out.println("Digite a medida da base MENOR do trapézio:");
        baseMenor = scan.nextDouble();
        System.out.println("Digite a medida da altura do trapézio:");
        alturaTrapezio = scan.nextDouble();
        double areaTrapezio = Quadrilateros.areaQuadrilatero(baseMaior, baseMenor, alturaTrapezio);
        System.out.printf("A área do trapézio é :" + areaTrapezio + "\n");
        /*
        Área do Lozango
         */
        double diagonalMaior, diagonalMenor;
        System.out.println("Digite a medida da diagonal MAIOR do lozango:");
        diagonalMaior = scan.nextDouble();
        System.out.println("Digite a medida da diagonal MENOR do lozango:");
        diagonalMenor = scan.nextDouble();
        double areaLozango = Quadrilateros.areaQuadrilatero(diagonalMaior, diagonalMenor);
        System.out.printf("A área do Lozango é :" + areaLozango + "\n");

        /*
        Métodos classe Calculadora operações matemáticas básicas
         */
        double a, b;
        System.out.println("Digite um valor: ");
        a = scan.nextDouble();
        System.out.println("Digite um valor: ");
        b = scan.nextDouble();

        double soma = Calculadora.soma(a, b);
        double subtracao = Calculadora.subtracao(a, b);
        double multiplicacao = Calculadora.multiplicacao(a, b);
        double divisao = Calculadora.divisao(a, b);

        System.out.println("a soma de " + a + " + " + b + " é igual a " + soma);
        System.out.println("a subtração de " + a + " - " + b + " é igual a " + subtracao);
        System.out.println("a multiplicação de " + a + " x " + b + " é igual a " + multiplicacao);
        System.out.println("a divisão de " + a + " / " + b + " é igual a " + divisao);

        /*
        Método da Classe Emprestimo que retorna o valor futuro do emprestimo
         */

        double juros, valorPresente;
        int periodo;

        System.out.println("Digite o valor do emprestimo:");
        valorPresente = scan.nextDouble();
        System.out.println("Digite o número de parcelas:");
        periodo = scan.nextInt();
        System.out.println("Digite a taxa de juros: ");
        juros = scan.nextDouble();

        double valorEmprestimo = Emprestimo.valorEmprestimo(juros, valorPresente, periodo);
        System.out.printf("Ao final do emprestimo a dívida será de : " + valorEmprestimo);

    }

}

