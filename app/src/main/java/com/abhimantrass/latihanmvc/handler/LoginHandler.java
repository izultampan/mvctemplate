package com.abhimantrass.latihanmvc.handler;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import com.abhimantrass.latihanmvc.R;
import com.abhimantrass.latihanmvc.view.LoginActivity;

/**
 * Created by izul on 6/10/16.
 */
public class LoginHandler extends Handler {

    public static final int WHAT_CLEAR_FORM = 0;
    public static final int WHAT_WRONG_USERNAME_OR_PASSWORD = 1;
    private Activity activity;

    public LoginHandler(Activity activity)
    {
        this.activity = activity;
    }

    private LoginActivity getActivity()
    {
        return (LoginActivity) activity;
    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);

        switch (msg.what)
        {
            case WHAT_CLEAR_FORM:
                clearForm();
                break;
            case WHAT_WRONG_USERNAME_OR_PASSWORD:
                showErrorToast();
                break;
        }
    }

    private void clearForm()
    {
        getActivity().getUserName().setText("");
        getActivity().getPassword().setText("");
    }

    private void showErrorToast()
    {
        Toast.makeText(getActivity(), getActivity().getString(R.string.error_username_password_wrong), Toast.LENGTH_LONG).show();
    }
}
