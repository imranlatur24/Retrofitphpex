package com.androiddeveloper.imranshaikh24.www.retrofitphp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 16/2/18.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Contacts> contacts;

    public RecyclerAdapter(List<Contacts> contacts){
        this.contacts = contacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.Email.setText(contacts.get(position).getEmail());
        holder.Password.setText(contacts.get(position).getPassword());

    }

    @Override
    public int getItemCount() {


        return contacts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView Email,Password;

        public MyViewHolder(View itemView) {
            super(itemView);

            Email = (TextView)itemView.findViewById(R.id.email);
            Password = (TextView)itemView.findViewById(R.id.password);

        }
    }
}
