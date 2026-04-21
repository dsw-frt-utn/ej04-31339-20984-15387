package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.MenuPrincipal;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        
    }
}
/*
package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.AltaVehiculo;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        AltaVehiculo view = new AltaVehiculo(null);
        view.setVisible(true);
    }
}
*/