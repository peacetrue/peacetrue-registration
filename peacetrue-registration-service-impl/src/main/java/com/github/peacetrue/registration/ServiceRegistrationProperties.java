package com.github.peacetrue.registration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiayx
 */
@Data
@ConfigurationProperties(prefix = "peacetrue.registration")
public class ServiceRegistrationProperties {

}
