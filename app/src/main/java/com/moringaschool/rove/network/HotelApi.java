package com.moringaschool.rove.network;


import com.moringaschool.rove.models.Datum;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HotelApi {
    @GET("hotels")
    Call<Datum> getHotels(
            @Query("{country}" ) Object country
    );

}
