package uz.exemple.less8_task3_java.fragments;


import android.os.Bundle;


import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import uz.exemple.less8_task3_java.R;
import uz.exemple.less8_task3_java.model.ContactsModel;


public class ContactFragment extends Fragment {

    TextView textView;
    String userContact;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.contact_fragment, container, false);
        if (getArguments() != null) {
            userContact =  getArguments().getString("contact");
        }
        initViews(view,userContact);
        return view;
    }
    void initViews(View view,String userContact){
        textView = view.findViewById(R.id.tv_second_frag);
        textView.setText(userContact);
    }





}
