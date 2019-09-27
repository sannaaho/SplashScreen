package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;
    private boolean enable=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button=(Button)findViewById(R.id.button);
        this.editText=(EditText)findViewById(R.id.editText);
    }

    public void buttonClicked (View v){

        editText.setEnabled(false);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button.isPressed()){
                    editText.setEnabled(true);
                } else {
                    editText.setEnabled(false);
                }
            }
        });


    }
}
