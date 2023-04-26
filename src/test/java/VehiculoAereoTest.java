import com.qaminds.CuatroRuedas;
import com.qaminds.VehiculoAereo;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Combustible;

public class VehiculoAereoTest {
    @Test
    public void tipoCombustibleIsJetFuelTest() {
        VehiculoAereo vehiculoAereo = new VehiculoAereo(Combustible.JET_FUEL);
        Assert.assertEquals(vehiculoAereo.getFuel(), Combustible.JET_FUEL);
    }

    @Test
    public void tipoCombustibleIsNotJetFuelTest() {
        VehiculoAereo vehiculoAereo = new VehiculoAereo(Combustible.GASOIL);
        Assert.assertNotEquals(vehiculoAereo.getFuel(), Combustible.JET_FUEL);
    }

    @Test
    public void vehiculoTurnsOnTest() {
        VehiculoAereo vehiculoAereo = new VehiculoAereo(Combustible.JET_FUEL);
        Assert.assertTrue(vehiculoAereo.startVehicle());
    }
}
