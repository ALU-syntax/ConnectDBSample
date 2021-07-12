package com.example.connectdbsample.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.widget.TextViewCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.connectdbsample.Model.DataModel;
import com.example.connectdbsample.R;

import java.util.List;

public class AdapterData{
    private Context ctx;
    private List<DataModel> listHotel;

    public AdapterData(Context ctx, List<DataModel> listHotel) {
        this.ctx = ctx;
        this.listHotel = listHotel;
    }

    public class HolderData extends RecyclerView.ViewHolder{
        View itemView;
        TextView tvNama, tvAlamat, tvTelepon;
        TextViewCompat tvTest;

        public HolderData(@NonNull View itemView){
            super(itemView);

            tvNama = itemView.findViewById(R.id.tv_nama);
        }
    }
}
