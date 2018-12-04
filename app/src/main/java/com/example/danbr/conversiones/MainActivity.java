package com.example.danbr.conversiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.danbr.conversiones.Conversor.Binario;
import com.example.danbr.conversiones.Conversor.SistemaNumerico;

public class MainActivity extends AppCompatActivity {

    private int numero;

    private EditText cuadro1,cuadro2;
    private Button boton;
    private RadioButton b1,b2,b3;
    private Binario num=new Binario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cuadro1 = (EditText)findViewById(R.id.cuadro1);
        cuadro2 = (EditText)findViewById(R.id.cuadro2);
        boton = (Button)findViewById(R.id.button);
        b1 = (RadioButton)findViewById(R.id.radioButton1);
        b2 = (RadioButton)findViewById(R.id.radioButton2);
        b3 = (RadioButton)findViewById(R.id.radioButton3);

        if(b1.isChecked() == true){

            Binario bin = new Binario();
            num = bin;

        }

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero=Integer.parseInt(cuadro1.getText().toString());
                System.out.println(numero);
                num.convertir(numero);
                cuadro2.setText(num.getValor());
            }
        });

    }
}
