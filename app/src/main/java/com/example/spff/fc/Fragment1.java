package com.example.spff.fc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment1, container, false);
        Button fbutton12 = (Button) view.findViewById(R.id.fbutton12);
        Button fbutton13 = (Button) view.findViewById(R.id.fbutton13);

        fbutton12.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((MainActivity)getActivity()).switchFragment(2);
            }
        });
        fbutton13.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((MainActivity)getActivity()).switchFragment(3);
            }
        });

        return view;
    }

}
