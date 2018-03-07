package com.androiddeveloper.imranshaikh24.www.retrofitphp;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by root on 16/2/18.
 */

public interface ApiInterface {

    @POST("read.php")
    Call<List<Contacts>> getContacts();

}
