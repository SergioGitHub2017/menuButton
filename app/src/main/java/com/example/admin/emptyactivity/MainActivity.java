package com.example.admin.emptyactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // получаем индинтификатор выбранного пункта меню
        int id = item.getItemId();

        TextView infoTextView = (TextView) findViewById(R.id.textView);

        //Операции для выбранног пункта меню
        switch (id){
            case R.id.action_cat1:
                infoTextView.setText("Вы выбрали кота!");
                return true;
            case R.id.action_cat2:
                infoTextView.setText("Вы вибрали кошку");
                return true;
            case R.id.action_cat3:
                 infoTextView.setText("Вы выбрали котенка");
                 return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void onSettingsMenuClick(MenuItem item){
        TextView infoTextView = (TextView) findViewById(R.id.textView);
        infoTextView.setText("Вы выбрали пункт Settings, лучше бы выбрали кота");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
