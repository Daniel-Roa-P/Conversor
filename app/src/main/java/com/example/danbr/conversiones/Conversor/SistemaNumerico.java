package com.example.danbr.conversiones.Conversor;

import java.util.ArrayList;
import java.util.Arrays;

public class SistemaNumerico {

    protected int tamaño;
    protected String valor;
    protected int[] cadenaNumeros;

    public void convertir(int numero){};

    public String getValor(){

        String valortem= Arrays.toString(cadenaNumeros);
        valor=valortem;
        return valor;

    }

}
