package com.example.calculadorasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvresultado,tvnumero1,tvnumero2,tvsigno;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btc,btsumar,btrestar,btmultiplicar,btdivicion,btigual,btpunto,btce;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvresultado = findViewById(R.id.tvResultado);
        tvnumero1 = findViewById(R.id.tvNumero1);
        tvnumero2 = findViewById(R.id.tvNumero2);
        tvsigno = findViewById(R.id.tvsigno);

        bt0=findViewById(R.id.bt0);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        btc=findViewById(R.id.btC);
        btpunto=findViewById(R.id.btpunto);
        btsumar=findViewById(R.id.btsumar);
        btrestar=findViewById(R.id.btrestar);
        btdivicion=findViewById(R.id.btdivicion);
        btmultiplicar=findViewById(R.id.btmultiplicar);
        btigual= findViewById(R.id.btigual);
        btce=findViewById(R.id.bteliminar);

        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvnumero1.setText("0");
                tvnumero2.setText("0");
                tvsigno.setText("signo");
                tvresultado.setText("resultado");

            }
        });
        btrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsigno.setText("-");
            }
        });
        btmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsigno.setText("*");
            }
        });
        btdivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsigno.setText("/");
            }
        });
        btsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsigno.setText("+");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n=Integer.parseInt(tvnumero1.getText().toString());
                int m=Integer.parseInt(tvnumero2.getText().toString());
                if(tvsigno.getText()=="signo"){
                    if(n==0){
                        tvnumero1.setText("0");
                    }else{
                        tvnumero1.setText(n+"0");
                    }
                }else{
                    if(m==0){
                        tvnumero2.setText("0");
                    }else{
                        tvnumero2.setText(m+"0");
                    }
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("1");
                    }else{
                        tvnumero1.setText(n+"1");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("0");
                    }else{
                        tvnumero2.setText(m+"1");
                    }
                }
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("2");
                    }else{
                        tvnumero1.setText(n+"2");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("2");
                    }else{
                        tvnumero2.setText(m+"2");
                    }
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("3");
                    }else{
                        tvnumero1.setText(n+"3");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("3");
                    }else{
                        tvnumero2.setText(m+"3");
                    }
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("4");
                    }else{
                        tvnumero1.setText(n+"4");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("4");
                    }else{
                        tvnumero2.setText(m+"4");
                    }
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("5");
                    }else{
                        tvnumero1.setText(n+"5");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("5");
                    }else{
                        tvnumero2.setText(m+"5");
                    }
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("6");
                    }else{
                        tvnumero1.setText(n+"6");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("6");
                    }else{
                        tvnumero2.setText(m+"6");
                    }
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("7");
                    }else{
                        tvnumero1.setText(n+"7");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("7");
                    }else{
                        tvnumero2.setText(m+"7");
                    }
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("8");
                    }else{
                        tvnumero1.setText(n+"8");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("8");
                    }else{
                        tvnumero2.setText(m+"8");
                    }
                }
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(n=="0"){
                        tvnumero1.setText("9");
                    }else{
                        tvnumero1.setText(n+"9");
                    }
                }else{
                    if(m=="0"){
                        tvnumero2.setText("9");
                    }else{
                        tvnumero2.setText(m+"9");
                    }
                }
            }
        });
        btpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    tvnumero1.setText(n+".");
                }else{
                    tvnumero2.setText(m+".");
                }
            }
        });

        btigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n=Double.parseDouble(tvnumero1.getText().toString());
                double m=Double.parseDouble(tvnumero2.getText().toString());
                char sig=tvsigno.getText().charAt(0);
                double resultado = 0;
                switch (sig){
                    case '+':
                        resultado=n+m;
                        tvresultado.setText(resultado+"");
                        break;
                    case '-':
                        resultado=n-m;
                        tvresultado.setText(resultado+"");
                        break;
                    case '*':
                        resultado=n*m;
                        tvresultado.setText(resultado+"");
                        break;
                    case '/':
                        resultado=n/m;
                        tvresultado.setText(resultado+"");
                        break;
                    default:
                        tvresultado.setText("syntax error");
                        break;
                }

            }
        });

        btce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=tvnumero1.getText().toString();
                String m=tvnumero2.getText().toString();
                if(tvsigno.getText()=="signo"){
                    if(!n.isEmpty()) {
                        tvnumero1.setText(n.substring(0,n.length()-1));
                    }else{
                        tvnumero1.setText("0");
                        tvsigno.setText("signo");
                    }
                }else{
                    if(!m.isEmpty()) {
                        tvnumero2.setText(m.substring(0,m.length()-1));
                    }else{
                        tvnumero2.setText("0");
                        tvsigno.setText("signo");
                    }
                }
            }
        });

    }
}