package com.example.android.newsstories;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Greta Grigutė on 2018-05-10.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    //Context of the app
    //private Context mContext;
   // private Bundle mBundle;
    private Fragment fragment;
    private Bundle bundle;
    private int positionInMenu;


    //@param fm is the fragment manager that will keep each fragment's state in the adapter
    //across swipes.
    //@param context is the context of the app.

    public CategoryAdapter(Context context, FragmentManager fm, Integer position) {
        super(fm);
       // mContext = context;
      positionInMenu = position;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                  bundle = new Bundle();
                  bundle.putInt(Constants.POSITION, 0);
                  bundle.putString(Constants.URL_KEY,"");

                fragment = new NewsFragment();
               fragment.setArguments(bundle);
                return fragment;

            // Supply a default return statement
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 1;
    }
}
