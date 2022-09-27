package br.com.dio;

public class Quadrilateros {


    public static double areaQuadrilatero(double lado) {
        return Math.pow(lado, 2);
    }

    public static double areaQuadrilatero(double base, double altura) {
        return base * altura;
    }

    public static double areaQuadrilatero(double baseMaior, double baseMenor, double altura) {
        return (baseMaior + baseMenor) * altura / 2;
    }

    public static float areaQuadrilatero( float diagonalMaior, float diagonalMenor){
        return (diagonalMaior * diagonalMenor)/2;
    }
}
