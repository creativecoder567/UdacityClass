package com.example.sarath.udacityclass.Room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sarath.udacityclass.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReadUserFragment extends Fragment {

    TextView tv_displayInfo;

    public ReadUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_read_user, container, false);

        tv_displayInfo = view.findViewById(R.id.tv_displayInfo);

        List<User> users = HomeActivity.myDatabase.myDao().getusers();

        String info = "";
        for (User user : users) {
            int id = user.getId();
            String name = user.getName();
            String email = user.getEmail();
            info = info +"\n\n"+"Id :"+id+"\n Name :"+name+"\n Email :"+email;

        }
         tv_displayInfo.setText(info);
        return view;
    }

}
