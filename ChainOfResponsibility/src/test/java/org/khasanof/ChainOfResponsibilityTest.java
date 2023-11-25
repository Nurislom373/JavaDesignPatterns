package org.khasanof;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 11/25/2023 12:44 PM
 */
public class ChainOfResponsibilityTest {

    private static AuthenticationProcessor getChainOfAuthProcessor() {
        AuthenticationProcessor oAuthProcessor = new UsernamePasswordProcessor(null);
        return new OAuthTokenProcessor(oAuthProcessor);
    }

    private static AuthenticationProcessor getSingleProcessor() {
        return new OAuthTokenProcessor(null);
    }

    @Test
    void firstTest() {
        AuthenticationProcessor processor = getSingleProcessor();
        assertAll(() -> assertThrows(RuntimeException.class, () -> processor.isAuthorized(new UsernamePasswordProvider())));
    }

    @Test
    void secondTest() {
        AuthenticationProcessor processor = getChainOfAuthProcessor();
        processor.isAuthorized(new UsernamePasswordProvider());
        assertAll(() -> assertEquals(ProcessorCounter.getCount(), 1));
    }

}
