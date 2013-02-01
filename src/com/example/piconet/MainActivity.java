package com.example.piconet;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    
    private Button piconetButton;
    
    private Piconet piconet;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        piconet = new Piconet(getApplicationContext());
        
        piconetButton = (Button) findViewById(R.id.piconetButton);
        piconetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                piconet.bluetoothBroadcastMessage("Texto qualquer");
            }
        });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
