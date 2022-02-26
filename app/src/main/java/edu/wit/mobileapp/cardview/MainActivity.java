package edu.wit.mobileapp.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ListElement> list = new ArrayList<>();
        for(int i = 0; i < 12; i++)
            list.add(new ListElement("#775447" , "Pedro", "Mexico", "Activo"));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        ListAdapter adapter = new ListAdapter(list, this);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}