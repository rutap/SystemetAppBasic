 package se.juneday.systemetappbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
  private Button Button1;
  private Button Button2;



  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    Button1 = (Button) findViewById(R.id.button1);
    Button2 = (Button) findViewById(R.id.button2);
  }

  public void onStart() {
    super.onStart();
    addListenerOnButton();
  }

  public void addListenerOnButton() {
    Button2.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        if (((Button) v).isClickable()) {
          setContentView(R.layout.activity_second_layout);
          Intent i = new Intent(MainActivity.this, SecondLayerActivity.class);
          startActivity(i);
        }
      }
    });

    Button1.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        if (((Button) v).isClickable()) {
          setContentView(R.layout.activity_third_layout);
          Intent i = new Intent(MainActivity.this, ThirdLayerActivity.class);
          startActivity(i);
        }
      }
    });
  }
}
