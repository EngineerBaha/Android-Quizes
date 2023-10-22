package com.example.quiz1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void alertButtonOnClick(View view) {
        makeAndShowDialogBox("Are you sure?");
    }

    public void toastButtonOnClick(View view) {
    displayToast("Baha Kuzudişli");

    }
    private void displayToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
    private void makeAndShowDialogBox(String msg) {

        AlertDialog.Builder myDialogBox = new AlertDialog.Builder(this);

// set message, title, and icon
        myDialogBox.setTitle("My Alert Dialog");
        myDialogBox.setMessage(msg);
        myDialogBox.setIcon(R.drawable.ic_launcher_foreground);
// Set three option buttons
        myDialogBox.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
// whatever should be done when answering "Yes" goes
// here
            }
        });
        myDialogBox.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
// whatever should be done when answering "No" goes
// here
            }
        });
        myDialogBox.setNeutralButton("Cancel",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
// whatever should be done when answering "Cancel" goes
// here
            }
        });
        myDialogBox.create();
        myDialogBox.show();
    }
}