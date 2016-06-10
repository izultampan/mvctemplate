package com.abhimantrass.latihanmvc.controller;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import com.abhimantrass.latihanmvc.handler.MainHandler;
import com.abhimantrass.latihanmvc.view.MainActivity;

/**
 * Created by izul on 6/10/16.
 */
public class MainController implements IController {

    private Activity activity;
    private Handler handler;

    public MainController(Activity activity, Handler handler) {
        this.activity = activity;
        this.handler = handler;
    }

    private MainActivity getActivity()
    {
        return (MainActivity) activity;
    }

    public void updateLayout(String userName, String type)
    {
        Message msg = Message.obtain();
        msg.what = MainHandler.WHAT_UPDATE_LAYOUT;
        msg.obj = new String[] {userName, type};

        handler.sendMessage(msg);
    }
}
