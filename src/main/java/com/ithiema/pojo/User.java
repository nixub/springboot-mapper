package com.ithiema.pojo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;




@Data
@Table(name = "t_user")
public class User implements Serializable {
    @Id//注解标识该字段为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uid")
    private Integer uid;//这是用int还是integerne ?
    @Column(name = "username")
    private String username;

    @Column(name = "sex")
    private String sex;

    @Column(name = "birthday")
    private Date birthday;



    @Column(name = "address")
    private String address;





}
