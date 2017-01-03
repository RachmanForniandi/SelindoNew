package com.selindonew;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    EditText eT1;
    Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        eT1 = (EditText) view.findViewById(R.id.eT1);
        btn1 = (Button) view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainFragment.this.getActivity(), "Submitted", Toast.LENGTH_SHORT).show();
                if (eT1.getText().toString().equals("10.8.12.5")) {
                    Toast.makeText(MainFragment.this.getActivity(), "Koneksi IP Berhasil", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainFragment.this.getActivity(), "Koneksi IP Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}




