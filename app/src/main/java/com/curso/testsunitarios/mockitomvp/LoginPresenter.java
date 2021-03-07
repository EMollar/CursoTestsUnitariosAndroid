package com.curso.testsunitarios.mockitomvp;

public class LoginPresenter implements Login.Presenter{

    private Login.View view;
    private Login.Model model;

    public LoginPresenter(Login.View view){
        this.view = view;
        model = new LoginModel(this);
    }

    @Override
    public void validaUser(String user, String password) {
        if(view != null){
            model.validaUser(user,password);
        }
    }

    @Override
    public void usuarioValido() {
        if(view != null){
            view.usuarioValido();
        }
    }

    @Override
    public void error() {
        if(view != null){
            view.error();
        }
    }
}
