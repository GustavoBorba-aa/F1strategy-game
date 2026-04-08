package br.com.formulajogovelha;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void selecionarMacio(View view) {
        opcaoSelecionada("PNEU MACIO");
    }

    public void selecionarChuva(View view) {
        opcaoSelecionada("PNEU CHUVA");
    }

    public void selecionarDuro(View view) {
        opcaoSelecionada("PNEU DURO");
    }

    public void opcaoSelecionada(String escolhaUsuario) {
        // Busca os componentes no layout XML pelos IDs correspondentes
        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textStatusPista = findViewById(R.id.textStatusPista);
        TextView textAdversario = findViewById(R.id.textAdversario);
        TextView txtEscolha = findViewById(R.id.txtEscolha);

        String prefixo = "SUA ESCOLHA: ";
        String textoCompleto = prefixo + escolhaUsuario;

        // SpannableString permite formatar partes específicas de uma mesma String
        SpannableString spannableString = new SpannableString(textoCompleto);

        int corPneu;
        switch (escolhaUsuario) {
            case "PNEU MACIO":
                corPneu = Color.parseColor("#FF1744");
                break;
            case "PNEU CHUVA":
                corPneu = Color.parseColor("#4CAF50");
                break;
            case "PNEU DURO":
                corPneu = Color.WHITE;
                break;
            default:
                corPneu = Color.WHITE;
                break;
        }

        spannableString.setSpan(
                new ForegroundColorSpan(corPneu),
                prefixo.length(),
                textoCompleto.length(),
                0
        );

        txtEscolha.setText(spannableString);

        List<String> conditionPista = new ArrayList<>();
        conditionPista.add("Seca");
        conditionPista.add("Chuva");
        conditionPista.add("Quente");

        String escolhaApp = conditionPista.get(new Random().nextInt(3));

        switch (escolhaApp) {
            case "Seca":
                imageResultado.setImageResource(R.drawable.pneu_vermelho);
                textAdversario.setText("CONDIÇÃO: PISTA SECA ☀️");
                break;
            case "Chuva":
                imageResultado.setImageResource(R.drawable.pneu_verde);
                textAdversario.setText("CONDIÇÃO: CHUVA 🌧️");
                break;
            case "Quente":
                imageResultado.setImageResource(R.drawable.pneu_branco);
                textAdversario.setText("CONDIÇÃO: PISTA QUENTE 🔥");
                break;
        }

        if ((escolhaUsuario.equals("PNEU MACIO") && escolhaApp.equals("Seca")) ||
                (escolhaUsuario.equals("PNEU CHUVA") && escolhaApp.equals("Chuva")) ||
                (escolhaUsuario.equals("PNEU DURO") && escolhaApp.equals("Quente"))) {

            textStatusPista.setText("ESTRATÉGIA DE AYRTON SENNA! FASTEST LAP");
            textStatusPista.setTextColor(Color.parseColor("#BB86FC"));

        } else if (escolhaApp.equals("Chuva") && !escolhaUsuario.equals("PNEU CHUVA")) {
            textStatusPista.setText("BANDEIRA VERMELHA! CARRO 12 FORA DA CORRIDA! 🏎️");
            textStatusPista.setTextColor(Color.RED);

        } else {
            textStatusPista.setText("Toto Wolff: 'BOX, BOX, BOX! 🏁");
            textStatusPista.setTextColor(Color.WHITE);
        }
    }
}