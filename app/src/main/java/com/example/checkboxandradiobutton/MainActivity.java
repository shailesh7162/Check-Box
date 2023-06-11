package com.example.checkboxandradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView totalTxtv, phonesTxtv;
    CheckBox cb1, cb2, cb3, cb4, oppoCb, vivoCb, miCb, samsungCb;

    int total = 0,
            oppo = 10000,
            vivo = 12000,
            mi = 15000,
            samsung = 14000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalTxtv = findViewById(R.id.totalTxtv);
        phonesTxtv = findViewById(R.id.phonesTxtv);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);
        oppoCb = findViewById(R.id.oppoCb);
        vivoCb = findViewById(R.id.vivoCb);
        miCb = findViewById(R.id.miCb);
        samsungCb = findViewById(R.id.samsungCb);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb1.isChecked()) {
                    total += oppo;
                } else {
                    total -= oppo;
                }
                totalTxtv.setText("" + total);
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb2.isChecked()) {
                    total += vivo;
                } else {
                    total -= vivo;
                }
                totalTxtv.setText("" + total);
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb3.isChecked()) {
                    total += mi;
                } else {
                    total -= mi;
                }
                totalTxtv.setText("" + total);
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (cb4.isChecked()) {
                    total += samsung;
                } else {
                    total -= samsung;
                }
                totalTxtv.setText("" + total);
            }
        });

        oppoCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str = "";
                if (oppoCb.isChecked()) {
                    str += "Oppo ";
                }
                if (vivoCb.isChecked()) {
                    str += "Vivo ";
                }
                if (miCb.isChecked()) {
                    str += "Mi ";
                }
                if (samsungCb.isChecked()) {
                    str += "Samsung ";
                }
                phonesTxtv.setText("" + str);
            }
        });
        vivoCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str = "";
                if (oppoCb.isChecked()) {
                    str += "Oppo ";
                }
                if (vivoCb.isChecked()) {
                    str += "Vivo ";
                }
                if (miCb.isChecked()) {
                    str += "Mi ";
                }
                if (samsungCb.isChecked()) {
                    str += "Samsung ";
                }
                phonesTxtv.setText("" + str);
            }
        });
        miCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str = "";
                if (oppoCb.isChecked()) {
                    str += "Oppo ";
                }
                if (vivoCb.isChecked()) {
                    str += "Vivo ";
                }
                if (miCb.isChecked()) {
                    str += "Mi ";
                }
                if (samsungCb.isChecked()) {
                    str += "Samsung ";
                }
                phonesTxtv.setText("" + str);
            }
        });
        samsungCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                String str = "";
                if (oppoCb.isChecked()) {
                    str += "Oppo ";
                }
                if (vivoCb.isChecked()) {
                    str += "Vivo ";
                }
                if (miCb.isChecked()) {
                    str += "Mi ";
                }
                if (samsungCb.isChecked()) {
                    str += "Samsung ";
                }
                phonesTxtv.setText("" + str);
            }
        });

    }

}