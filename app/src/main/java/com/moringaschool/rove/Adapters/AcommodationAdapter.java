package com.moringaschool.rove.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rove.R;
import com.moringaschool.rove.models.Datum;

import java.util.List;

public class AcommodationAdapter extends RecyclerView.Adapter<AcommodationAdapter.ViewHolder> {
    Context context;
   public List<Datum> hotelResponse;

    public AcommodationAdapter(Context context, List<Datum> hotelResponse) {
        this.context = context;
        this.hotelResponse = hotelResponse;
    }

    @NonNull
    @Override
    public AcommodationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate =LayoutInflater.from(context);
        View view = inflate.inflate(R.layout.acommodation_strip,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AcommodationAdapter.ViewHolder holder, int position) {
        holder.hotel.setText(hotelResponse.get(position).getName());
        holder.amount.setText(hotelResponse.get(position).getCurrency());
//        holder.cardview.setOnClickListener(view -> {
//            Intent intent = new Intent(context, AcommodationDetailActivity.class);
//            context.startActivity(intent);
//
//        });

    }

    @Override
    public int getItemCount() {
        return hotelResponse.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView hotel;
        TextView amount;
        ImageView image;
        CardView cardview;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hotel=itemView.findViewById(R.id.AcommodationHotelName);
            amount=itemView.findViewById(R.id.AccommodationPrice);
            cardview=itemView.findViewById(R.id.AccommodationCardView);
            image=itemView.findViewById(R.id.AccommodationImageView);
        }
    }
}
