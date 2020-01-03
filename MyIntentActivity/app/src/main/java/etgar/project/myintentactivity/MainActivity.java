package etgar.project.myintentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{

    Button btnMoveActivity;
    Button btnMoveActivityWithData;
    Button btnDial;
    Button btnWebPolines;
    Button btnIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveActivityWithData = findViewById(R.id.btn_move_data);
        btnMoveActivityWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWebPolines = findViewById(R.id.btnWebPolines);
        btnWebPolines.setOnClickListener(this);

        btnIntent = findViewById(R.id.btn_act2);
        btnIntent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_data:
                Intent moveData = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveData.putExtra(MoveActivityWithData.EXTRA_NAMA, "Ilham Etgar");
                moveData.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "085726913153";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btnWebPolines:
                Uri uriUrl = Uri.parse("https://polines.ac.id/");
                Intent webPolines = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(webPolines);
            case R.id.btn_act2:
                Intent intent= new Intent(MainActivity.this, HalamanActivity1.class);
                startActivity(intent);
        }

    }
}
