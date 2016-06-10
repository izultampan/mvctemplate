package com.abhimantrass.latihanmvc.handler;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;

import com.abhimantrass.latihanmvc.R;
import com.abhimantrass.latihanmvc.view.MainActivity;

/**
 * Created by izul on 6/10/16.
 */
public class MainHandler extends Handler {

    public static final int WHAT_UPDATE_LAYOUT = 0;

    private Activity activity;

    public MainHandler(Activity activity)
    {
        this.activity = activity;
    }

    private MainActivity getActivity()
    {
        return (MainActivity) activity;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what)
        {
            case WHAT_UPDATE_LAYOUT:
                String[] content = (String[]) msg.obj;
                updateLayout(content[0], content[1]);
                break;
        }
    }

    private void updateLayout(String userName, String type)
    {
        getActivity().getTxtMainTitle().setText(String.format(getActivity().getString(R.string.main_screen_title), userName, type));
    }
}
