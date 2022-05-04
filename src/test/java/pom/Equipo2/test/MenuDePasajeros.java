package pom.Equipo2.test;

import org.junit.Test;
import pom.Equipo2.Base.JUnitBaseTest;
import pom.Equipo2.Pages.Home;
import pom.Equipo2.Pages.Vuelos;

public class MenuDePasajeros extends JUnitBaseTest {
       Home falabellaHome;
       Vuelos vuelos;
       @Test
    public void menuDePasajeros(){

           falabellaHome = new Home(driver);
           vuelos = new Vuelos(driver);
           falabellaHome.irAHome();
           falabellaHome.irAVuelos();
           vuelos.mensajeCookies();
           vuelos.seleccionarCheckboxSoloIda();
           vuelos.escribirOrigen();
           vuelos.esperarresultado();
           vuelos.escribirDestino();
           vuelos.esperarresultado();
           vuelos.seleccionarSinFecha();
           vuelos.seleccionarBuscar();



       }
}
