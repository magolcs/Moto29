package app.lucas.br.moto29;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Lucas on 04/11/2016.
 */

public class HistoricoEntregas extends Activity {

    ListView lvHistorico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        lvHistorico = (ListView)findViewById(R.id.lvHistorico);
        String[] list = getResources().getStringArray(R.array.historico);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);

        lvHistorico.setAdapter(arrayAdapter);

    }
}
