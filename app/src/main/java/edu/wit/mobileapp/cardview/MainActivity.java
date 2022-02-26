package edu.wit.mobileapp.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447" , "Pedro", "Mexico", "Activo"));
        elements.add(new ListElement("#607832" , "Alex", "Tabasco", "Activo"));
        elements.add(new ListElement("#03af32" , "Denis", "Puebla", "Cancelado"));
        elements.add(new ListElement("#034222" , "Armando", "Yucatan", "Activo"));
        elements.add(new ListElement("#834222" , "Luis", "Tlaxcala", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);

    }

}