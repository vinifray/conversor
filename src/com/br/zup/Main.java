package com.br.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IO.mostrarTexto("Digite o valor em reais que será convertido");
        double reais = IO.capiturarDados().nextDouble();
        Real real = new Real(reais);

        IO.mostrarTexto("Seus "+real.getReias()+" reais vale "+real.converterParaDolar()+" dolar");
    }
}
