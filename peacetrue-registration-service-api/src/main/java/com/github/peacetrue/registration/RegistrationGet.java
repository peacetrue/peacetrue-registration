package com.github.peacetrue.registration;

import com.github.peacetrue.core.OperatorCapableImpl;
import lombok.*;

import javax.validation.constraints.NotNull;


/**
 * @author xiayx
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationGet extends OperatorCapableImpl<Long> {

    private static final long serialVersionUID = 0L;

    @NotNull
    private Long id;

}
