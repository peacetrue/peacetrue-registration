package com.github.peacetrue.registration;

import com.github.peacetrue.core.IdCapable;
import com.github.peacetrue.core.OperatorCapableImpl;
import lombok.*;

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
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationModify extends OperatorCapableImpl<Long> implements IdCapable<Long> {

    private static final long serialVersionUID = 0L;

    /** 主键 */
    @NotNull
    private Long id;
    /** 姓名 */
    @Size(min = 1, max = 32)
    private String name;
    /** 年龄 */
    @Min(0)
    @Max(500)
    private Integer age;
    /** 手机 */
    @Size(min = 1, max = 32)
    private String mobile;
    /** 报名类型 */
    private Long typeId;
    /** 班级 */
    private Long classGradeId;
    /** 电子邮箱 */
    @Size(min = 1, max = 32)
    private String email;
    /** 备注 */
    @Size(min = 1, max = 255)
    private String remark;

}
