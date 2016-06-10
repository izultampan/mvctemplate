package com.abhimantrass.latihanmvc.handler;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

import com.abhimantrass.latihanmvc.view.LoginActivity;
import com.abhimantrass.latihanmvc.view.SplashActivity;

/**
 * Created by izul on 6/10/16.
 */
public class SplashHandler extends Handler {

    public static final int WHAT_OPEN_LOGIN_SCREEN = 0;

    private Activity activity;

    public SplashHandler(Activity activity)
    {
        this.activity = activity;
    }

    private SplashActivity getActivity()
    {
        return (SplashActivity) activity;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what)
        {
            case WHAT_OPEN_LOGIN_SCREEN:
                Intent intent = new Intent(getActivity(), LoginActivity.class);
                getActivity().startActivity(intent);
                getActivity().finish();
                break;
        }
    }


}
