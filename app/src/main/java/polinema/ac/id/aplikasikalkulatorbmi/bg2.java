package polinema.ac.id.aplikasikalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bg2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg2);
    }

    public void nextGan2(View view) {
        Intent i = new Intent(bg2.this,bg3.class);
        startActivity(i);
    }
}
