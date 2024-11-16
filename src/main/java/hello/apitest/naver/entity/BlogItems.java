//package hello.apitest.naver.entity;
//
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class BlogItems {
//
//    @JsonProperty("lastBuildDate")
//    private String lastBuildDate;
//
//    @JsonProperty("total")
//    private int total;
//
//    @JsonProperty("start")
//    private int start;
//
//    @JsonProperty("display")
//    private int display;
//
//    @JsonProperty("items")
//    private List<BlogItemData> blogItemData;
//    @JsonCreator
//    public BlogItems(List<BlogItemData> blogItemData) {
//        this.blogItemData = blogItemData;
//    }
//}
