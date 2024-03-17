package ru.mirea.domashovaea.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickEnterTheText(View view) {
        EditText editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        Toast toast = Toast.makeText(getApplicationContext(),
                "СТУДЕНТ №11 ГРУППА БСБО-05-22 Количество символов - " + text.length(),
                Toast.LENGTH_SHORT);
        toast.show();
    }
}