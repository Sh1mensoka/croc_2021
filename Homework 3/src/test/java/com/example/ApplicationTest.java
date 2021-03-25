package com.example;

import com.example.transport.Bike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    @Test

    public void applicationTest() {
        Bike bike = new Bike (1, 2, 1, "Suzuki");
        Assertions.assertFalse(bike.isDamaged());
        Application.changeDamageStatus(bike);
        Assertions.assertTrue(bike.isDamaged());
        bike.setChainDamaged(true);
        Assertions.assertTrue(bike.isChainDamaged() && bike.isDamaged());
        bike.setChainDamaged(false);
        Assertions.assertFalse(bike.isChainDamaged());
        Assertions.assertFalse(bike.isDamaged());
    }
}
