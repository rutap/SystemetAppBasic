 package se.juneday.systemetappbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


 public class MainActivity extends AppCompatActivity {
  private Button button1;
  private Button button2;
  private Button buttonsubmit;
  private RatingBar rating_b;


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    onButtonClickListener();

    button1 = (Button) findViewById(R.id.button1);
    button2 = (Button) findViewById(R.id.button2);
  }

     public void onButtonClickListener() {
      rating_b = (RatingBar) findViewById(R.id.RatingBar);
      buttonsubmit = (Button) findViewById(R.id.button3);

      buttonsubmit.setOnClickListener(
              new OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                  }
              }
      );
  }

  public void onStart() {
    super.onStart();
    addListenerOnButton();
  }

  public void addListenerOnButton() {
    button2.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        if (((Button) v).isClickable()) {
          setContentView(R.layout.activity_second_layout);
          Intent i = new Intent(MainActivity.this, SecondLayerActivity.class);
          startActivity(i);
        }
      }
    });

    button1.setOnClickListener(new OnClickListener() {
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
