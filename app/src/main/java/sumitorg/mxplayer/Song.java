package sumitorg.mxplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Song extends AppCompatActivity {
    Button bt1,bt2;
    MediaPlayer mp, mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        final MediaPlayer mp = MediaPlayer.create(Song.this,R.raw.song1);
        final MediaPlayer mp2 = MediaPlayer.create(Song.this,R.raw.song2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp.isPlaying()){
                        mp.start();
                        mp2.stop();
                }else{
                   mp.start();
                }

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp2.isPlaying()){
                        mp2.start();
                        mp.stop();
                }else{

                        mp2.start();

                }
            }
        });
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        mp.stop();
        mp2.stop();
    }
}

