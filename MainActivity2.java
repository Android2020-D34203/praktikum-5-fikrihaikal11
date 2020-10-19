package id.ac.id.telkomuniversity.tass.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView Username, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Username = findViewById(R.id.textViewUser);
        Password = findViewById(R.id.textViewPassword);
        Intent in = getIntent();
        String user = getIntent().getExtras().getString("Username");
        String password = getIntent().getExtras().getString("Password");
        Username.setText("Username : " + user);
        Password.setText("Password : " + password);
    }
}

