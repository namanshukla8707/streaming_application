package com.code.free.entities.user;

import java.time.LocalDateTime;
import com.code.free.utilities.globalEnums.RoleType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_public_view", schema = "public")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserView {

    @Id
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private RoleType role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

}
