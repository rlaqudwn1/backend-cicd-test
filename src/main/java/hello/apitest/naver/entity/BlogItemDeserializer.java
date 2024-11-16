//package hello.apitest.naver.entity;
//
//import com.fasterxml.jackson.core.JacksonException;
//import com.fasterxml.jackson.core.JsonParser;
//import com.fasterxml.jackson.databind.DeserializationContext;
//import com.fasterxml.jackson.databind.JsonDeserializer;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class BlogItemDeserializer extends JsonDeserializer<BlogItems> {
//    private final ObjectMapper objectMapper;
//    public BlogItemDeserializer() {
//        this.objectMapper = new ObjectMapper();
//    }
//    @Override
//    public BlogItems deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
//        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
//        JsonNode itemNode = node.findValue("items");
//
//        List<BlogItemData> items = Arrays.stream(objectMapper.treeToValue(itemNode, BlogItemData[].class)).toList();
//        return new BlogItems(items);
//    }
//}
