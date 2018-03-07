package com.androiddeveloper.imranshaikh24.www.retrofitphp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by root on 16/2/18.
 */

public class ApiClient {

    public static final String BaseUrl="http://192.168.43.22/loginandy/";

    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){

        if(retrofit == null)
        {

            retrofit = new Retrofit.Builder().baseUrl(BaseUrl).
                    addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }

}
