package com.abhimantrass.latihanmvc.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

import com.abhimantrass.latihanmvc.handler.LoginHandler;
import com.abhimantrass.latihanmvc.model.User;
import com.abhimantrass.latihanmvc.utility.Constants;
import com.abhimantrass.latihanmvc.view.LoginActivity;
import com.abhimantrass.latihanmvc.view.MainActivity;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by izul on 6/10/16.
 */
public class LoginController implements IController {

    private Activity activity;
    private Handler handler;

    private ArrayList<User> userList;

    public LoginController(Activity activity, Handler handler)
    {
        this.activity = activity;
        this.handler = handler;

        userList = new ArrayList<>(3);
        userList.add(0, new User("user", "user", "user"));
        userList.add(1, new User("admin", "admin", "admin"));
        userList.add(2, new User("super_admin", "super_admin", "super_admin"));
    }

    private LoginActivity getActivity()
    {
        return (LoginActivity) activity;
    }

    public void executeLogin(String userName, String password)
    {
        for (User s : userList)
        {
            if (userName.equalsIgnoreCase(s.getUserName()) && password.equalsIgnoreCase(s.getUserPassword()))
            {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra(Constants.BUNDLE_KEY.USER_NAME, s.getUserName());
                intent.putExtra(Constants.BUNDLE_KEY.USER_TYPE, s.getUserType());
                getActivity().startActivity(intent);
                getActivity().finish();
                return;
            }
        }

        handler.sendEmptyMessage(LoginHandler.WHAT_WRONG_USERNAME_OR_PASSWORD);
    }

    public void clearForm()
    {
        handler.sendEmptyMessage(LoginHandler.WHAT_CLEAR_FORM);
    }
}
