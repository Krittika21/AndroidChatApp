package com.androidchatapp.data.Remote;

/**
 * Created by Krittika on 13-03-2019.
 */
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;
    //public  static String baseUrl = "https://chat.promactinfo.com/api/";
    public static Retrofit getClient(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    public static <S> S createService(Class<S> serviceType){
        return retrofit.create(serviceType);
    }
}