package edu.wit.mobileapp.cardview;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This application uses CardView to display cards with an image, title and description
 * This is the MainActivity it creates the items that will be shown and calls necessary
 * classes to display them.
 * @author Samuel Hernandez
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get placeholder default image
        Bitmap defaultImage = BitmapFactory.decodeResource(getResources(), R.drawable.cat);

        //Create list and populate it
        String description = "This is just a placeholder for an actual description";
        List<Card> cards = IntStream.range(1, 12).mapToObj(i ->
                new Card(defaultImage, "Title "+i, description)).collect(Collectors.toList());

        //Create manager, adapter, pass the list of cards
        LinearLayoutManager manager = new LinearLayoutManager(this);
        CardAdapter adapter = new CardAdapter(cards, this);
        //Create recycler view and set manager and adapter
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);
    }
}