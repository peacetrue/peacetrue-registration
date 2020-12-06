package com.github.peacetrue.registration;

import com.github.peacetrue.core.OperatorCapableImpl;
import com.github.peacetrue.core.Range;
import lombok.*;


/**
 * @author xiayx
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationQuery extends OperatorCapableImpl<Long> {

    public static final RegistrationQuery DEFAULT = new RegistrationQuery();

    private static final long serialVersionUID = 0L;

    /** 主键 */
    private Long[] id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private Integer age;
    /** 手机 */
    private String mobile;
    /** 报名类型 */
    private Long typeId;
    /** 电子邮箱 */
    private String email;
    /** 备注 */
    private String remark;
    /** 创建者主键 */
    private Long creatorId;
    /** 创建时间 */
    private Range.LocalDateTime createdTime;
    /** 修改者主键 */
    private Long modifierId;
    /** 最近修改时间 */
    private Range.LocalDateTime modifiedTime;

    public RegistrationQuery(Long[] id) {
        this.id = id;
    }

}
