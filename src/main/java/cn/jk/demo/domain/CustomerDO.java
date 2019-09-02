package cn.jk.demo.domain;

import javax.persistence.Id;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;

@Entity //是一个必选的注解，声明这个类对应了一个数据库表。
@Table(name = "customer")
public class CustomerDO {

    private Long id;

    private String name;

    private Date rawAddTime;

    private Timestamp rawUpdateTime;

    public CustomerDO(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name", length = 255, nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "raw_add_time", nullable = false)
    public Date getRawAddTime() {
        return rawAddTime;
    }

    @Column(name = "raw_update_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Timestamp getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Timestamp rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }


}
