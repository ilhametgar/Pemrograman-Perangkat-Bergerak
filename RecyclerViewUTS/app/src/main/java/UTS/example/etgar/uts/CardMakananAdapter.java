package UTS.example.etgar.uts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.etgar.uts.R;

import java.util.ArrayList;

public class CardMakananAdapter extends RecyclerView.Adapter<CardMakananAdapter.ListViewHolder> {
    private ArrayList<makanan> listMakanan;
    private Context context;

    public CardMakananAdapter(Context context, ArrayList<makanan> listMakanan) {
        this.listMakanan = listMakanan;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_makanan, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final makanan makanan = listMakanan.get(position);
        Glide.with(holder.itemView.getContext())
                .load(makanan.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);
        holder.tvName.setText(makanan.getName());
        holder.tvDesc.setText(makanan.getDescription());


        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailListMakanan.class);
                intent.putExtra("makanan_id", makanan.getId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public  int getItemCount () { return listMakanan.size(); }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_makanan_list);
            tvName = itemView.findViewById(R.id.nama_makanan_list);
            tvDesc = itemView.findViewById(R.id.desc_makanan_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}

