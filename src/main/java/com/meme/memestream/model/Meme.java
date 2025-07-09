package com.meme.memestream.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// This class represents each meme’s structure in your application and MongoDB

@Document(collation = "meme_stream_db") // this is used to tell Spring Boot: This Java class (Meme) represents documents inside the MongoDB collection named meme_stream_db
public class Meme {
    
    @Id
    private String id;

    private String name;
    private String url;
    private String caption;
    private long timestamp;
    public Meme() {

    }
    public Meme(String id, String name, String url, String caption, long timestamp) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.caption = caption;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }
    public String getCaption() {
        return caption;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
