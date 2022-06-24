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

public class AirAdapter extends RecyclerView.Adapter<AirAdapter.ViewHolder> {
    Context context;

    public AirAdapter(Context context) {
        this.context = context;
    }

    @Override
    public AirAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflate =LayoutInflater.from(context);
        View view = inflate.inflate(R.layout.air_list_strip,parent,false);
        return new AirAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AirAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder  extends RecyclerView.ViewHolder{
        TextView departure;
        TextView arrival;
        TextView estimation;
        TextView amount;
        ImageView image;
        CardView cardView;
        public ViewHolder( View itemView) {
            super(itemView);
            departure=itemView.findViewById(R.id.departure_data);
            arrival=itemView.findViewById(R.id.arrival_data);
            estimation=itemView.findViewById(R.id.Estimation_data);
            amount=itemView.findViewById(R.id.amount_data);
            cardView=itemView.findViewById(R.id.cardview);
            image=itemView.findViewById(R.id.imagedisplay);
        }
    }
}
