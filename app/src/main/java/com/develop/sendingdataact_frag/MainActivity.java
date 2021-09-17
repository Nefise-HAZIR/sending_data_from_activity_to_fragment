package com.develop.sendingdataact_frag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    EditText weight;
    EditText height;

    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        final FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        final My_first_fragment my_first_fragment=new My_first_fragment();

        weight=findViewById(R.id.editTextWeigth);
        height=findViewById(R.id.editTextHeight);

        calculate=findViewById(R.id.button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                int userweight=Integer.valueOf(weight.getText().toString());
                int userheight=Integer.valueOf(height.getText().toString());

                bundle.putInt("weight",userweight);
                bundle.putInt("height",userheight);
                my_first_fragment.setArguments(bundle);
                fragmentTransaction.add(R.id.frame,my_first_fragment);
                fragmentTransaction.commit();
            }
        });


    }
}