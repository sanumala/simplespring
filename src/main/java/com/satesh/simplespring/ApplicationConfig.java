package com.satesh.simplespring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.satesh.simplespring"})
public class ApplicationConfig {
//Spring framework will know what to do with this class
}
