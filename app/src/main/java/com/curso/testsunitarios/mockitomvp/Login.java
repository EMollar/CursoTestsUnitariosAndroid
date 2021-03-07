package com.curso.testsunitarios.mockitomvp;

public interface Login {

    interface View {
        void usuarioValido();
        void error();
        String getUserName();
        String getPassword();
    }

    interface Presenter{
        void validaUser(String user, String password);
        void usuarioValido();
        void error();
    }

    interface Model{
        void validaUser(String user, String password);
    }
}
