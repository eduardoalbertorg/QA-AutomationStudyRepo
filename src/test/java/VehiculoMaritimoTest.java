import com.qaminds.VehiculoMaritimo;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Combustible;

public class VehiculoMaritimoTest {
    @Test
    public void tipoCombustibleIsGasoilTest() {
        VehiculoMaritimo vehiculoMaritimo = new VehiculoMaritimo(Combustible.GASOIL);
        Assert.assertEquals(vehiculoMaritimo.getFuel(), Combustible.GASOIL);
    }

    @Test
    public void tipoCombustibleIsNotGasoilTest() {
        VehiculoMaritimo vehiculoMaritimo = new VehiculoMaritimo(Combustible.GASOIL);
        Assert.assertNotEquals(vehiculoMaritimo.getFuel(), Combustible.JET_FUEL);
    }

    @Test
    public void vehiculoTurnsOnTest() {
        VehiculoMaritimo vehiculoMaritimo = new VehiculoMaritimo(Combustible.GASOIL);
        Assert.assertTrue(vehiculoMaritimo.startVehicle());
    }
}
