package com.grupi4.projekt1;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/*
Projekt1
Grupi 4
Java 2 / Viti 2
17.03.2019
Projekti I

Shpjegimi i programit:
Ne kete program kryhet funksioni i login.  Ka 2 inpute te ndryshme njera me emrin username dhe tjetra password.
Pasi te jene plotesuar inputet, perdoruesi mund te futet ne aplikacion nese ka passwordin dhe username te sakte.
Kushti qe ato te jene te sakte eshte qe username te jete grupi4 dhe passwordi 123
Pasi login kryhet me sukses do shfaqet verifikim i suksesshem dhe nje tekst si dhe butoni ku mund ta mbyllni
tabelen qe shfaqet.
Nese login nuk eshte i sakte shfaqet Username ose password eshte gabim
 */

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (username.getText().toString().equals("grupi4") && password.getText().toString().equals("123")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(
                            MainActivity.this
                    );
                    builder.setIcon(R.drawable.ic_thumb_up_black_24dp);
                    builder.setTitle("Verifikimi i suksesshem");
                    builder.setMessage("Mireseerdhet ne projektin 1");
                    builder.setNegativeButton("Mbyll", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }else{
                    Toast.makeText(getApplicationContext(),"Username ose password eshte gabim",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
