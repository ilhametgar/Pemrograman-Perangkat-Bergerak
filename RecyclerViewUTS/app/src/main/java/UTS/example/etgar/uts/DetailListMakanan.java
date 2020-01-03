package UTS.example.etgar.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.etgar.uts.R;

import java.util.ArrayList;

public class DetailListMakanan extends AppCompatActivity {
    private int makanan_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<makanan> listMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_makanan);

        makanan_id = getIntent().getIntExtra("makanan_id", 0);
        tvName = findViewById(R.id.nama_makanan);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listMakanan.addAll(MakananData.getListData());

        setLayout();
    }

    private void setLayout() {
        tvName.setText(listMakanan.get(makanan_id).getName());
        tvDesc.setText(listMakanan.get(makanan_id).getDescription());
        Glide.with(this)
                .load(listMakanan.get(makanan_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
