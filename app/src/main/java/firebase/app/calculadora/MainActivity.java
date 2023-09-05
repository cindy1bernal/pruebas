package firebase.app.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button_suma;
    private Button button_resta;
    private Button button_multiplicacion;
    private Button button_division;

    private TextView text_respuesta;
    private EditText edit_numero1;
    private EditText edit_numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.respuesta);
        edit_numero1 = findViewById(R.id.numero1);
        edit_numero2 = findViewById(R.id.numero2);

        button_suma = findViewById(R.id.button_suma);
        button_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              text_respuesta.setText(suma(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");
            }
        });
        button_resta = findViewById(R.id.button_resta);
        button_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(suma(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");
            }
        });
        button_multiplicacion = findViewById(R.id.button_multiplicacion);
        button_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(suma(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");
            }
        });
        button_division = findViewById(R.id.button_division);
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_respuesta.setText(suma(Integer.parseInt(edit_numero1.getText().toString()),Integer.parseInt(edit_numero2.getText().toString()) )+"");
            }
        });

    }

    public int suma (int a, int b){
        return a+b;
    }
    public int resta (int a, int b){
        return a-b;
    }
    public int multiplicacion (int a, int b){
        return a*b;
    }
    public int division (int a, int b){
        return a/b;
    }
}