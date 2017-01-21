package com.example.spff.fc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }

    private FragmentManager manager;
    private FragmentTransaction transaction;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment2, container, false);


        manager = getChildFragmentManager();
        transaction = manager.beginTransaction();
        MenuFragment menuFragment = new MenuFragment();
        transaction.replace(R.id.fragment2MenuFrag, menuFragment, "menuFragment");
        transaction.commit();



        Button fbutton21 = (Button) view.findViewById(R.id.fbutton21);
        Button fbutton23 = (Button) view.findViewById(R.id.fbutton23);

        fbutton21.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ((MainActivity)getActivity()).switchFragment(1);
            }
        });
        fbutton23.setOnClickListener(new OnClickListener()
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
