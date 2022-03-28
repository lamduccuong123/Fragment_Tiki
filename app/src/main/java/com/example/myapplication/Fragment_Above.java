package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Above extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View aboveView = inflater.inflate(R.layout.fragment_above, container, false);

        Button btnMaGiamGia = aboveView.findViewById(R.id.btnMaGiamGia);
        EditText txtMaGiamGia = aboveView.findViewById(R.id.txtMaGiamGia);

        btnMaGiamGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ma = txtMaGiamGia.getText().toString();
                TextView txtGia = getActivity().findViewById(R.id.txtGia);
                TextView txtGiaThanhTien = getActivity().findViewById(R.id.txtGiaThanhTien);
                txtMaGiamGia.setText("");
                txtGia.setText("100.000 đ");
                txtGiaThanhTien.setText("100.000 đ");
            }
        });


        return aboveView;

    }
}
