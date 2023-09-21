package com.example.operateurstelephoniques;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {


    EditText tel_number, codeRecharge;
    TextView codeComplet, solde, typeLigne, digits_operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        String firstText = getIntent().getStringExtra("Tel Number");

        tel_number = findViewById(R.id.tel_number);
        codeRecharge = findViewById(R.id.codeRecharge);
        solde = findViewById(R.id.solde);
        codeComplet = findViewById(R.id.codeComplet);
        typeLigne = findViewById(R.id.typeLigne);
        digits_operator = findViewById(R.id.digits_operator);

        tel_number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // not implemented
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String myChars = charSequence.toString();
                Operator myOperator = null;
                if (!myChars.isEmpty() && myChars.charAt(0) == '5') {
                    myOperator = new Operator(
                            "Orange",
                            "*100*",
                            101,
                            Color.parseColor("#FFA500"),
                            14
                    );
                }else if (myChars.charAt(0) == '2') {
                    myOperator = new Operator(
                            "Ooredoo",
                            "*101*",
                            100,
                            Color.parseColor("#96060b"),
                            14
                    );

                } else if (myChars.charAt(0) == '9') {
                    myOperator = new Operator(
                            "Telecom",
                            "*122*",
                            123,
                            Color.parseColor("#1111bf"),
                            13
                    );

                }

                if (myOperator != null) {
                    setUpDashboard(myOperator);
                }

                if (firstText != null) {
                    tel_number.setText(firstText);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                // not implemented

            }
        });

    }


    protected void setUpDashboard(Operator mOperator) {
        typeLigne.setTextColor(mOperator.getColor());
        typeLigne.setText("Votre Ligne est " + mOperator.getName());
        digits_operator.setText(digits_operator.getText() + " " + String.valueOf(mOperator.getNumberOfDigits()));
        codeComplet.setText(mOperator.getCodeOfCharge() + codeRecharge.getText());
        solde.setText("*" + mOperator.getCodeOfSee() + "*");
    }

}