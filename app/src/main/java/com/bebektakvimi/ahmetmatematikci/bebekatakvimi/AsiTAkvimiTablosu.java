package com.bebektakvimi.ahmetmatematikci.bebekatakvimi;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class AsiTAkvimiTablosu extends AppCompatActivity {
    TextView tv11,tv12,tv13,tv14,tv15, tv16,tv17,tv18,tv19,
          tv20,tv21,tv22,tv23,tv24,tv25,tv26,tv27,tv28  ;

    Button geriButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asi_takvimi_tablosu);
        Calendar mcurrentTime = Calendar.getInstance();
        int year = mcurrentTime.get(Calendar.YEAR);//Güncel Yılı alıyoruz
        final int month = mcurrentTime.get(Calendar.MONTH);//Güncel Ayı alıyoruz
        int day = mcurrentTime.get(Calendar.DAY_OF_MONTH);//Güncel Günü alıyoruz

        geriButton = (Button)findViewById(R.id.buttongeri) ;

        geriButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AsiTAkvimiTablosu.this, MainActivity.class);
                startActivity(i);
            }
        });

        tv11= (TextView)findViewById(R.id.textView11);
        tv12= (TextView)findViewById(R.id.textView12);
        tv13= (TextView)findViewById(R.id.textView13);
        tv14= (TextView)findViewById(R.id.textView14);
        tv15= (TextView)findViewById(R.id.textView15);
        tv16= (TextView)findViewById(R.id.textView16);
        tv17= (TextView)findViewById(R.id.textView17);
        tv18= (TextView)findViewById(R.id.textView18);
        tv19= (TextView)findViewById(R.id.textView19);
        tv20= (TextView)findViewById(R.id.textView20);
        tv21= (TextView)findViewById(R.id.textView21);
        tv22= (TextView)findViewById(R.id.textView22);
        tv23= (TextView)findViewById(R.id.textView23);
        tv24= (TextView)findViewById(R.id.textView24);
        tv25= (TextView)findViewById(R.id.textView25);
        tv26= (TextView)findViewById(R.id.textView26);
        tv27= (TextView)findViewById(R.id.textView27);
        tv28= (TextView)findViewById(R.id.textView28);

        DatePickerDialog datePicker;//Datepicker objemiz
        datePicker = new DatePickerDialog(AsiTAkvimiTablosu.this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear,
                                  int dayOfMonth) {




                // TODO Auto-generated method stub

                tv11.setText( dayOfMonth +  "/" + (monthOfYear+1)+ "/"+year);//hepatit B


                if (monthOfYear +2  >12 && monthOfYear <25 ) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv12.setText( dayOfMonth +  "/" + (monthOfYear+2)+ "/"+year); //hepatit b 2
                } else {
                    tv12.setText( dayOfMonth +  "/" + (monthOfYear+2)+ "/"+year);
                }



                if (monthOfYear +3  >12 && monthOfYear <25 ) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv13.setText( dayOfMonth +  "/" + (monthOfYear+3)+ "/"+year); //verem
                } else {
                    tv13.setText( dayOfMonth +  "/" + (monthOfYear+3)+ "/"+year);
                }


                tv14.setText( dayOfMonth +  "/" + (monthOfYear+3)+ "/"+year); //dapt
                tv15.setText( dayOfMonth +  "/" + (monthOfYear+3)+ "/"+year); //pnömok

                if (monthOfYear +5  >12 && monthOfYear <25 ) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv16.setText( dayOfMonth +  "/" + (monthOfYear+5)+ "/"+year); //dapt2
                } else {
                    tv16.setText( dayOfMonth +  "/" + (monthOfYear+5)+ "/"+year);
                }
                tv17.setText( dayOfMonth +  "/" + (monthOfYear+5)+ "/"+year);//pnömok 2



                if (monthOfYear +7  >12 && monthOfYear <25 ) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv18.setText( dayOfMonth +  "/" + (monthOfYear+7)+ "/"+year); //hepatit B 3
                } else {
                    tv18.setText( dayOfMonth +  "/" + (monthOfYear+7)+ "/"+year);
                }
                tv19.setText( dayOfMonth +  "/" + (monthOfYear+7)+ "/"+year);//dapt 3
                tv20.setText( dayOfMonth +  "/" + (monthOfYear+7)+ "/"+year);//pnomok3
                tv21.setText( dayOfMonth +  "/" + (monthOfYear+7)+ "/"+year);//çocuk felci 1

                if (monthOfYear+13>12 && monthOfYear <25) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv22.setText( dayOfMonth +  "/" + (monthOfYear+13)+ "/"+year);//pnomek pekiştirme
                    tv23.setText( dayOfMonth +  "/" + (monthOfYear+13)+ "/"+year);//kkk
                    tv24.setText( dayOfMonth +  "/" + (monthOfYear+13)+ "/"+year);//su çiçeği

                } else {


                    tv22.setText(dayOfMonth + "/" + (monthOfYear + 13) + "/" + year);//pnomek pekiştirme
                    tv23.setText(dayOfMonth + "/" + (monthOfYear + 13) + "/" + year);//kkk
                    tv24.setText(dayOfMonth + "/" + (monthOfYear + 13) + "/" + year);//su çiçeği
                }

                if (monthOfYear+19>12 && monthOfYear <25) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv25.setText( dayOfMonth +  "/" + (monthOfYear+19)+ "/"+year);//dapt ipa pekiştirme
                    tv26.setText( dayOfMonth +  "/" + (monthOfYear+19)+ "/"+year);//çocuk felci 2
                    tv27.setText( dayOfMonth +  "/" + (monthOfYear+19)+ "/"+year);//hepatit a 1

                } else {

                    tv25.setText( dayOfMonth +  "/" + (monthOfYear+19)+ "/"+year);//pnomek pekiştirme
                    tv26.setText( dayOfMonth +  "/" + (monthOfYear+19)+ "/"+year);//kkk
                    tv27.setText( dayOfMonth +  "/" + (monthOfYear+19)+ "/"+year);//su çiçeği
                }

                if (monthOfYear+25>12 && monthOfYear <25) {
                    monthOfYear = monthOfYear - 12;
                    year = year + 1;
                    tv28.setText( dayOfMonth +  "/" + (monthOfYear+25)+ "/"+year);//hepatit a 2

                } else {

                    tv28.setText( dayOfMonth +  "/" + (monthOfYear+25)+ "/"+year);//dhepatit a 2
                }







            }
        },year,month,day);//başlarken set edilcek değerlerimizi atıyoruz
        datePicker.setTitle("Bebeğin Doğum Tarihini Seçiniz");
        datePicker.setButton(DatePickerDialog.BUTTON_POSITIVE, "Doğum Tarihi", datePicker);
        datePicker.setButton(DatePickerDialog.BUTTON_NEGATIVE, "İptal", datePicker);

        datePicker.show();
    }
}
