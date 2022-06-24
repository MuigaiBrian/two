package com.moringaschool.rove.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.rove.R;

public class RailAdapter extends RecyclerView.Adapter<RailAdapter.ViewHolder> {
    Context context;

    public RailAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RailAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflate =LayoutInflater.from(context);
        View view = inflate.inflate(R.layout.rail_list_strip,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView departure;
        TextView arrival;
        TextView estimation;
        TextView amount;
        CardView cardView;
        ImageView image;


        public ViewHolder( View itemView) {
            super(itemView);
                departure=itemView.findViewById(R.id.RailDepartureData);
                arrival=itemView.findViewById(R.id.RailArrivalData);
                estimation=itemView.findViewById(R.id.RailArrivalData);
                amount=itemView.findViewById(R.id.RailAmountData);
                cardView=itemView.findViewById(R.id.RailCardView);
                image=itemView.findViewById(R.id.RailImageDisplay);

        }
    }
}
