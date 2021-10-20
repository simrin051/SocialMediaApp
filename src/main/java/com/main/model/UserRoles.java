package com.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document(collection="UserRoles")
public class UserRoles {
    String userID;
    String userRole;
}
