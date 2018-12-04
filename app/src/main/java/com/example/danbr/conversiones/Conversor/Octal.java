package com.example.danbr.conversiones.Conversor;

public class Octal extends SistemaNumerico {

    public void convertir(int numero){

        int tempNumero=numero;

        while(true) {

            tempNumero = (int) tempNumero / 8;
            tamaño++;

            if (tempNumero == 0) {

                break;

            }
        }

        cadenaNumeros=new String [tamaño];

        for(int i=tamaño-1;i>-1;i--){

            cadenaNumeros[i]=String.valueOf(numero%8);

            numero=numero/8;

        }

    };

}
