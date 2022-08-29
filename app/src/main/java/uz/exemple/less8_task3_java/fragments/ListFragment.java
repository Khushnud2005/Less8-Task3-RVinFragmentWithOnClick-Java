package uz.exemple.less8_task3_java.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import uz.exemple.less8_task3_java.R;
import uz.exemple.less8_task3_java.adapter.ContactListAdapter;
import uz.exemple.less8_task3_java.model.ContactsModel;

public class ListFragment extends Fragment {
    RecyclerView recyclerView;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        initViews(view);
        return view;
    }

    void initViews(View view){
        recyclerView = view.findViewById(R.id.recyclerView);
        ArrayList<ContactsModel> arrayList = new ArrayList<>();
        for (int i=1;i<21;i++){
            arrayList.add(new ContactsModel("User "+i,"Userov "+i,i+"234"+i+"678"+i));
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new ContactListAdapter(arrayList));


    }


}