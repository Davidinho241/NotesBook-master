package com.letsrealize.develop.foodandcocktail;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Created by LENOVO on 24/05/2017.
 */

public class Produit extends Fragment{

    private ListView listeP;
    ArrayList<String> array_listR = new ArrayList<String>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.produits, container, false);

        // traitement des reponses
        ArrayAdapter arrayAdapter1=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1, array_listR);
        listeP = (ListView)rootView.findViewById(R.id.listeProduit);
        listeP.setAdapter(arrayAdapter1);

        return rootView;
    }
}
