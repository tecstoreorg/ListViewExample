package tec_store.org.listviewexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);

        String[] artistsNames = {"Sami Yusuf", "Maher Zain", "Raef", "AlAfasy", "Humood AlKhuder", "Hamza Namira"};
        String[] country = {"Azerbijan", "Lebanon", "USA", "Kuwait", "Kuwait", "Egypt"};
        Integer[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6};


        final ArtistAdapter adapter = new ArtistAdapter(this, artistsNames, country, images);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("name",adapterView.getItemAtPosition(i).toString());
                startActivity(intent);
            }
        });


    }
}
