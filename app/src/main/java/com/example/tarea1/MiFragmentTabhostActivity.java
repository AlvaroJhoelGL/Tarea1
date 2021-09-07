package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;

public class MiFragmentTabhostActivity extends FragmentActivity {
    private FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_fragment_tabhost);
        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,

                getSupportFragmentManager(),android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Calculadora"),

                Tab1.class, null);

        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Formulario"),

                Tab2.class, null);

/*tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Lengüeta 3"),

Tab3.class, null);*/

    }
}