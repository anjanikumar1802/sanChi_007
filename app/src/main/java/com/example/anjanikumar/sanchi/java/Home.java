package com.example.anjanikumar.sanchi.java;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import com.example.anjanikumar.sanchi.R;

public class Home extends AppCompatActivity {

    public RecyclerView recyclerView;
    private BottomNavigationView bNView;
    private FrameLayout fLayout;
    private HomeFragment homeFragment;
    private AlbumFragment albumFragment;
    private AlbumAdapter adapter;
    private MapsFragment mapsFragment;


    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bNView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        fLayout = (FrameLayout) findViewById(R.id.main_nav);

//        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//        layoutManager = new GridLayoutManager(this,2);
//        adapter = new AlbumAdapter(images,this);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(adapter);


        homeFragment = new HomeFragment();
        mapsFragment = new MapsFragment();
        albumFragment = new AlbumFragment();

        setFragment(homeFragment);

        bNView.setOnNavigationItemSelectedListener
                (new BottomNavigationView
                         .OnNavigationItemSelectedListener() {
                     @Override
                     public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                         switch (item.getItemId()) {
                             case R.id.home:
                                 setFragment(homeFragment);
                                 return true;
                             case R.id.gal:
                                 setFragment(albumFragment);
                                 return true;
                             case R.id.map:
                                 setFragment(mapsFragment);
                                 return true;
                             default:
                                 return false;
                         }
                     }
                 }
                );

    }


    private void setFragment(android.support.v4.app.Fragment fragment) {
        android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.main_nav, fragment);
        ft.commit();
    }
}

