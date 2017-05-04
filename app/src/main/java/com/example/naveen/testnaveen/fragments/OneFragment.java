package com.example.naveen.testnaveen.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.naveen.testnaveen.R;
import com.example.naveen.testnaveen.adapter.ElemetsAdapter;
import com.example.naveen.testnaveen.helpers.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {
    private List<Elements> elementlist = new ArrayList<>();
    private RecyclerView recyclerView;
    private ElemetsAdapter mAdapter;
    Context context;
    public OneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        mAdapter = new ElemetsAdapter(getActivity(),elementlist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareElementData();



        return view;
    }

    private void prepareElementData() {

        elementlist.clear();

        Elements data1 = new Elements("EMPTINESS FT.JUSTIN TIBLEKAR", "18 HOURS AGO", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.",R.drawable.girl);
        elementlist.add(data1);
        Elements data2 = new Elements("I'M FALLING LOVE WITH YOU", "20 HOURS AGO", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.",R.drawable.boy);
        elementlist.add(data2);
        Elements data3 = new Elements("BABY FT.JUSTIN BABER", "22 HOURS AGO", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.",R.drawable.girl2);
        elementlist.add(data3);
        Elements data4 = new Elements("WHITE HORSE FT.TAYLOR SWIFT", "18 HOURS AGO", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.",R.drawable.girl);
        elementlist.add(data4);
        Elements data5 = new Elements("Mad Max: Fury Road", "18 HOURS AGO", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters.",R.drawable.boy);
        elementlist.add(data5);

        mAdapter.notifyDataSetChanged();


    }

}
