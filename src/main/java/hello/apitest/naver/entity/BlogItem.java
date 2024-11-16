//package hello.apitest.naver.entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import jakarta.persistence.*;
//import lombok.Data;
//import org.jsoup.Jsoup;
//
//@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity
//@Table(name = "BlogItem")
//public class BlogItem {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    private String title;
//
//    private String link;
//
//    private String description;
//
//    private String bloggername;
//
//    private String bloggerlink;
//
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
