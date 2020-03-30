package br.com.devmedia.exemplos.junit;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ColecionadorTest {

    @Test
    public void testCarroComAnoDeLancamentoMaisAntigo() {
        Colecionador devmedia = new Colecionador("DevMedia");

        Carro carro1 = new Carro("Mustang", "Ford", 1993, LocalDate.now());
        Carro carro2 = new Carro("Enzo", "Ferrari", 2002, LocalDate.now());
        Carro carro3 = new Carro("Urus", "Lamborghini", 2020, LocalDate.now());

        devmedia.getColecao().add(carro1);
        devmedia.getColecao().add(carro2);
        devmedia.getColecao().add(carro3);

        Assert.assertEquals(1993, devmedia.obterAnoDoCarroMaisAntigo());
       // System.out.println("Parabéns Passou no teste");
    }

}
