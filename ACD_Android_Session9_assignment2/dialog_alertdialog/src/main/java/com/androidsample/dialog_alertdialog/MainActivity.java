package com.androidsample.dialog_alertdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button alertbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        alertbutton = (Button) findViewById(R.id.dbutton);


        // Capture button clicks
        alertbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {


                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Confirm Delete")
                        .setMessage("Are you sure you want to delete this?")
                        .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Deleted", Toast.LENGTH_SHORT).show();
                                // continue with delete
                                dialog.dismiss();
                            }
                        })


                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Nothing is deleted", Toast.LENGTH_SHORT).show();
                                dialog.dismiss();//destroy dialog UI

                            }
                        })

                        .show();

            }
        });
    }
}
