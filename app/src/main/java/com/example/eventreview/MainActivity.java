package com.example.eventreview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text1 ,text2;
    CheckBox chkagree;
    RadioGroup rgroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnok;
    ImageView imgpet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        chkagree = findViewById(R.id.chkAgree);
        rgroup1 = findViewById(R.id.rgroup1);
        rdoDog = findViewById(R.id.rdoDog);
        rdoCat = findViewById(R.id.rdoCat);
        rdoRabbit = findViewById(R.id.rdoRabbit);
        btnok = findViewById(R.id.btnOK);
        imgpet = findViewById(R.id.imgPet);

       chkagree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (chkagree.isChecked()==true){
                   text2.setVisibility(View.VISIBLE);
                   rgroup1.setVisibility(View.VISIBLE);
                   btnok.setVisibility(View.VISIBLE);
                   imgpet.setVisibility(View.VISIBLE);
               }
               else{
                   text2.setVisibility(View.VISIBLE);
                   rgroup1.setVisibility(View.VISIBLE);
                   btnok.setVisibility(View.VISIBLE);
                   imgpet.setVisibility(View.VISIBLE);
               }
           }
       });

       btnok.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               switch (rgroup1.getCheckedRadioButtonId()){
                   case R.id.rdoDog:
                       imgpet.setImageResource(R.drawable.dog);
                       break;
                   case R.id.rdoCat:
                       imgpet.setImageResource(R.drawable.cat);
                       break;
                   case R.id.rdoRabbit:
                       imgpet.setImageResource(R.drawable.rabbit);
                       break;
               }
           }
       });
    }
}