package com.sqt.edu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.sqt.edu.base.BaseModel;
import io.swagger.annotations.ApiModelProperty;

public class StudentInfo extends BaseModel {

    private static final long serialVersionUID = 6510879642904826381L;

    @TableId(type = IdType.AUTO)
    @ApiModelProperty("主键id")
    private Long id;
    @ApiModelProperty("姓名")
    private String studentName;
    @ApiModelProperty("性别")
    private String sex;
    @ApiModelProperty("联系方式")
    private String phone;
    @ApiModelProperty("就读院校")
    private String School;
    @ApiModelProperty("身份证号")
    private String idCard;
    @ApiModelProperty("用户id")
    private Long accUserId;
}
