package org.lognet.springboot.grpc.autoconfigure;

import org.lognet.springboot.grpc.GRpcServerRunner;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by alexf on 25-Jan-16.
 */
@Configuration
@EnableConfigurationProperties(GRpcServerProperties.class)
public class GRpcAutoConfiguration {
    @Bean
    @ConditionalOnBean(annotation = GRpcService.class)
    public GRpcServerRunner grpcServerRunner(){
        return new GRpcServerRunner();
    }
}
