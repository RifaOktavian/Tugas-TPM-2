package com.example.tpm_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.ViewHolder> {

    private Context context;
    private ArrayList<PahlawanModel> pahlawanModels;

    public PahlawanAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<PahlawanModel> getPahlawanModels() {
        return pahlawanModels;
    }

    public void setPahlawanModels(ArrayList<PahlawanModel> pahlawanModels) {
        this.pahlawanModels = pahlawanModels;
    }

    @NonNull
    @Override
    public PahlawanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_pic,viewGroup,false);

        return new RecyclerView.ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull PahlawanAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getPahlawanModels().get(i).getmFotoPahlawan()).into(viewHolder.ivFotoPahlawan);
        viewHolder.tvNamaPahlawan.setText(getPahlawanModels().get(i).getmNamaPahlawan());

    }

    @Override
    public int getItemCount() {
        return getPahlawanModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivFotoPahlawan;
        private TextView tvNamaPahlawan;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            ivFotoPahlawan = itemView.findViewById(R.id.ivFotoPahlawan);
            tvNamaPahlawan = itemView.findViewById(R.id.tvNamaPahlawan);
        }
    }
}
