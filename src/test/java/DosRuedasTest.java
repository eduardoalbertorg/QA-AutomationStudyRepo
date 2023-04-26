import com.qaminds.DosRuedas;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Combustible;

public class DosRuedasTest {
    @Test
    public void encenderDosRuedasTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        boolean isTurnedOn = dosRuedas.startVehicle();
        Assert.assertTrue(isTurnedOn);
    }

    @Test
    public void tipoCombustibleGasolinaTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        Assert.assertEquals(dosRuedas.getFuel(), Combustible.GASOLINA);
    }

    @Test
    public void tipoCombustibleNotJetFuelTest() {
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA);
        Assert.assertNotEquals(dosRuedas.getFuel(), Combustible.JET_FUEL);
    }
}
