package com.keeboi.theplan.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kdeloria on 12/8/2014.
 */
public interface Viewable {

    View getView(int position, LayoutInflater inflater, View convertView, ViewGroup parent);

}
