package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        EditText textView, textView2;
        Button button, button2;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                textView = findViewById(R.id.editTextTextPersonName);
                textView2 = findViewById(R.id.editTextTextPassword);
                button = findViewById(R.id.button);
                button2 = findViewById(R.id.button2);
        }

        public void Login(View fkr){
                Intent in = new Intent(MainActivity.this, MainActivity2.class);
                in.putExtra("Username",textView.getText().toString());
                in.putExtra("Password",textView2.getText().toString());
                startActivity(in);
            }
        public void Password(View fkr){
                Intent in = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(in);
        }
}
