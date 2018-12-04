package com.example.danbr.conversiones.Conversor;

public class Hexadecimal extends SistemaNumerico {

    @Override
    public void convertir(int numero){

        int tempNumero=numero;

        while(true) {

            tempNumero = (int) tempNumero / 16;
            tamaño++;

            if (tempNumero == 0) {

                break;

            }
        }

        cadenaNumeros=new String [tamaño];

        for(int i=tamaño-1;i>-1;i--){

            if(numero%16==10){
                cadenaNumeros[i] = "A";
            }else if(numero%16==11){
                cadenaNumeros[i] = "B";
            }else if(numero%16==12){
                cadenaNumeros[i] = "C";
            }else if(numero%16==13){
                cadenaNumeros[i] = "D";
            }else if(numero%16==14){
                cadenaNumeros[i] = "E";
            }else if(numero%16==15){
                cadenaNumeros[i] = "F";
            }else {
                cadenaNumeros[i] = String.valueOf(numero % 16);
            }

            numero=numero/16;

        }

    }

}
