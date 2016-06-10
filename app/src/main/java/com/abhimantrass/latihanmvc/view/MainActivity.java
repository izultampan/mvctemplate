package com.abhimantrass.latihanmvc.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.abhimantrass.latihanmvc.R;
import com.abhimantrass.latihanmvc.controller.MainController;
import com.abhimantrass.latihanmvc.handler.MainHandler;
import com.abhimantrass.latihanmvc.utility.Constants;

/**
 * Created by izul on 6/10/16.
 */
public class MainActivity extends BaseActivity {

    private MainController controller;
    private TextView txtMainTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setHandler(new MainHandler(this));
        controller = new MainController(this, getHandler());

        txtMainTitle = (TextView) findViewById(R.id.main_title);

        String userName = getIntent().getStringExtra(Constants.BUNDLE_KEY.USER_NAME);
        String type = getIntent().getStringExtra(Constants.BUNDLE_KEY.USER_TYPE);
        controller.updateLayout(userName, type);
    }

    public TextView getTxtMainTitle() {
        return txtMainTitle;
    }
}
