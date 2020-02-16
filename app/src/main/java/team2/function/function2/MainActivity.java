package team2.function.function2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private EditText webBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, UpdateService.class);
        startService(intent);
        webBox = findViewById(R.id.web);

        AppCompatButton b2 = findViewById(R.id.appCompatButtonLogin);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                String st=webBox.getText().toString();
                intent.putExtra("value",st);

                startActivity(intent);
                finish();

            }
        });

        AppCompatButton b3 = findViewById(R.id.mail);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, mailactivity.class);


                startActivity(intent);


            }
        });

        AppCompatButton b4 = findViewById(R.id.web1);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, web.class);


                startActivity(intent);


            }
        });

        AppCompatButton b5 = findViewById(R.id.data);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, datapasstobacktomain.class);


                startActivity(intent);


            }
        });





        ImageView clear =  findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.getId() == R.id.clear){

                    webBox.setText("");


                }


            }
        });
    }
}
