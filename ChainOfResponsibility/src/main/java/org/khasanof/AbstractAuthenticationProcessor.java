package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 11/25/2023 12:35 PM
 */
public abstract class AbstractAuthenticationProcessor implements AuthenticationProcessor {

    protected final AuthenticationProcessor nextProcessor;

    protected AbstractAuthenticationProcessor(AuthenticationProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
