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
public class UpdateFragment extends Fragment {

    EditText et_upuserId,et_upName,et_upEmail;
    Button btn_upSave;

    public UpdateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_update, container, false);

        et_upuserId = view.findViewById(R.id.et_upuserId);
        et_upName = view.findViewById(R.id.et_upName);
        et_upEmail = view.findViewById(R.id.et_upEmail);
        btn_upSave = view.findViewById(R.id.btn_upSave);

        btn_upSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = Integer.parseInt(et_upuserId.getText().toString());
                String name = et_upName.getText().toString();
                String email = et_upEmail.getText().toString();

                User user = new User();
                user.setId(id);
                user.setName(name);
                user.setEmail(email);

                HomeActivity.myDatabase.myDao().updateUser(user);
                Toast.makeText(getActivity(), "User Updated Successfully", Toast.LENGTH_SHORT).show();
                et_upuserId.setText("");
                et_upName.setText("");
                et_upEmail.setText("");
            }
        });
        return view;
    }

}
