package com.project.twitterlike.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_poost")
public class Poost {
    @Id
    private String id;
    private String publisher;
    private String tags;
    private String body;
    private String pic;
    private String time;

    public Poost() {}

    public Poost(String id, String publisher, String tags, String body, String pic, String time) {
        this.id = id;
        this.publisher = publisher;
        this.tags = tags;
        this.body = body;
        this.pic = pic;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
