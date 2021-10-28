package com.example.tugasrumah4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    private ArrayList<Item> dataList;
    public ItemAdapter(ArrayList<Item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtgenre.setText(dataList.get(position).getgenre());
        holder.txtasal.setText(dataList.get(position).getAsal());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtgenre, txtasal;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNama = (TextView)
                    itemView.findViewById(R.id.txt_nama);
            txtgenre = (TextView)
                    itemView.findViewById(R.id.txt_genre);
            txtasal = (TextView)
                    itemView.findViewById(R.id.txt_asal);
        }
    }
}
