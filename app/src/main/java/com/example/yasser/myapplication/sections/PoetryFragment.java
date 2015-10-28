package com.example.yasser.myapplication.sections;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yasser.myapplication.R;
import com.example.yasser.myapplication.adapters.PoetryListAdapter;

/**
 * Created by yasser on 10/27/15.
 */
public class PoetryFragment extends Fragment implements AdapterView.OnItemClickListener{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.poetry_fragment, container,false);

        ListView poetryListView = (ListView) view.findViewById(R.id.poetry_list_view);

        poetryListView.setAdapter(new PoetryListAdapter(getActivity()));
        poetryListView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("Sup", "Thats a click");
    }
}
