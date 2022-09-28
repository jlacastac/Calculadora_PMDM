package org.iesch.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.iesch.calculadora.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        Button addBtn = binding.addButton;
        Button subBtn = binding.substractButton;
        Button mulBtn = binding.multiplyButton;
        Button divBtn = binding.divideButton;

        TextView result = binding.result;
        EditText firstNum = binding.firstNumberEt;
        EditText secondNum = binding.secondNumberEt;

        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 + numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT);
                }
            }
        });

        subBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 - numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT);
                }
            }
        });

        mulBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 * numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT);
                }
            }
        });

        divBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                if(!firstNum.getText().toString().isEmpty() && !secondNum.getText().toString().isEmpty()) {
                    double numero1 = Double.parseDouble(firstNum.getText().toString());
                    double numero2 = Double.parseDouble(secondNum.getText().toString());

                    double resultado = numero1 / numero2;

                    result.setText(Double.toString(resultado));
                } else {
                    Toast.makeText(getApplicationContext(), "Has dejado un campo en blanco", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}