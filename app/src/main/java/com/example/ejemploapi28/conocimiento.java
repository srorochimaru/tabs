package com.example.ejemploapi28;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.fragment.app.Fragment;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class conocimiento extends Fragment  {

    String L_pseint, L_python, L_Csharp, L_Rust, L_java, Base1, Base2;
    TextView pSeint, python, Csharp, Rust, java, db1, db2;
    Button Contactar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View Mostrar=  inflater.inflate(R.layout.activity_conocimiento, container, false);
        // Se referencian aqui.
        pSeint = Mostrar.findViewById(R.id.txt_pSeint);
        python = Mostrar.findViewById(R.id.txt_python);
        Csharp = Mostrar.findViewById(R.id.txt_Csharp);
        Rust = Mostrar.findViewById(R.id.txt_Rust);
        java = Mostrar.findViewById(R.id.txt_java);
        db1 = Mostrar.findViewById(R.id.txt_SQL);
        db2 = Mostrar.findViewById(R.id.txt_Nosql);
        // Se referencia el botón
        Contactar = Mostrar.findViewById(R.id.Enviar_Correo);
        // Damos valores tipo sttring a los textview.
        L_pseint = " pSeint ";
        pSeint.setText( L_pseint );
        L_python = " Python ";
        python.setText( L_python );
        L_Csharp = " Csharp(#) ";
        Csharp.setText( L_Csharp );
        L_Rust = " html ";
        Rust.setText( L_Rust );
        L_java = " JAVA ";
        java.setText( L_java );
        Base1 = " Mysql ";
        db1.setText( Base1 );
        Base2 = " Firebase ";
        db2.setText( Base2 );
        // Función del botón
        Contactar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // LLamamos al método.
                contactaremail();
            }
        });
        // retorna la variable del View Del onCreate.
        return Mostrar;
    }
    // Se crea un método para el botón.
    // almacena ACTION_SEND que nos permitirá abrir otras apps
    // de donde enviar el mensje.
    public void contactaremail(){
        String Emisor = " Me interesan tus conociminetos ";
        String Cuerpo_Mensaje = " ";
        Intent Ayuda = new Intent(Intent.ACTION_SEND);
        Ayuda.putExtra(Intent.EXTRA_EMAIL, new String[]{"meg73745@gmail.com"});
        Ayuda.putExtra(Intent.EXTRA_SUBJECT, Emisor);
        Ayuda.putExtra(Intent.EXTRA_TEXT, Cuerpo_Mensaje);
        Ayuda.setType("message/rfc822");
        startActivity(Intent.createChooser(Ayuda, "Ayuda requerida"));
    }
}