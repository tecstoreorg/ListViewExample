package tec_store.org.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView artistImg = (ImageView) findViewById(R.id.artist_img_detail);
        TextView artistName = (TextView) findViewById(R.id.artist_name_detail);
        TextView artistCountry = (TextView) findViewById(R.id.artist_country_detail);

        String theArtistName = getIntent().getStringExtra("name");

        if (theArtistName.equals("Sami Yusuf")){
            artistImg.setImageResource(R.drawable.img1);
            artistName.setText(theArtistName);
            artistCountry.setText("Azerbijan");
        }
        else if (theArtistName.equals("Maher Zain")){
            artistImg.setImageResource(R.drawable.img2);
            artistName.setText(theArtistName);
            artistCountry.setText("Lebanon");
        }

    }
}
