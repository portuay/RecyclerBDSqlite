package com.chincha.mi.turismo.recyclerbdsqlite;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptorEmpresas extends RecyclerView.Adapter<AdaptorEmpresas.ViewHolderEmpresas>{

    ArrayList<EmpresasCh> listaEmpresas;

    public AdaptorEmpresas(ArrayList<EmpresasCh> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    @NonNull
    @Override
    public ViewHolderEmpresas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderEmpresas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEmpresas holder, int position) {

        holder.etiNombre.setText(listaEmpresas.get(position).getNombre());
        holder.etiInfo.setText(listaEmpresas.get(position).getInfo());
        holder.image.setImageResource(listaEmpresas.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return listaEmpresas.size();
    }

    public class ViewHolderEmpresas extends RecyclerView.ViewHolder {

        TextView etiNombre, etiInfo;
        ImageView image;

        public ViewHolderEmpresas(View itemView) {
            super(itemView);
            etiNombre = (TextView) itemView.findViewById(R.id.idNombre);
            etiInfo = (TextView) itemView.findViewById(R.id.idInfo);
            image = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
