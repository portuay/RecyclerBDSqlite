package com.chincha.mi.turismo.recyclerbdsqlite;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AdaptorEmpresas extends RecyclerView.Adapter<AdaptorEmpresas.ViewHolderEmpresas>{

    @NonNull
    @Override
    public ViewHolderEmpresas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderEmpresas holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderEmpresas extends RecyclerView.ViewHolder {

        public ViewHolderEmpresas(View itemView) {
            super(itemView);
        }
    }
}
