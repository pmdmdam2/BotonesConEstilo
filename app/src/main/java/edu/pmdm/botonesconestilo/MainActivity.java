package edu.pmdm.botonesconestilo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Actitividad principal en la que se muestra un interfaz con botones distintos, a los que se ha
 * aplicado un estilo personalizado. Además se incluye un menú principal en la barra de acción
 * y un menú contextual en uno de los botones.
 * @author Rafa
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btEnviar = findViewById(R.id.btEnviar);
        registerForContextMenu(btEnviar);
        Button btPregunta = findViewById(R.id.btPregunta);
        btPregunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPregunta = new Intent();

            }
        });
    }

    /**
     * Método de callback que es invocado durante el ciclo de vida de la actividad
     * @param menu Objeto tipo menú que se va a desplegar y mostrar
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    /**
     * Método de evento que es invocado cuando se selecciona un item del objeto de menú de la
     * actividad.
     * @param item Elemento del menú seleccionado
     * @return Debe devolver true si el evento es tratado, false en caso contrario
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.imEliminar:
                Toast.makeText(getBaseContext(), R.string.opcion_eliminar,Toast.LENGTH_LONG).show();
                break;
            case R.id.imModificar:
                Toast.makeText(getBaseContext(), R.string.opcion_modificar,Toast.LENGTH_LONG).show();
                break;
            case R.id.imSalir:
                Toast.makeText(getBaseContext(), R.string.opcion_salir,Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }

    /**
     * Método de callback que es llamado cuando en un View se registra un menú contextual
     * @param menu Objeto de menú a desplegar y mostrar
     * @param v Vista sobre la se registra el objeto de menú
     * @param menuInfo Información detallada del menú contextual
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.context_menu, menu);
    }

    /**
     * Método de evento que es invocado cunado se selecciona un elemento del menú contextual
     * @param item Elemento del menú contextual seleccionado
     * @return Debe devolver true si el evento es tratado, false en caso contrario
     */
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.icmGmail:
                Toast.makeText(getBaseContext(), R.string.opcion_gmail,Toast.LENGTH_LONG).show();
                break;
            case R.id.icmHotmail:
                Toast.makeText(getBaseContext(), R.string.opcion_hotmail,Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}