package com.aimtrix.optimizer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boost = findViewById(R.id.btnOptimize);

        boost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GamingOptimizer optimizer = new GamingOptimizer();
                optimizer.optimize();

                Toast.makeText(MainActivity.this, "Game Boosted 🚀", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
