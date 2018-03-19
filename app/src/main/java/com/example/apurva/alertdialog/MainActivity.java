package com.example.apurva.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count=0;
    Button open_dialog;
    AlertDialog.Builder ab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        open_dialog=findViewById(R.id.btn_open_dialog);

        open_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ab=new AlertDialog.Builder(MainActivity.this);
                ab.setMessage("Aj kuch tufani karte hai");
                ab.setTitle("Tufani");
                ab.setIcon(R.mipmap.ic_launcher);
                ab.setCancelable(false);
                ab.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "HA karte  hi", Toast.LENGTH_SHORT).show();
                    }
                });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                ab.show();

            }
        });
    }

    @Override
    public void onBackPressed() {
        count++;
        if (count==1){
            Toast.makeText(this, "Press again"+count, Toast.LENGTH_SHORT).show();
        }
        else {
            super.onBackPressed();

        }
    }
}
