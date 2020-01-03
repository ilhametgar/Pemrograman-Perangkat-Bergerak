package ilham.project.ormawapolines;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHmj;
    private ArrayList<Hmj> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Ormawa Polines");
        }
        rvHmj = findViewById(R.id.rv_hmj);
        rvHmj.setHasFixedSize(true);

        list.addAll(HmjData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvHmj.setLayoutManager(new LinearLayoutManager(this));
        CardHmjAdapter cardHmjAdapter = new CardHmjAdapter(this, list);
        rvHmj.setAdapter(cardHmjAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu mn){
        getMenuInflater().inflate(R.menu.profil, mn);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.action_profil){
            Intent profil = new Intent(this, ProfilActivity.class);
            startActivity(profil);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
