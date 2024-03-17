package ru.mirea.domashovaea.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MultiActivity extends AppCompatActivity {
    public String textToInsert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
    }
    public void onClickSendText(View view) {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        textToInsert = editText.getText().toString();
    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", textToInsert);
        startActivity(intent);
    }
}