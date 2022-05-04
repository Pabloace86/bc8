package pom.Equipo2.test;

import org.junit.Test;
import pom.Equipo2.Base.JUnitBaseTest;
import pom.Equipo2.Pages.Home;
import pom.Equipo2.Pages.Paquetes;


public class AlojamientoEnOtraCiudad extends JUnitBaseTest {

    Home falabellaHome;
    Paquetes paquetes;
    @Test
    public void alojamiento(){

        falabellaHome = new Home(driver);
        paquetes= new Paquetes(driver);
        falabellaHome.irAHome();
        falabellaHome.irAPaquetes();
        paquetes.mensajeCookies();
        paquetes.seleccionarVueloMasAlojamiento();
        paquetes.escribirOrigen();
        paquetes.esperarresultado();
        paquetes.escribirDestino();
        paquetes.esperarresultado();
        paquetes.seleccionarIda();
        paquetes.seleccionarFechaVuelta();
        paquetes.seleccionarOpcionesAvanzadas();
        paquetes.seleccionarAlojamientoOtraCiudad();
        paquetes.seleccionarDestino2();
        paquetes.esperarresultado();
        paquetes.seleccionarBuscar();



    }
}
