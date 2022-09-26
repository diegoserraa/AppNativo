package com.example.myapplication.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.controller.adapter.CompraItemListViewAdapter;
import com.example.myapplication.model.entity.CompraItem;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        List<CompraItem> compraItemList = new ArrayList<>();
        compraItemList.add(new CompraItem(1, "noticia 1", "testando noticia 1"));
        compraItemList.add(new CompraItem(2, "noticia 2", "testando noticia 2"));
        compraItemList.add(new CompraItem(3, "noticia 3", "testando noticia 3"));
        compraItemList.add(new CompraItem(4, "noticia 4", "testando noticia 4"));
        compraItemList.add(new CompraItem(5, "noticia 5", "testando noticia 5"));
        compraItemList.add(new CompraItem(6, "noticia 6", "testando noticia 6"));

        CompraItemListViewAdapter adapter = new CompraItemListViewAdapter(compraItemList);

        ListView listViewCompraItem = findViewById(R.id.list_view_compra_item);
        listViewCompraItem.setAdapter(adapter);

        listViewCompraItem.setClickable(true);
        listViewCompraItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this, NovasActivity.class);

                intent.putExtra("title", compraItemList.get(position).getTitulo());
                intent.putExtra("descricao", compraItemList.get(position).getDescricao());


                startActivity(intent);
            }
        });
    }
}


