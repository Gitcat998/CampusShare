package com.campus.CampusShare.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.Date;
import java.util.Collections;

/**
 * 用户实体
 * @author 重庆财经学院实训团队
 * @since 2025-10-26
 */
@Data
@TableName("user")
public class User implements UserDetails {
    private Long id;
    private String username;
    private String password;
    private String realName;
    private String studentId;
    private String phone;
    private String email;
    private String avatar;
    private Long roleId;
    private Date createTime;
    private Date updateTime;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    private Integer isDelete;
}