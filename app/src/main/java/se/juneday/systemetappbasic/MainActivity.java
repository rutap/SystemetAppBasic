 package se.juneday.systemetappbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {
  private CheckBox checkbox;
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    addListenerOnCheckBox();

  }
  public void addListenerOnCheckBox(){
    checkbox = (CheckBox) findViewById(R.id.checkbox);
    checkbox.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        if (((CheckBox)v).isChecked()){
          setContentView(R.layout.activity_second_layout);
          Intent i = new Intent(MainActivity.this, SecondLayerActivity.class);
          startActivity(i);
        }
      }
    });
  }
}
