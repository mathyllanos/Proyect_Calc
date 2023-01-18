package com.example.calc_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double in1 = 0;
    double i2 = 0;
    double operacion=0;
    String operador="",result="";
    TextView edittext1, viewcalc;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
            button_Add, button_Sub, button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontrar por el Id los componentes

        button_0 = (Button) findViewById(R.id.Btn0);
        button_1 = (Button) findViewById(R.id.Btn1);
        button_2 = (Button) findViewById(R.id.Btn2);
        button_3 = (Button) findViewById(R.id.Btn3);
        button_4 = (Button) findViewById(R.id.Btn4);
        button_5 = (Button) findViewById(R.id.Btn5);
        button_6 = (Button) findViewById(R.id.Btn6);
        button_7 = (Button) findViewById(R.id.Btn7);
        button_8 = (Button) findViewById(R.id.Btn8);
        button_9 = (Button) findViewById(R.id.Btn9);
        button_Dot = (Button) findViewById(R.id.BtnPunto);
        button_Add = (Button) findViewById(R.id.BtnSumar);
        button_Sub = (Button) findViewById(R.id.BtnResta);
        button_Mul = (Button) findViewById(R.id.BtnMulti);
        button_Div = (Button) findViewById(R.id.BtnDividir);
        button_Remainder = (Button) findViewById(R.id.BtnEliminarTodo);
        button_Del = (Button) findViewById(R.id.BtnEliminar);
        button_Equ = (Button) findViewById(R.id.BtnIgual);

        edittext1 = (TextView) findViewById(R.id.TexViewResultado);
        viewcalc =(TextView) findViewById(R.id.TextViewVistaCalculo);

        //Acción de los botones ============================================================================================
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "0");
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "1");
                in1=Double.parseDouble((String) edittext1.getText());
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "2");
                in1=Double.parseDouble((String) edittext1.getText());
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "3");
                in1=Double.parseDouble((String) edittext1.getText());
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "4");
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "5");
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "6");
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "7");
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "8");
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "9");
            }
        });
        //Botones de operaciones =================================================================================================


        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " +");
                edittext1.setText("");
                i2=in1;
                operador="+";
            }
        });
        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " -");
                edittext1.setText("");
                operador="-";
            }
        });
        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " x");
                edittext1.setText("");
                operador="x";
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " /");
                edittext1.setText("");
                operador="/";
            }
        });
        button_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("0");
                viewcalc.setText("");
                operador="";
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operador){
                    case "+":
                        operacion = in1 + i2 ;
                        result=String.valueOf(operacion);
                        edittext1.setText(result);
                        operador="";
                        break;
                    case "-":
                        operacion= in1 - i2 ;
                        edittext1.setText(" kk");
                        operador="";
                        break;
                    case "x":
                        operacion= in1 * i2;
                        edittext1.setText(in1 * i2+"");
                        operador="";
                        break;
                    case "/":
                        operacion= in1 / i2;
                        edittext1.setText(in1 / i2+"");
                        operador="";
                        break;
                    case "":
                        edittext1.setText("hey");
                        break;
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                in1 = 0.0;
                i2 = 0.0;
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {

                } else {
                    edittext1.setText(edittext1.getText() + ".");
                    deci = true;
                }

            }
        });


    }
}