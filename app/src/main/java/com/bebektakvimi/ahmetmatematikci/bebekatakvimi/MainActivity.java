package com.bebektakvimi.ahmetmatematikci.bebekatakvimi;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends Activity {
    Button hesaplaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Oluşturduğumuz XML'den gerekli referansları atıyoruz
        hesaplaButton = (Button)findViewById(R.id.hesaplaButton);







        hesaplaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, AsiTAkvimiTablosu.class);
                startActivity(i);
            }
        });

    }

}