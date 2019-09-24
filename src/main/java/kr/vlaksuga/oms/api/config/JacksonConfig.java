package kr.vlaksuga.oms.api.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import kr.vlaksuga.oms.api.CMap;
import kr.vlaksuga.oms.api.CResult;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper jsonObjectMapper() {

        SimpleModule m = new SimpleModule();
        m.addSerializer(CMap.class,new CMapSerializer());
        m.addSerializer(CResult.class,new CResultSerializer());



        return Jackson2ObjectMapperBuilder.json()
                .modules(m)
                .build();
    }
}