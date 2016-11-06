package app.lucas.br.moto29;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    Button btNovasEntregas;
    Button btHistorico;
    private GoogleApiClient mGoogleApiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btNovasEntregas = (Button)findViewById(R.id.btNovasEntregas);
        btNovasEntregas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, NovasEntregas.class);
                startActivity(it);
                Log.d("LOG", "teste");
            }
        });

        btHistorico = (Button)findViewById(R.id.btHistorico);
        btHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, HistoricoEntregas.class);
                startActivity(it);
            }
        });


    }
}
