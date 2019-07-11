package polinema.ac.id.aplikasikalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg1);
    }

    public void nextGan(View view) {
        Intent i = new Intent(bg1.this,bg2.class);
        startActivity(i);
    }
}
