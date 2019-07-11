package polinema.ac.id.aplikasikalkulatorbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bg3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg3);
    }

    public void nextGan3(View view) {
        Intent i = new Intent(bg3.this,MainActivity.class);
        startActivity(i);
    }
}
