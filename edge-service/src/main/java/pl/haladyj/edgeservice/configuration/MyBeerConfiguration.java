package pl.haladyj.edgeservice.configuration;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBeerConfiguration {

    @Bean
    public OkHttpClient client(){
        return new OkHttpClient();
    }
}
