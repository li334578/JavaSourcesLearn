package com.company.JavaSourceLearn.excelLearn;

import lombok.Data;

import java.util.Date;

/**
 * @Author: liwenbo
 * @Date: 2021年07月07日
 * @Description:
 */
@Data
public class BarCode {
    private Integer id;
    private String codeNo;
    private Long codeInfoId;
    private Long creatUserId;
    private Long orgId;
    private Long userId;
    private Date createTime;
    private Date useTime;
    private Integer DataStatus;
    private Integer isRegulate;
    private Integer codeRule;
    private Integer buildAction;
    private Long deliverRecordId;
}
