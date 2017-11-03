package com.example.shoddiq.multipleinputrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] header = {
                "nama", "alamat", "nik", "perusahaan", "alamat kantor", "pendidikan terakhir",
                "alamat tinggal", "telepon", "keperluan", "kemampuan", "alamat kampus", "merk laptop",
                "merk hp", "kendaraan", "alokasi waktu", "title", "occupation"
        };
        List<String> headerList = new ArrayList<>(Arrays.asList(header));

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new MainAdapter(this, headerList);
        recyclerView.setAdapter(adapter);
    }
}
