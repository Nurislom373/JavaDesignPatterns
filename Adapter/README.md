# Adapter

Adapter Design Pattern 2ta bir biriga mos kelmaydigan interfacelar o'rtasida ulagich vazfasini bajaradi. 

![img](static/images/img.png)

# Usage Examples

* `java.util.Arrays#asList()`
* `jav.util.Collections#list()`

# Computer World Example

```java
public class ReactiveJwtAuthenticationConverterAdapter implements Converter<Jwt, Mono<AbstractAuthenticationToken>> {
    private final Converter<Jwt, AbstractAuthenticationToken> delegate;

    public ReactiveJwtAuthenticationConverterAdapter(Converter<Jwt, AbstractAuthenticationToken> delegate) {
        Assert.notNull(delegate, "delegate cannot be null");
        this.delegate = delegate;
    }

    public final Mono<AbstractAuthenticationToken> convert(Jwt jwt) {
        return Mono.just(jwt).map(this.delegate::convert);
    }
}

// ...

public class SecurityConfiguration {

    @Bean
    public Converter<Jwt, Mono<AbstractAuthenticationToken>> jwtAuthenticationConverter() {
        JwtAuthenticationConverter authenticationConverter = new JwtAuthenticationConverter();
        authenticationConverter.setJwtGrantedAuthoritiesConverter(new JwtGrantedAuthorityConverter());
        return new ReactiveJwtAuthenticationConverterAdapter(authenticationConverter);
    }

}    
```
