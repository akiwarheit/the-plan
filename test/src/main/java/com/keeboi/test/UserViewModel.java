package com.keeboi.test;

import android.view.View;
import android.widget.TextView;

import com.keeboi.theplan.base.ViewModel;

/**
 * Created by kdeloria on 9/18/2015.
 */
public class UserViewModel extends ViewModel<User> {

    public UserViewModel(User model) {
        super(model);
    }

    @Override
    public void handleView(View view) {
        ((TextView) view.findViewById(R.id.name)).setText(getObject().getName());
        ((TextView) view.findViewById(R.id.occupation)).setText(getObject().getOccupation());
    }

    @Override
    public int getLayoutID() {
        return R.layout.user_row_layout;
    }
}
