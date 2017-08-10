package org.activiti.configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.activiti.services.events.ProcessEngineChannels;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@EnableBinding(ProcessEngineChannels.class)
@ComponentScan("org.activiti")
@EnableDiscoveryClient
@Import(RuntimeBundleMetaDataConfiguration.class)
public @interface ActivitiRuntimeBundle {

}