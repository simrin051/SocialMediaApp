package com.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class Comment {
    String nameOfTheUser;
    String commentLines;
    String commentId;
    String postId;
}
