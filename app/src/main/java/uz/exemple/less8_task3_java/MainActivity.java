package uz.exemple.less8_task3_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import uz.exemple.less8_task3_java.fragments.ListFragment;
import uz.exemple.less8_task3_java.fragments.ContactFragment;
import uz.exemple.less8_task3_java.model.ContactsModel;

public class MainActivity extends AppCompatActivity  {
    ListFragment listFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        listFragment = new ListFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.firstFrame,listFragment)
                .commit();

    }


}