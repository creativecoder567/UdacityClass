package com.example.sarath.udacityclass.Room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.sarath.udacityclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {

    Button btn_adduser, btn_viewuser,btn_deleteUser,btn_updateUser;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        btn_adduser = view.findViewById(R.id.btn_adduser);
        btn_adduser.setOnClickListener(this);

        btn_viewuser = view.findViewById(R.id.btn_viewuser);
        btn_viewuser.setOnClickListener(this);

        btn_deleteUser = view.findViewById(R.id.btn_deleteUser);
        btn_deleteUser.setOnClickListener(this);

        btn_updateUser = view.findViewById(R.id.btn_updateUser);
        btn_updateUser.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_adduser:
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container, new AddUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.btn_viewuser:
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new ReadUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.btn_deleteUser:
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new DeleteUserFragment()).addToBackStack(null).commit();
                break;

            case R.id.btn_updateUser:
                HomeActivity.fragmentManager.beginTransaction().replace(R.id.fragment_container,new UpdateFragment()).addToBackStack(null).commit();
                break;
        }
    }
}
