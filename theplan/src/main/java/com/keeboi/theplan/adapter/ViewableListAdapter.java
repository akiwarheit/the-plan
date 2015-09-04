package com.keeboi.theplan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.keeboi.theplan.base.ViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kdeloria on 12/9/2014.
 */
public class ViewableListAdapter<K extends ViewModel> extends ArrayAdapter<K> {

    private LayoutInflater mInflater;

    public ViewableListAdapter(Context context, List<K> objects) {
        super(context, 0, objects);
        this.mInflater = LayoutInflater.from(context);
    }

    public ViewableListAdapter(Context context) {
        super(context, 0, new ArrayList<K>());
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getItem(position).getView(position, mInflater, convertView, parent);
    }

}
