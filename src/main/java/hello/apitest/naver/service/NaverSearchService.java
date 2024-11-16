//package hello.apitest.naver.service;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.module.SimpleModule;
//import hello.apitest.naver.entity.BlogItemDeserializer;
//import hello.apitest.naver.entity.BlogItems;
//import org.springframework.stereotype.Service;
//
//@Service
//
//public class NaverSearchService {
//    private final ObjectMapper objectMapper;
//
//    public NaverSearchService() {
//        SimpleModule module = new SimpleModule();
//        module.addDeserializer(BlogItems.class, new BlogItemDeserializer());
//
//        this.objectMapper = new ObjectMapper();
//        this.objectMapper.registerModule(module);
//    }
//
//    public BlogItems parsingJsonObject(String json) {
//        BlogItems items = null;
//        try {
//            items = objectMapper.readValue(json, BlogItems.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return items;
//    }
//}
//
