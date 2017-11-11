package edd.usac.hotel_el_lobo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

    private final int Duracion = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intento = new Intent(SplashActivity.this, Principal.class);
                startActivity(intento);
                finish();
            }
        }, Duracion);
    }
}
