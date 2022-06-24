package com.moringaschool.rove.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.moringaschool.rove.Adapters.AcommodationAdapter;
import com.moringaschool.rove.R;
import com.moringaschool.rove.models.Datum;
import com.moringaschool.rove.models.HotelListResponse;
import com.moringaschool.rove.network.HotelApi;
import com.moringaschool.rove.retrofit_Client.HotelClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccomodationActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.acommodation_recylerview) RecyclerView recyclerView;
    public AcommodationAdapter adapter;
    public List<Datum> hotel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation);
        ButterKnife.bind(this);
        HotelApi client = HotelClient.getClient();
        Call<Datum> call =client.getHotels("KEN");
        call.enqueue(new Callback<Datum>() {
            @Override
            public void onResponse(Call<Datum> call, Response<Datum> response) {

                adapter = new AcommodationAdapter(AccomodationActivity.this,hotel);
                recyclerView.setAdapter(adapter);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AccomodationActivity.this);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setHasFixedSize(true);

            }

            @Override
            public void onFailure(Call<Datum> call, Throwable t) {

            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}