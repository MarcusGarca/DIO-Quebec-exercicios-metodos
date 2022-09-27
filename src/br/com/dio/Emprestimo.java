package br.com.dio;

public class Emprestimo {

    public static double valorEmprestimo(double juros, double valorPresente, int periodo){

        return valorPresente * Math.pow((1 + juros/100),periodo);

    }
}
