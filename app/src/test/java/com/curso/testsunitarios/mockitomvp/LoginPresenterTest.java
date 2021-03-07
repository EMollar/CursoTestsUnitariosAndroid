package com.curso.testsunitarios.mockitomvp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {

    //1.- Hacer Mock de Clases o Interfaces
    @Mock
    private Login.View view;

    @Mock
    private Login.Model model;

    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view);
    }

    @Test
    public void shouldShowErrorMessageWhenUserOrPasswordIsWrongTest() throws Exception {
        //2.- Nos permite programar un comportamiento
        when(view.getUserName()).thenReturn("maria");
        when(view.getPassword()).thenReturn("asdf");
        //3.- Ejecutamos un método
        presenter.validaUser(view.getUserName(), view.getPassword());
        //4.- Verificar que la vista ejecuta el método Error
        verify(view).error();
    }

    @Test
    public void shouldCallUsuarioValidoWhenUserAndPasswordAreRightTest() throws Exception {
        //2.- Nos permite programar un comportamiento
        when(view.getUserName()).thenReturn("alberto");
        when(view.getPassword()).thenReturn("1234");
        Assert.assertEquals("alberto", view.getUserName());
        //3.- Ejecutamos un método
        presenter.validaUser(view.getUserName(), view.getPassword());
        //4.- Verificar que la vista ejecuta el método Error
        verify(view).usuarioValido();
    }

    @Test
    public void shouldThrowingException() throws Exception {
        when(view.getUserName()).thenThrow(RuntimeException.class);
        try {
            view.getUserName();
        }catch (RuntimeException e){

        }

    }
}