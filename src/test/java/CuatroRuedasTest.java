import com.qaminds.CuatroRuedas;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Combustible;

public class CuatroRuedasTest {
    @Test
    public void tipoCombustibleIsGasoilTest() {
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOIL);
        Assert.assertEquals(cuatroRuedas.getFuel(), Combustible.GASOIL);
    }

    @Test
    public void tipoCombustibleIsNotGasoilTest() {
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.JET_FUEL);
        Assert.assertNotEquals(cuatroRuedas.getFuel(), Combustible.GASOIL);
    }

    @Test
    public void vehiculoTurnsOnTest() {
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA);
        Assert.assertTrue(cuatroRuedas.startVehicle());
    }


}
