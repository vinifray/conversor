package com.br.zup;

public class Real {
    private double reias;

    public Real(double reais){
        this.reias = reais;
    }

    public double converterParaDolar(){
        double resultado = this.reias / 5.35;
        return resultado;
    }

    public double getReias() {
        return reias;
    }
}
