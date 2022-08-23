package org.khasanof;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Language language;
    private int age;
    private boolean active;

    public User(Integer id, String username, String password, String email, Language language, int age, boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.language = language;
        this.age = age;
        this.active = active;
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.language = builder.language;
        this.age = builder.age;
        this.active = builder.active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", language=" + language +
                ", age=" + age +
                ", active=" + active +
                '}';
    }

    public static class Builder {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Language language;
        private int age;
        private boolean active;

        public Builder() {
        }

        public Builder withId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withLanguage(Language language) {
            this.language = language;
            return this;
        }

        public Builder withAge(Integer id) {
            this.id = id;
            return this;
        }

        public Builder withActive(Boolean active) {
            this.active = active;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
