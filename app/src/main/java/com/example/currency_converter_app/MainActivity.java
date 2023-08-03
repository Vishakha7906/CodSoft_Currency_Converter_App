package com.example.currency_converter_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button b1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);

        String[] from = {"USD"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to = {"Indian Rupees", "Srilankan Rupees", "Australian Dollar", "Canadian Dollar","Euro","Mexican Peso","Saudi Riyal"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());

                if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Indian Rupees")
                {
                    tot = amount * 82.71;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
               else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Srilankan Rupees")
                {
                    tot = amount * 180.0;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Australian Dollar")
                {
                    tot = amount * 1.53;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Canadian Dollar")
                {
                    tot = amount * 1.34;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Euro")
                {
                    tot = amount * 0.91;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Mexican Peso")
                {
                    tot = amount * 17.02;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if (sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Saudi Riyal")
                {
                    tot = amount * 3.75;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }

            }
        });




    }
}