package com.curso.testsunitarios.mockitomvp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.curso.testsunitarios.R;

public class LoginActivity extends AppCompatActivity implements Login.View{

    private EditText etUser;
    private EditText etPassword;
    private Button btLogin;
    private Login.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUser = findViewById(R.id.etUser);
        etPassword = findViewById(R.id.etPassword);
        btLogin = findViewById(R.id.btLogin);
        presenter = new LoginPresenter(this);
    }

    @Override
    public void usuarioValido() {
//        startActivity(new Intent(LoginActivity.this, FinalActivity.class));
    }

    @Override
    public void error() {
        Log.d("TAG1", "Usuario no es válido");
    }

    @Override
    public String getUserName() {
        return etUser.getText().toString();
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }
}