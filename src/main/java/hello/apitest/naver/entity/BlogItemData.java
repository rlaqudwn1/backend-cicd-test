//package hello.apitest.naver.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import lombok.Data;
//import org.jsoup.Jsoup;
//
//@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class BlogItemData {
//    @JsonProperty("title")
//    private String title;
//
//    @JsonProperty("link")
//    private String link;
//
//    @JsonProperty("description")
//    private String description;
//
//    @JsonProperty("bloggername")
//    private String bloggername;
//
//    @JsonProperty("bloggerlink")
//    private String bloggerlink;
//
//    @JsonProperty("postdate")
//    private String postdate; // 여기서 postdate는 String으로 정의됨
//
//
//    public void setTitle(String title) {
//        this.title = Jsoup.parse(title).text();
//    }
//
//    public void setLink(String link) {
//        this.link = Jsoup.parse(link).text();
//    }
//
//    public void setDescription(String description) {
//        this.description = Jsoup.parse(description).text();
//    }
//}
