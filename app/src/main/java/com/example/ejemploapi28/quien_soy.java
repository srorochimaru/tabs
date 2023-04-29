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

public class quien_soy extends Fragment {

    String nombre, apellido,carnet, numero, pass;
    TextView ingrenombre, ingreapellido,ingresaid, ingrenumero, ingresa_pass;
    Button nuevo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Datos = inflater.inflate(R.layout.activity_quien_soy, container, false);
        // Se referencias los obbjetos.
        ingrenombre = Datos.findViewById(R.id.txtnombreD);
        ingreapellido = Datos.findViewById(R.id.txtApellidoD);
        ingresaid = Datos.findViewById(R.id.txtcarnet);
        ingrenumero = Datos.findViewById(R.id.txttelefono);
        ingresa_pass = Datos.findViewById(R.id.txtpastime);
        // Se envian los datos de tipo string a los TextView Con sus id identificados.
        nombre = "Josue David ";
        ingrenombre.setText(nombre);
        apellido = "Lopez Dubon";
        ingreapellido.setText(apellido);
        carnet = "SMTS117422";
        ingresaid.setText(carnet);
        numero = "+503 75004668";
        ingrenumero.setText(numero);
        pass = "aprendiendo mecanicas  de lenguaje JAVA";
        ingresa_pass.setText(pass);
        // Se refenencia el botón con su funcionabilidad.
        nuevo = Datos.findViewById(R.id.mensajerW);
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Se llama el método donde se envían los datos.
                MensajeM();
            }
        });
        // retorna la variable del View Del onCreate.
        return Datos;
    }
    // Se crea un método que almacena los datos del botón.
    public void MensajeM(){
        String message = "Hola, me interesa trabajar contigo ¿Estas disponible?";
        String Minumero = "+50375004668"; //
        Uri Ver = Uri.parse("https://wa.me/" + Minumero + "/?text=" + message );
        Intent Interfaz = new Intent(Intent.ACTION_VIEW, Ver);
        startActivity(Interfaz);

    }

}