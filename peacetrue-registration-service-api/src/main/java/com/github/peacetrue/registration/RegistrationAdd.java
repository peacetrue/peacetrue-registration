package com.github.peacetrue.registration;

import com.github.peacetrue.core.OperatorCapableImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author xiayx
 */
@Getter
@Setter
@ToString
public class RegistrationAdd extends OperatorCapableImpl<Long> {

    private static final long serialVersionUID = 0L;

    /** 报名类型 */
    private Long typeId;
    /** 班级 */
    private Long classGradeId;
    /** 姓名 */
    @NotNull
    @Size(min = 1, max = 32)
    private String name;
    /** 年龄 */
    @Min(0)
    @Max(500)
    private Integer age;
    /** 手机 */
    @NotNull
    @Size(min = 1, max = 32)
    private String mobile;
    /** 电子邮箱 */
    @Size(min = 1, max = 32)
    private String email;
    /** 备注 */
    @Size(min = 1, max = 255)
    private String remark;

}
