package com.br.zup;

import java.text.DecimalFormat;

public class Real {
    private double reias;

    public Real(double reais){
        this.reias = reais;
    }

    public double converterParaDolar(){
        double resultado = this.reias / 5.35;
        DecimalFormat formatador = new DecimalFormat("#.##");
        String valorFormatado = formatador.format(resultado).replace(",", ".");
        return Double.valueOf(valorFormatado);
    }

    public double getReias() {
        return reias;
    }
}
