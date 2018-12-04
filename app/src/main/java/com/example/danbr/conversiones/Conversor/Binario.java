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

        cadenaNumeros=new int [tamaño];

        for(int i=tamaño-1;i>-1;i--){

            if(numero%2==0){

                cadenaNumeros[i]=0;

            } else if(numero%2==1){

                cadenaNumeros[i]=1;

            }

            numero=numero/2;

        }

    };

}
