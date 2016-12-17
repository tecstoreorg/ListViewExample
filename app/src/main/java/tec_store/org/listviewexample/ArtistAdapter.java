package tec_store.org.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by devlomi on 12/16/16.
 */
public class ArtistAdapter extends ArrayAdapter<String> {
    private Context context;
    private String[] artistNames;
    private String[] artistCoutries;
    private Integer[] artistImg;


    public ArtistAdapter(Context context, String[] artistNames, String[] artistCoutries, Integer[] artistImg) {
        super(context, R.layout.list_row, artistNames);
        this.context = context;
        this.artistNames = artistNames;
        this.artistCoutries = artistCoutries;
        this.artistImg = artistImg;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = LayoutInflater.from(context).inflate(R.layout.list_row,parent,false);
        TextView artistNameTv = (TextView) item.findViewById(R.id.artist_name);
        TextView artistCountry = (TextView) item.findViewById(R.id.artist_country);
        ImageView artistImgV = (ImageView) item.findViewById(R.id.artist_img);


        artistNameTv.setText(artistNames[position]);
        artistCountry.setText(artistCoutries[position]);
        artistImgV.setImageResource(artistImg[position]);

        return item;
    }


}

