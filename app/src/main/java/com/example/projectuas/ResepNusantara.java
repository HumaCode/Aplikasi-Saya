package com.example.projectuas;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ResepNusantara extends AppCompatActivity {
    public DataAdapter dataAdapter;
    public RecyclerView recyclerView;
    public ArrayList<DataModel> dataModelArrayList=new ArrayList<DataModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_nusantara);

        //membuat data yang akan ditampilkan dalam list
        //file .html mengambil di folder assets
        inputData("Rendang Sapi","artikel_1.html");
        inputData("Gulai Daging Sapi","artikel_2.html");
        inputData("Ayam Bakar Kecap Bumbu Taliwang","artikel_3.html");
        inputData("Soto Ayam Daun Jeruk Jogja","artikel_4.html");
        inputData("Oseng Buncis","artikel_5.html");
        inputData("Pindang Ikan Bunga Kecombrang","artikel_6.html");
        inputData("Tumis Tempe Kacang Panjang","artikel_7.html");
        inputData("Cumi Tumis Pedas","artikel_8.html");
        inputData("Sambal Goreng Udang Jogja","artikel_9.html");
        inputData("Sop Buntut Surabaya","artikel_10.html");

        //inputData("Artikel 16","artikel_16.html");

        //menampilkan data ke dalam recyclerView
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        dataAdapter = new DataAdapter(this,dataModelArrayList);
        recyclerView.setAdapter(dataAdapter);

        //menambahakan header
        DataModel headerModel = new DataModel();
        headerModel.setViewType(2);
        dataModelArrayList.add(0,headerModel);

        //menambahkan footer
        DataModel footerModel = new DataModel();
        footerModel.setViewType(3);
        dataModelArrayList.add(footerModel);
    }

    //fungsi input
    public void inputData(String judul,String konten){
        DataModel dataModel = new DataModel();
        dataModel.setJudul(judul);
        dataModel.setKonten(konten);
        dataModel.setViewType(1);
        dataModelArrayList.add(dataModel);
    }

}