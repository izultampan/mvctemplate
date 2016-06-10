package com.abhimantrass.latihanmvc.controller;

import android.app.Activity;
import android.os.Handler;

import com.abhimantrass.latihanmvc.handler.SplashHandler;
import com.abhimantrass.latihanmvc.utility.Constants;
import com.abhimantrass.latihanmvc.view.SplashActivity;

/**
 * Created by izul on 6/10/16.
 */
public class SplashController implements IController {

    private Activity activity;
    private Handler handler;

    public SplashController(Activity activity, Handler handler)
    {
        this.activity = activity;
        this.handler = handler;
    }

    private SplashActivity getActivity()
    {
        return (SplashActivity) activity;
    }

    private Handler getHandler() {
        return handler;
    }

    public void init()
    {
        handler.sendEmptyMessageDelayed(SplashHandler.WHAT_OPEN_LOGIN_SCREEN, Constants.SPLASH_SCREEN_DELAY);
    }
}
