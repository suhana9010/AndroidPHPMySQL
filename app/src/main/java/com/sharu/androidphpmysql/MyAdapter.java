package com.sharu.androidphpmysql;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<UserInfo> userInfos;
    private Context context;

    public MyAdapter(List<UserInfo> userInfos, Context context) {
        this.userInfos= userInfos;
        this.context = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);


        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        UserInfo userInfo=userInfos.get(position);
        holder.textViewName.setText(userInfo.getName());
        holder.textViewEmail.setText(userInfo.getEmail());


    }

    @Override
    public int getItemCount() {
        return userInfos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewName;
        public TextView textViewEmail;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName=(TextView)itemView.findViewById(R.id.textviewName);
            textViewEmail=(TextView)itemView.findViewById(R.id.textviewEmail);



        }
    }
}
