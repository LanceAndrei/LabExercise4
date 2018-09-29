package lance.wico.com.labexercise4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastBtn = (Button) findViewById(R.id.toastBtn);
        Button snackbarBtn = (Button) findViewById(R.id.snackbarBtn);
        Button snackbaractBtn = (Button) findViewById(R.id.snackbaractBtn);


        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "TOAST ME DADDY!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(),message,duration).show();
            }
        });

        snackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Hello there handsome";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);

            }
        });

        snackbaractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Oh you touched me again";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(view, message, duration);

            }

        });

    }


    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message, duration).show();
    }

    public void showSnackbarAct(View view, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            snackbar.dismiss();

        }

    });

        snackbar.show();

    }



    @Override
    protected void onStart(){

        super.onStart();
        Log.d( "Lab Exercise 4", "onResume() has executed");

    }


}