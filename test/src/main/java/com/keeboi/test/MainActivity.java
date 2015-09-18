package com.keeboi.test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.keeboi.theplan.adapter.ViewableListAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    // The list displaying all the user object
    ListView userListView;

    // Our List adapter
    ViewableListAdapter<UserViewModel> viewableListAdapter;

    // Our list data
    List<UserViewModel> userViewModelList = new ArrayList<UserViewModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userListView = (ListView) findViewById(R.id.user_list);
        viewableListAdapter = new ViewableListAdapter<UserViewModel>(this, userViewModelList);
        userListView.setAdapter(viewableListAdapter);

        User user = new User();
        user.setName("Kevin Jude Deloria");
        user.setOccupation("Programmer / Blogger");

        userViewModelList.add(new UserViewModel(user));
        viewableListAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
