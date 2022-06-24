package com.moringaschool.rove.retrofit_Client;

import com.moringaschool.rove.Constants;
import com.moringaschool.rove.network.HotelApi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class HotelClient {
    public HotelClient() {
    }
    private static  Retrofit retrofit = null;
    public static HotelApi getClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Interceptor.Chain chain) throws IOException {
                        Request newRequest  = chain.request().newBuilder()
                                .addHeader("x-api-key", "sandb_RbjffrWE0k1vLf0HpvRB1e3jfd7WfsrnRVcKcYcr")
                                .build();
                        return chain.proceed(newRequest);
                    }
                })
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.HOTEL_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit.create(HotelApi.class) ;

    }
}
