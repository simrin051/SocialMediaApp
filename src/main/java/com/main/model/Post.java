package com.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Post {
    int noOfLikes;
    List<Comment> comments;
    String userId;
    String postId;
}
