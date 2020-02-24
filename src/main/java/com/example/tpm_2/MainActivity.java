package com.example.tpm_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFotoPahlawan;
    private ArrayList<PahlawanModel> listPahlawan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFotoPahlawan = findViewById(R.id.list_pahlawan);
        rvFotoPahlawan.setHasFixedSize(true);
        listPahlawan.addAll(PahlawanData.getListData());

        showRecycleList();

    }

    private void showRecycleList() {
        rvFotoPahlawan.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter = new PahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(listPahlawan);
        rvFotoPahlawan.setAdapter(pahlawanAdapter);
    }
}
