package com.example.studikasus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSatu extends Fragment {

    View dicky;
    EditText editText1;
    TextView textView1;
    Button button1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Cara untuk memanggil tampilan fargment
        dicky = inflater.inflate(R.layout.activity__fargment__satu, container, false);
        editText1 = dicky.findViewById(R.id.editText1);
        textView1 = dicky.findViewById(R.id.textView1);
        button1 = dicky.findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText1.getText().toString();
                input = input.toLowerCase();
                String[] arrayInput = input.split(" ");
                String hasil = "";
                for(int i = arrayInput.length-1; i > 0; i--){
                    System.out.println(arrayInput[i]);
                    if(arrayInput[i].equals("bohong")){
                        arrayInput[i-1] = malek(arrayInput[i-1]);

                    }
                    hasil = arrayInput[0];
                }

                textView1.setText(hasil);
            }
        });
        return dicky;
    }
    public String malek (String inputan){
        String result ="";
        if(inputan.equals("bohong")){
            result = "jujur";
        }else {
            result = "Bohong";
        }
     return result;
    }
}
