package etgar.project.myintentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HalamanActivity1 extends AppCompatActivity implements View.OnClickListener {
     Button btnHlm2;
     EditText edtNama;
     private String KEY_NAME = "nama";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman1);
        btnHlm2 = findViewById(R.id.btn_hlm2);
        edtNama = findViewById(R.id.txt_nama);
        btnHlm2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        String nama = edtNama.getText().toString();
        Intent intent = new Intent(HalamanActivity1.this, HalamanActivity2.class).putExtra(KEY_NAME,nama);
        startActivity(intent);
    }
}
