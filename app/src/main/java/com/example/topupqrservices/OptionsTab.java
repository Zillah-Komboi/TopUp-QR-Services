package com.example.topupqrservices;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class OptionsTab extends AppCompatActivity {

    Button  btnScanBarcode;
    Button  checkbal_opt_btn;
    Button  transfer_opt_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_tab);

        btnScanBarcode = findViewById(R.id.topup_opt_btn);

        btnScanBarcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionsTab.this, TopUp.class));
            }
        });

        checkbal_opt_btn = findViewById(R.id.checkbal_opt_btn);

        checkbal_opt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionsTab.this, CheckBal.class));
            }
        });

        transfer_opt_btn = findViewById(R.id.transfer_opt_btn);

        transfer_opt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OptionsTab.this, TransferCredit.class));
            }
        });
    }
}

