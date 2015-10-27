package com.example.family.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ActionMenuView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void showPopUp(View v)
    {
        PopupMenu popup = new PopupMenu(this,v);
        popup.setOnMenuItemClickListener(MainActivity.this);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.my_popup,popup.getMenu());
        popup.show();


    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.contests_id:
                //Toast.makeText(getBaseContext(),"You selected contests page", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,Activity2.class));
                return true;
            case R.id.cv_id:
                Toast.makeText(getBaseContext(),"You selected CV's page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.directions_id:
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                //Toast.makeText(getBaseContext(),"You selected directions page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.fun_id:
                Toast.makeText(getBaseContext(),"You selected fun page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.hacks_id:
                Toast.makeText(getBaseContext(),"You selected hacks page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.schedule_id:
                Toast.makeText(getBaseContext(),"You selected schedule page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sponsor_id:
                Toast.makeText(getBaseContext(),"You selected sponsors page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.stores_id:
                Toast.makeText(getBaseContext(),"You selected stores page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.supporters_id:
                Toast.makeText(getBaseContext(),"You selected supporters page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.tabbie_id:
                Toast.makeText(getBaseContext(),"You selected tabbie page", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.visit_id:
                Toast.makeText(getBaseContext(),"You selected visit page", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }

    }
}
