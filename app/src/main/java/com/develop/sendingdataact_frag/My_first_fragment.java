package com.develop.sendingdataact_frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class My_first_fragment extends Fragment {

    TextView result;



    public My_first_fragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_my_first_fragment,container,false);
        result=view.findViewById(R.id.textViewResult);

        Bundle bundle=getArguments();
        int userweight=bundle.getInt("weight");
        int userheight=bundle.getInt("height");

        double userBMI=(userweight*10000)/(userheight*userheight);

        result.setText("your BMI is "+userBMI);

        return view;

    }
}