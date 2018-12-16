package com.example.sarath.udacityclass.Room;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sarath.udacityclass.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddUserFragment extends Fragment {

    EditText et_userId, et_Name, et_Email;
    Button btn_Save;

    public AddUserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add_user, container, false);

        et_userId = view.findViewById(R.id.et_upuserId);
        et_Name = view.findViewById(R.id.et_upName);
        et_Email = view.findViewById(R.id.et_Email);
        btn_Save = view.findViewById(R.id.btn_upSave);

        btn_Save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userId = Integer.parseInt(et_userId.getText().toString());
                String user_name = et_Name.getText().toString();
                String user_email = et_Email.getText().toString();

                User user = new User();
                user.setId(userId);
                user.setName(user_name);
                user.setEmail(user_email);

                HomeActivity.myDatabase.myDao().addUser(user);
                Toast.makeText(getActivity(), "User Added Successfully", Toast.LENGTH_SHORT).show();
                et_userId.setText("");
                et_Name.setText("");
                et_Email.setText("");
            }
        });
        return view;
    }

}
