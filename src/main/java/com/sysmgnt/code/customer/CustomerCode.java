package com.sysmgnt.code.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity//(name="CUSTOMER_CODE")
public class CustomerCode {
    @Id
    @GeneratedValue
    private int     id;
    private String  code;
    private String  ceo;
    private String  etprNo;
    private String  corpNm;
    private String  corpType;
    private String  postCode;
    private String  addr1;
    private String  addr2;
    private int     bldNo;
    private int     suplCd;
    private String  telNo;
    private boolean state;
    
}
