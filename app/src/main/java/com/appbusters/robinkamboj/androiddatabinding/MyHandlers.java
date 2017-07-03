package com.appbusters.robinkamboj.androiddatabinding;

import android.view.View;
import android.widget.TextView;

public class MyHandlers {

    public void onClickFriend(View v){
        ((TextView) v).setText(R.string.touched);
    }
}
