import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16633_34;
        boolean registered = true;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_700_00;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 49_900_00;
        boolean registered = false;
        long expected = 499;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndOverBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_100_00;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverBonusLimitAndEqualAmountLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 9_223_372_036_854_775_807L;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndOverBonusLimitAndEqualAmountLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 9_223_372_036_854_775_807L;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverBonusLimitAndUnderAmountLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 9_223_372_036_854_775_806L;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndOverBonusLimitAndUnderAmountLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 9_223_372_036_854_775_806L;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndAmountEqualBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_666_67;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndAmountEqualBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_000_00;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndEqualBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 16_666_67;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndEqualBonusLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 50_000_00;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndUnderLimitAndAmountEqual0() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimitAndAmountEqual0() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndUnderLimitAndAmountEqual1() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimitAndAmountEqual1() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndUnderLimitAndAmountEIsMinus() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = -33_34;
        boolean registered = true;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimitAndAmountIsMinus() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = -100_00;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}