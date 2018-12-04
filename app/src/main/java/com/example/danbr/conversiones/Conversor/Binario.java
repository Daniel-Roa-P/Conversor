package com.example.danbr.conversiones.Conversor;

public class Binario extends SistemaNumerico {

    @Override
    public void convertir(int numero){

        int tempNumero=numero;

        while(true) {

            tempNumero = (int) tempNumero / 2;
            tamaño++;

            if (tempNumero == 0) {

                break;

            }
        }

        cadenaNumeros=new String [tamaño];

        for(int i=tamaño-1;i>-1;i--){

            cadenaNumeros[i]=String.valueOf(numero%2);

            numero=numero/2;

        }

    }

}
