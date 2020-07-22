package com.example.kengsophy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class categorieFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_categorie_fragment, container , false);


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<RecylerItem> recylerItems = new ArrayList<>();

        recylerItems.add(new RecylerItem(R.drawable.msi, "MSI Laptop" , "Gaming"));
        recylerItems.add(new RecylerItem(R.drawable.acer, "Accer Laptop" , "Notebook"));
        recylerItems.add(new RecylerItem(R.drawable.hp, "HP Laptop" , "Work Station"));


    }
}
