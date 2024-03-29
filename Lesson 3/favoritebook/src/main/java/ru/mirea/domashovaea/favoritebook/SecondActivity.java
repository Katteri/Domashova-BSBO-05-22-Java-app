package ru.mirea.domashovaea.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = (EditText) findViewById(R.id.editTextBook);

        // Получение данных из MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textViewBook);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Моя любимая книга: %s", university));
        }
    }

    public void sendData() {
        // Отправка введенных пользователем данных по нажатию на кнопку
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, editText.getText());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}