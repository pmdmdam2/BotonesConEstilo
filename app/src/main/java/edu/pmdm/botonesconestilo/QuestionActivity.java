package edu.pmdm.botonesconestilo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_child);
        Button btAceptar = findViewById(R.id.btAceptar);
        final RadioGroup rgPregunta = findViewById(R.id.rgPregunta);
        btAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rgPregunta.getCheckedRadioButtonId()==R.id.rbP4)
                    Toast.makeText(getBaseContext(),"Muy bien, enhorabuena!!!!",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getBaseContext(),"¡Qué triste, deberías concienciarte un poco más" +
                            "sobre la violencia de género!",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}