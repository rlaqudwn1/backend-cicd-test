//package hello.apitest.naver.config;
//
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import hello.apitest.naver.entity.BlogItemDeserializer;
//import hello.apitest.naver.entity.BlogItems;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JacksonConfig {
//
//    @Bean
//    public ObjectMapper objectMapper() {
//        SimpleModule module = new SimpleModule();
//        module.addDeserializer(BlogItems.class, new BlogItemDeserializer());
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.registerModule(module);
//        return objectMapper;
//    }
//}
