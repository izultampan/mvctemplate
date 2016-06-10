package com.abhimantrass.latihanmvc.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.abhimantrass.latihanmvc.R;
import com.abhimantrass.latihanmvc.controller.LoginController;
import com.abhimantrass.latihanmvc.handler.LoginHandler;

/**
 * Created by izul on 6/10/16.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    private LoginController controller;
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setHandler(new LoginHandler(this));
        controller = new LoginController(this, getHandler());

        findViewById(R.id.btn_ok).setOnClickListener(this);
        findViewById(R.id.btn_cancel).setOnClickListener(this);

        userName = (EditText) findViewById(R.id.txt_username);
        password = (EditText) findViewById(R.id.txt_password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_ok:
                controller.executeLogin(userName.getText().toString(), password.getText().toString());
                break;
            case R.id.btn_cancel:
                controller.clearForm();
                break;
        }
    }

    public EditText getUserName() {
        return userName;
    }

    public EditText getPassword() {
        return password;
    }
}
