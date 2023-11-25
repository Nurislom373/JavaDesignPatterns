package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 11/25/2023 12:41 PM
 */
public class UsernamePasswordProcessor extends AbstractAuthenticationProcessor {

    protected UsernamePasswordProcessor(AuthenticationProcessor nextProcessor) {
        super(nextProcessor);
    }

    @Override
    public void isAuthorized(AuthenticationProvider authenticationProvider) {
        if (authenticationProvider instanceof UsernamePasswordProvider) {
            System.out.println("Write your logic!"); // write your logic!
        } else if (nextProcessor != null) {
            ProcessorCounter.countDown();
            nextProcessor.isAuthorized(authenticationProvider);
        } else {
            System.out.println("NextProcessor is null!");
            throw new RuntimeException("AuthenticationProvider Unknown!");
        }
    }

}
