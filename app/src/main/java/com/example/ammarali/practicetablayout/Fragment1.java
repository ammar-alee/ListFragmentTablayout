package com.example.ammarali.practicetablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Ammar.Ali on 10/30/16.
 */

public class Fragment1 extends Fragment {

    public Fragment1(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frag1, container, false);
        ArrayList<ListItem> listData = getListData();
        ListView listView = (ListView) rootView.findViewById(R.id.custom_list);
        listView.setAdapter(new CustomListAdapter(getActivity(), listData));
        return rootView;

    }
    private ArrayList<ListItem> getListData() {
        ArrayList<ListItem> listMockData = new ArrayList<ListItem>();
        String[] images = getResources().getStringArray(R.array.images_array);
        String[] heading = getResources().getStringArray(R.array.heading_array);

        for (int i = 0; i < images.length; i++) {
            ListItem listData = new ListItem();
            listData.setUrl(images[i]);
            listData.setHeading(heading[i]);
            listData.setRandomText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.");
            listMockData.add(listData);
        }
        return listMockData;
    }
}
