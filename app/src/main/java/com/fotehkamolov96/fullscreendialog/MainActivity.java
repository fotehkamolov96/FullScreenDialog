package com.fotehkamolov96.fullscreendialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((Button) findViewById(R.id.opencustom)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogImageCenter();
            }
        });
        ((Button) findViewById(R.id.openfullscreen)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogImageFull();
            }
        });

    }

    private void showDialogImageCenter() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.item_custom);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.show();
    }

    private void showDialogImageFull() {
        ExampleDialog.display(getSupportFragmentManager());
    }


}