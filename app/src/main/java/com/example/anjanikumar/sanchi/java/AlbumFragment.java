package com.example.anjanikumar.sanchi.java;


import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.anjanikumar.sanchi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlbumFragment extends Fragment {

    private RecyclerView recyclerView;
    private AlbumAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private int[] images = {R.drawable.gal1, R.drawable.gal2,R.drawable.gal3,R.drawable.gal4,R.drawable.gal5,
            R.drawable.gal6,R.drawable.gal7,R.drawable.gal8,R.drawable.gal9,R.drawable.gal10,R.drawable.gal11,
            R.drawable.gal12,R.drawable.gal13};

    public AlbumFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_album, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
        layoutManager = new GridLayoutManager(getContext(),2);
        adapter = new AlbumAdapter(images,getContext());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

}
