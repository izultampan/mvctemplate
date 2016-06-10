package com.abhimantrass.latihanmvc.view;

import android.os.Bundle;

import com.abhimantrass.latihanmvc.R;
import com.abhimantrass.latihanmvc.controller.SplashController;
import com.abhimantrass.latihanmvc.handler.SplashHandler;

public class SplashActivity extends BaseActivity {

    private SplashController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setHandler(new SplashHandler(this));
        controller = new SplashController(this, getHandler());
        controller.init();
    }

}
