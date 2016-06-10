package com.abhimantrass.latihanmvc.view;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.abhimantrass.latihanmvc.controller.IController;

/**
 * Created by izul on 6/10/16.
 */
public class BaseActivity extends AppCompatActivity implements IMvcTemplate {

    private IController controller;
    private Handler handler;

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public Handler getHandler() {
        return handler;
    }
}
