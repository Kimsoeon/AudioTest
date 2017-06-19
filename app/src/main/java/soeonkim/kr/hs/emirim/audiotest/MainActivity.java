package soeonkim.kr.hs.emirim.audiotest;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switch_music;
    MediaPlayer musicPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch_music= (Switch)findViewById(R.id.switch_music);
        musicPlayer = MediaPlayer.create(this, R.raw.the_physics_of_love);
        switch_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switch_music.isChecked())
                    musicPlayer.start();
                else
                    musicPlayer.pause();
            }
        });

    }

    @Override
    protected void onStop() {
        musicPlayer.stop();
    }
}
