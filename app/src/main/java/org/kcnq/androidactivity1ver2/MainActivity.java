package org.kcnq.androidactivity1ver2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String myPassWord = "1234";
        final String myUserName = "Ako";

        final Button callLogIn = findViewById(R.id.logIn);
        final EditText callUserName = findViewById(R.id.userName);
        final EditText callPassWord = findViewById(R.id.passWord);

        callLogIn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String typePassWord = String.valueOf(callPassWord.getText()); // callPassWord.getText().toString();
                        String typeUserName = String.valueOf(callUserName.getText());//callUserName.getText().toString();

                        if(typePassWord.equals(myPassWord) && typeUserName.equalsIgnoreCase(myUserName)) {
                            // callWelcome.setText("Welcome!");
                            Toast.makeText(MainActivity.this,
                                    "You successfully logged in!",
                                    Toast.LENGTH_LONG).show();
                        } else if(typePassWord != myPassWord || typeUserName != myUserName) {
                            Toast.makeText(MainActivity.this,
                                    "Incorrect username or password",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

    }
}
