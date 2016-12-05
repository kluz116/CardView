package info.androidhive.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class Album_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_details);
        TextView title = (TextView) findViewById(R.id.textView);
        TextView num_of_songs = (TextView) findViewById(R.id.textView2);
        ImageView thumbnail = (ImageView) findViewById(R.id.imageView);

        if (getIntent().getSerializableExtra("album")!=null){
            Album album_list = (Album) getIntent().getSerializableExtra("album");
            title.setText("Name Of Song: "+album_list.getName());
            num_of_songs.setText("Number Of Songs : "+album_list.getNumOfSongs());
            Glide.with(this).load(album_list.getThumbnail()).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().crossFade().into(thumbnail);

        }
    }
}
