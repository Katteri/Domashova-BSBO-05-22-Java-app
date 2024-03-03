package ru.mirea.domashovaea.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;
    private int tmp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Мой номер по списку № 11");
                tmp++;
                if (tmp == 2){
                    checkBox.setChecked(true);
                }
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void oclBtnItsNotMe(View view) {
        tvOut.setText("Это не я сделал");
        tmp++;
        if (tmp == 2){
            checkBox.setChecked(true);
        }
    }
}