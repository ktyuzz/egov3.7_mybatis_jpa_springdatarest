package com.sysmgnt.log;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;

@Data   
@Entity
public class AdminLog {
    @Id
    @GeneratedValue
    private int     id;
    private String  url;
    private String  userId;
    private Date    createDt;
    private String  createIp;
    private boolean isApi;
}
