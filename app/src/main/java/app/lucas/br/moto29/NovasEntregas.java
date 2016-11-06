package app.lucas.br.moto29;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Lucas on 04/11/2016.
 */
public class NovasEntregas extends Activity{

    ListView lvNovasEntregas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novas_entregas);

        lvNovasEntregas = (ListView)findViewById(R.id.lvNovasEntregas);
        String[] list = getResources().getStringArray(R.array.novas_entregas);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);

        lvNovasEntregas.setAdapter(arrayAdapter);

        lvNovasEntregas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0) {
                    Intent it = new Intent(NovasEntregas.this, DetalhesNovasEntregas.class);
                    startActivity(it);
                }
            }
        });


    }
}
