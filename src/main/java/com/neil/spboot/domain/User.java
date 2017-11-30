package com.neil.spboot.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long usrID;
    public String account;
    public String fullname;
    @Column(nullable=true,length=512)
    private String userName;
    private String password;
    private String email;
    private String nickName;
    private Date regTime;
}
