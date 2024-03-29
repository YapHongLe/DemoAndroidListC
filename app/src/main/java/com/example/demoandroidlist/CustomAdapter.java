package com.example.demoandroidlist;

import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        versionList = objects;




        }
        @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View rowView = inflater.inflate(layout_id, parent, false);

            TextView tvName = rowView.findViewById(R.id.textViewName);
            TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

            AndroidVersion currentVersion = versionList.get(position);

            tvName.setText(currentVersion.getName());
            tvVersion.setText(currentVersion.getVersion());

            return rowView;
        }
}
