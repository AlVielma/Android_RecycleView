package com.example.practica7_recycleview.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica7_recycleview.Models.CartasYugioh;
import com.example.practica7_recycleview.R;
import com.example.practica7_recycleview.Yugioh;

import java.util.List;

public class YugiohAdapter extends RecyclerView.Adapter<YugiohAdapter.ViewHolder>
{
    List<CartasYugioh> Lista_Yugi;

    public YugiohAdapter(List<CartasYugioh> lista_Yugi) {
        Lista_Yugi = lista_Yugi;
    }

    @NonNull
    @Override
    public YugiohAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.itemyugioh,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull YugiohAdapter.ViewHolder holder, int position) {
    CartasYugioh y = Lista_Yugi.get(position);
    holder.setData(y);
    }

    @Override
    public int getItemCount() {
        return Lista_Yugi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre,txttipo;
        CartasYugioh yp;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.txtnombre);
            txttipo = itemView.findViewById(R.id.txttipo);
        }

        public void setData(CartasYugioh y) {
            yp = y;
            txtnombre.setText(yp.getNombre());
            txttipo.setText(yp.getTipo());
        }
    }
}


