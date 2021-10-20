package com.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document(collection="Users")
public class User {
    private String userId;
    private String profileImage;
    private String profileName;
    private int noOfPosts;
    private int noOfFollowers;
    private int noOfFollowing;
    private String password;
    List<Post> posts;
}
