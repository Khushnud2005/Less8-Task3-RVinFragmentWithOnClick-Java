package uz.exemple.less8_task3_java.adapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;

import uz.exemple.less8_task3_java.R;
import uz.exemple.less8_task3_java.fragments.ContactFragment;
import uz.exemple.less8_task3_java.model.ContactsModel;

public class ContactListAdapter extends RecyclerView.Adapter<ContactListAdapter.ViewHolder> {

    ArrayList<ContactsModel> arrayList;


    public ContactListAdapter(ArrayList<ContactsModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.textView.setText(arrayList.get(position).getName().toString());
        String contact ="Name: "+arrayList.get(position).getName()
                +"\nLastName: "+arrayList.get(position).getLastName()
                +"\nPhone: "+arrayList.get(position).getPhone();


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("contact", contact);

                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                ContactFragment contactFragment = new ContactFragment();
                contactFragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction()
                        .replace(R.id.secondFrame,contactFragment)
                        .addToBackStack(null)
                        .commit();





            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linear_layout);
            textView = itemView.findViewById(R.id.itemTv);
        }
    }
}
