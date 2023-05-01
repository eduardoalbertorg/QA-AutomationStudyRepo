import com.qaminds.Pasajero;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TipoPasajeroEnum;

public class PasajeroTest {
    @Test
    public void nombrePasajeroTest() {
        String nombreEsperado = "Pablo Aguilar";
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.VIP;

        Pasajero pabloAguilar = new Pasajero();
        pabloAguilar.setPasajeroNombre(nombreEsperado);
        pabloAguilar.setTipoPasajero(tipoPasajeroEsperado);

        String nombreActual = pabloAguilar.getPasajeroNombre();
        TipoPasajeroEnum tipoPasajeroActual = pabloAguilar.getTipoPasajero();

        Assert.assertEquals(nombreActual, nombreEsperado);
        Assert.assertEquals(tipoPasajeroActual, tipoPasajeroEsperado);
    }

    @Test
    public void tipoPasajeroNoEsVIP() {
        String nombreEsperado = "Pablo Aguilar";
        TipoPasajeroEnum tipoPasajeroNoEsperado = TipoPasajeroEnum.VIP;

        Pasajero esterGonzalez = new Pasajero();
        esterGonzalez.setTipoPasajero(TipoPasajeroEnum.STANDARD);

        TipoPasajeroEnum tipoPasajeroActual = esterGonzalez.getTipoPasajero();

        Assert.assertEquals(tipoPasajeroActual, tipoPasajeroNoEsperado);
    }
}
