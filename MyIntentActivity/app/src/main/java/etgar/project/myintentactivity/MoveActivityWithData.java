package etgar.project.myintentactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithData extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_name";
    public static final String EXTRA_AGE = "extra_age";

    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TvDataReceived = findViewById(R.id.tv_data_received);

        String Nama = getIntent().getStringExtra(EXTRA_NAMA);
        int umur = getIntent().getIntExtra(EXTRA_AGE, 0);

        String display = "Nama : "+Nama+", \nUmur :"+umur;
        TvDataReceived.setText(display);
    }
}
