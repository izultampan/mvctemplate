package com.abhimantrass.latihanmvc.view;

import android.os.Handler;

import com.abhimantrass.latihanmvc.controller.IController;

/**
 * Created by izul on 6/10/16.
 */
public interface IMvcTemplate {

    void setHandler(Handler handler);

    Handler getHandler();
}
