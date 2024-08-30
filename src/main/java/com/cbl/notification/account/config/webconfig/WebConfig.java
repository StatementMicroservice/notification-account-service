package com.cbl.notification.account.config.webconfig;

import com.cbl.notification.account.config.appconfig.AppConfigProperty;
import com.cbl.notification.account.config.profileconfig.ConditionalOnProfile;
import com.cbl.notification.account.enums.EnvironmentProfile;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@ConditionalOnProfile(EnvironmentProfile.DEV)
@Configuration
@RequiredArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private final AppConfigProperty appConfigProperty;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:" + appConfigProperty.getServerPort())
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
