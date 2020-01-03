package etgar.project.myintentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HalamanActivity2 extends AppCompatActivity {
    TextView txtNama;
    String nama;
    private String KEY_NAME = "nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        txtNama = findViewById(R.id.txt_hasil);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        txtNama.setText(nama);
    }
}
