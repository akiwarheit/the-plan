package com.keeboi.theplan.base;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kdeloria on 12/8/2014.
 */
public abstract class ViewModel<K> extends Holder<K> implements Viewable {

    public ViewModel(K model) {
        this.setObject(model);
    }

    private View view;

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    /**
     * Do what you want with the view here. Setting the text of a TextView within this View etc.
     *
     * @param view the inflated view
     */
    public abstract void handleView(View view);

    public abstract int getLayoutID();

    @Override
    public View getView(int position, LayoutInflater inflater, View convertView, ViewGroup parent) {
        View view = null;
        if (convertView == null) {
            view = inflater.inflate(getLayoutID(), null, false);
        } else {
            view = convertView;
        }

        handleView(view);

        return view;
    }
}
