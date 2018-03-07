package com.androiddeveloper.imranshaikh24.www.retrofitphp;

import com.google.gson.annotations.SerializedName;

/**
 * Created by root on 16/2/18.
 */

public class Contacts {

    @SerializedName("email")
    private String Email;

    @SerializedName("password")
    private String Password;

    public String getEmail(){
        return Email;
    }
    public String getPassword(){
        return Password;
    }
}
