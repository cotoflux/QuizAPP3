package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.CellIdentityGsm;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {



    EditText nameint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        int contador = 0;

        // This is the cocker button
        RadioButton cockerButton = (RadioButton) findViewById(R.id.cocker);
        boolean CheckCocker = cockerButton.isChecked();


        // This is the poddle button
        RadioButton canicheButton = (RadioButton) findViewById(R.id.caniche);
        boolean CheckCaniche = canicheButton.isChecked();


        // This is the schnawzer button
        RadioButton schnawzerButton = (RadioButton) findViewById(R.id.schnawzer);
        boolean CheckSchnawzer = schnawzerButton.isChecked();


        // This is the maltes button
        RadioButton maltesButton = (RadioButton) findViewById(R.id.maltes);
        boolean CheckMaltes = maltesButton.isChecked();

        // the bolean order with the right option

        if (CheckSchnawzer == true) {

            contador = contador + 1;
        }


        // the option to respond to question 2 yes
        CheckBox afirmacionSi = (CheckBox) findViewById(R.id.afirmacionSi);
        boolean afirmativo = afirmacionSi.isChecked();


        // the option to respond to question 2 no
        CheckBox afirmacionNo = (CheckBox) findViewById(R.id.afirmacionNo);
        boolean negativo = afirmacionNo.isChecked();

        if (negativo == true) {
            contador = contador + 1;
        }


        // The option on the Toggle button
        ToggleButton Si = (ToggleButton) findViewById(R.id.campeonato);
        boolean campeonatoPel = Si.isChecked();

        if (campeonatoPel == true) {

            contador = contador + 1;
        }

        // The option of wired coat
        RadioButton peloduroButton = (RadioButton) findViewById(R.id.peloduro);
        boolean ButtonPeloDuro = peloduroButton.isChecked();


        // The option of primary coat
        RadioButton primarioButton = (RadioButton) findViewById(R.id.primario);
        boolean ButtonPrimario = primarioButton.isChecked();


        if (ButtonPrimario == true) {
            contador = contador + 1;
        }


        // Response yes to the 5th option
        RadioButton igualButton = (RadioButton) findViewById(R.id.igualSi);
        boolean ButtonIgualSi = igualButton.isChecked();


        // Response no to the 5th option
        RadioButton igualNoButton = (RadioButton) findViewById(R.id.igualNo);
        boolean ButtonIgualNo = igualNoButton.isChecked();


        if (ButtonIgualNo == true) {
            contador = contador + 1;
        }


        // The toast with the response of the total right responses

        Toast MiToast = new Toast(getApplicationContext());

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.lytLayout));

        TextView txtMsg = (TextView)layout.findViewById(R.id.txtMensaje);
        txtMsg.setText("Tu resultado es "+(contador) + " de 5.");

        MiToast.setDuration(Toast.LENGTH_LONG);
        MiToast.setView(layout);
        MiToast.show();

    }

    }
