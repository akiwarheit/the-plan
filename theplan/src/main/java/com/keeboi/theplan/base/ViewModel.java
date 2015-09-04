package com.keeboi.theplan.base;

import android.view.View;

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

}
