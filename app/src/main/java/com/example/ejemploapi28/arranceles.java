package com.example.ejemploapi28;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class arranceles extends Fragment {
    TextView Parvularia, escuela, bachillerato, Universidad,Ciclo, Materia;
    Button ugb;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View estudios = inflater.inflate(R.layout.activity_arranceles, container, false);
        // Se referencian los TextView
        Parvularia =estudios.findViewById(R.id.txt_Parvularia);
        escuela = estudios.findViewById(R.id.txt_escuela);
        bachillerato = estudios.findViewById(R.id.txt_Instituto);
        Universidad = estudios.findViewById(R.id.txt_Universidad);
        Ciclo = estudios.findViewById(R.id.txt_Ciclos);
        Materia = estudios.findViewById(R.id.txt_Materias);
        // Se envían los datos a los textview
        String inicio = "kinder nacional Santa Rosa de Lima";
        Parvularia.setText(inicio);
        String secundaría = "Presvitero Jose Matias Delgado";
        escuela.setText(secundaría);
        String INGO = "Colegio Cristiano Dr.Juan Alwood Paredes";
        bachillerato.setText(INGO);
        String Meta = "Universidad Capitan General Gerardo Barrios";
        Universidad.setText(Meta);
        String nota = "3";
        Ciclo.setText( nota );
        String numM = "4";
        Materia.setText( numM );
        // Se referencia el botón.
        ugb = estudios.findViewById(R.id.URL);
        ugb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // El botón almacena la función de ir
                // a la URL de la dicha universidad Establecidad.
                Uri nuevo = Uri.parse("https://ugb.edu.sv/");
                Intent ir = new Intent(Intent.ACTION_VIEW, nuevo);
                startActivity(ir);
            }
        });
        //retorna la variable del View Del onCreate.
        return estudios;
    }
}