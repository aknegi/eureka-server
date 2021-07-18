package ecommerceclient.eurekaclient.Config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator myRouter(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes()
                .route(p -> p.path("/oauth")
                        .filters(f -> f.circuitBreaker(c -> c.setName("circuitBreaker").setFallbackUri("/e-commerce-application")))
                        .uri("lb://OAUTH-SERVICE"))
                .route(p -> p.path("/admin/**")
                        .filters(f -> f.circuitBreaker(c -> c.setName("circuitBreaker").setFallbackUri("/e-commerce-application")))
                        .uri("lb://ADMIN-SERVICE"))
                .route(p -> p.path("/customer/**")
                        .filters(f -> f.circuitBreaker(c -> c.setName("circuitBreaker").setFallbackUri("/e-commerce-application")))
                        .uri("lb://CUSTOMER-APPLICATION"))
                .route(p -> p.path("/seller/**")
                        .filters(f -> f.circuitBreaker(c -> c.setName("circuitBreaker").setFallbackUri("/e-commerce-application")))
                        .uri("lb://SELLER-SERVICE"))
                .route(p -> p.path("/register/**")
                        .filters(f -> f.circuitBreaker(c -> c.setName("circuitBreaker").setFallbackUri("/e-commerce-application")))
                        .uri("lb://REGISTRATION-SERVICE"))
                .route(p -> p.path("/doLogout")
                        .filters(f -> f.circuitBreaker(c -> c.setName("circuitBreaker").setFallbackUri("/e-commerce-application")))
                        .uri("lb://OAUTH-SERVICE"))
                .build();
    }

    @Bean
    public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
        return factory -> factory
                .configureDefault(id -> new Resilience4JConfigBuilder(id)
                        .circuitBreakerConfig(CircuitBreakerConfig.ofDefaults())
                        .timeLimiterConfig(TimeLimiterConfig.custom()
                                .timeoutDuration(Duration.ofSeconds(10)).build()).build());
    }
}
