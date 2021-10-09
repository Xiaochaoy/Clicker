package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.clicker.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contadorTop, contador1, contador2, contador3, contador4;
    TextView top1, c1, c2 ,c3, c4;
    Button top11, c11, c111, c22, c222, c33, c333, c44, c444;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());


        //contadorDeClics = findViewById(R.id.contadorDeClics);
        //augmentarElContador = findViewById(R.id.augmentarElContador);



        binding.c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aumentar el contador
                contador1++;
                contadorTop++;
                // mostrar el contador en el TextView
                binding.c1.setText(""+contador1);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // borrar el contador
                contadorTop -= contador1;
                contador1 = 0;
                // mostrar el contador en el TextView
                binding.c1.setText(""+contador1);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aumentar el contador
                contador2++;
                contadorTop++;
                // mostrar el contador en el TextView
                binding.c2.setText(""+contador2);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // borrar el contador
                contadorTop -= contador2;
                contador2 = 0;
                // mostrar el contador en el TextView
                binding.c2.setText(""+contador2);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aumentar el contador
                contador3++;
                contadorTop++;
                // mostrar el contador en el TextView
                binding.c3.setText(""+contador3);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c333.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // borrar el contador
                contadorTop -= contador3;
                contador3 = 0;
                // mostrar el contador en el TextView
                binding.c3.setText(""+contador3);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // aumentar el contador
                contador4++;
                contadorTop++;
                // mostrar el contador en el TextView
                binding.c4.setText(""+contador4);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.c444.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // borrar el contador
                contadorTop -= contador4;
                contador4 = 0;
                // mostrar el contador en el TextView
                binding.c4.setText(""+contador4);
                binding.top1.setText(""+contadorTop);
            }
        });
        binding.top11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // borrar el contador de todos
                contador1 = 0;
                contador2 = 0;
                contador3 = 0;
                contador4 = 0;
                contadorTop = contador1 + contador2 + contador3 + contador4;
                binding.c1.setText(""+contador1);
                binding.c2.setText(""+contador2);
                binding.c3.setText(""+contador3);
                binding.c4.setText(""+contador4);
                binding.top1.setText(""+contadorTop);
            }
        });
    }
}