package app.turestaurante.restaurante.com.turestaurante;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Timer;
import java.util.TimerTask;


public class Splash extends Activity {

    //deblaramos el tiempo de duracion del splash en este caso tres segundos
    private static final long time_splash = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //llamamos al metodo timerTask para hacer el cambio de actividad cuando este se ejecute
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                // Start the next activity
                //cambio de actividad
                Intent cambio_activity = new Intent().setClass(
                        Splash.this, MainActivity.class);
                startActivity(cambio_activity);

                // Close the activity so the user won't able to go back this
                // activity pressing Back button
                finish();
            }
        };

        // Simulate a long loading process on application startup.
        //llamamos al metodo timer para que ejecute el metodo timertask despues del tiempo definido
        Timer timer = new Timer();
        timer.schedule(task, time_splash);
    }


}
