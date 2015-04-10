package app.turestaurante.restaurante.com.turestaurante.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.turestaurante.restaurante.com.turestaurante.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bebidas extends android.support.v4.app.Fragment{


    public Bebidas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bebidas, container, false);
    }


}
