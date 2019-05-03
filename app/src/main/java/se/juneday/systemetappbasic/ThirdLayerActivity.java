package se.juneday.systemetappbasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ThirdLayerActivity extends AppCompatActivity {
    private Button Back;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_layout);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Back = (Button) findViewById(R.id.back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((Button) v).isClickable()) {
                    setContentView(R.layout.activity_third_layout);
                    Intent i = new Intent(ThirdLayerActivity.this, MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}