package br.com.dio;

import java.time.LocalDateTime;

public class Mensagem {
   public static String boasVindas(){
        int horaAtual = LocalDateTime.now().getHour();
        String menssagem;
        if (horaAtual > 5 && horaAtual <12){
            menssagem ="Bom dia!";
        } else if (horaAtual > 12 && horaAtual < 18) {
            menssagem = "Boa tarde!";
        } else if (horaAtual > 18 && horaAtual <24) {
            menssagem = "Boa noite";
        }else {
            menssagem = "Boa madrugada!";
        }
        return menssagem;
    }
}
