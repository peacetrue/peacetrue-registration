package com.github.peacetrue.registration;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Nullable;

/**
 * 报名申请服务接口
 *
 * @author xiayx
 */
public interface RegistrationService {

    /** 新增 */
    Mono<RegistrationVO> add(RegistrationAdd params);

    /** 分页查询 */
    Mono<Page<RegistrationVO>> query(@Nullable RegistrationQuery params, @Nullable Pageable pageable, String... projection);

    /** 全量查询 */
    Flux<RegistrationVO> query(RegistrationQuery params, @Nullable Sort sort, String... projection);

    /** 全量查询 */
    default Flux<RegistrationVO> query(RegistrationQuery params, String... projection) {
        return this.query(params, (Sort) null, projection);
    }

    /** 获取 */
    Mono<RegistrationVO> get(RegistrationGet params, String... projection);

    /** 修改 */
    Mono<Integer> modify(RegistrationModify params);

    /** 删除 */
    Mono<Integer> delete(RegistrationDelete params);

}
