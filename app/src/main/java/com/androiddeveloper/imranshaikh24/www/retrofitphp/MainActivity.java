package com.androiddeveloper.imranshaikh24.www.retrofitphp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private RecyclerView.LayoutManager layoutManager;

    private  RecyclerAdapter adapter;

    private List<Contacts> contacts;

    private ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recylerview);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Contacts>> call = apiInterface.getContacts();

        call.enqueue(new Callback<List<Contacts>>() {
            @Override
            public void onResponse(Call<List<Contacts>> call, Response<List<Contacts>> response) {

                contacts = response.body();

                adapter  = new RecyclerAdapter(contacts);

                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<List<Contacts>> call, Throwable t) {

            }
        });
    }
}
