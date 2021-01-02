package com.github.peacetrue.registration;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author xiayx
 */
@Data
public class RegistrationVO implements Serializable {

    private static final long serialVersionUID = 0L;

    /** 主键 */
    private Long id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;
    /** 手机 */
    private String mobile;
    /** 报名类型 */
    private Long typeId;
    /** 班级 */
    private Long classGradeId;
    /** 电子邮箱 */
    private String email;
    /** 备注 */
    private String remark;
    /** 创建者主键 */
    private Long creatorId;
    /** 创建时间 */
    private LocalDateTime createdTime;
    /** 修改者主键 */
    private Long modifierId;
    /** 最近修改时间 */
    private LocalDateTime modifiedTime;
}
