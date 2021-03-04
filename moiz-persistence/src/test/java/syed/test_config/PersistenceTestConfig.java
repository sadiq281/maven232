package syed.test_config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class. Add Spring Beans here.
 */
@Configuration
@ComponentScan({"syed.persistence",})
public class PersistenceTestConfig {

    // Add your Spring Beans here...
}