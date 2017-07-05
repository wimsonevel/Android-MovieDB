package id.co.blogspot.wimsonevel.android_moviedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.co.blogspot.wimsonevel.android_moviedb.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new MainFragment())
                    .commit();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
