package unac.angelica.proyecto1_contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button boton;
    private TextView txt, txtCicloVida;
    private int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCicloVida = (TextView) findViewById(R.id.textView);
        txtCicloVida.setText("Bienvenido");

        txt = (TextView) findViewById(R.id.txtSumador);

        boton = (Button) findViewById(R.id.btnSum);

        boton.setOnClickListener(new OnClickListener( ) {
            @Override
            public void onClick(View view) {
                cont++;
                txtCicloVida.setText("estoy en onClick");
                txt.setText("Total: " + cont);
            }



        });
    }
}
