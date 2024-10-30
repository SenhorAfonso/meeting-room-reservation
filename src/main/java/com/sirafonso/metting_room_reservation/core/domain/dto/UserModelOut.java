package com.sirafonso.metting_room_reservation.core.domain.dto;

import java.util.UUID;

public record UserModelOut(
        UUID id,
        String name,
        String username,
        String email,
        String password
) {
    public static class Builder {
        private UUID id;
        private String name;
        private String username;
        private String email;
        private String password;

        public Builder id(UUID id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder username(String username) {
            this.username = username;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public UserModelOut build() {
            return new UserModelOut(
                    id,
                    name,
                    username,
                    email,
                    password
            );
        }
    }

    public static Builder build() {
        return new Builder();
    }
}
