package com.karthick.videocall.user;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchConnectionDetails;

@Data
@Builder
public class User {
    private String username;
    private String email;
    private String password;
    private String status;
    private User() {
        // Private constructor to force the use of builder
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public static class UserBuilder {
        private String username;
        private String email;
        private String password;
        private String status;

        private UserBuilder() {
            // Private constructor to restrict instantiation from outside
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder status(String status) {
            this.status = status;
            return this;
        }

        public User build() {
            User user = new User();
            user.username = this.username;
            user.email = this.email;
            user.password = this.password;
            user.status = this.status;
            return user;
        }
    }
}
