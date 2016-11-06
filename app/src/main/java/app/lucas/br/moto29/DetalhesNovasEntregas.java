package app.lucas.br.moto29;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Lucas on 04/11/2016.
 */

public class DetalhesNovasEntregas extends Activity {

    Button btAceitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_novas_entregas);

        btAceitar = (Button)findViewById(R.id.btAceitar);
        btAceitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(DetalhesNovasEntregas.this, Mapa.class);
                startActivity(it);
            }
        });
    }
}
