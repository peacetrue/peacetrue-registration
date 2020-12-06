package com.github.peacetrue.registration;

import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Nullable;

/**
 * 报名申请客户端
 *
 * @author xiayx
 */
@ReactiveFeignClient(name = "peacetrue-registration", url = "${peacetrue.Registration.url:${peacetrue.server.url:}}")
public interface RegistrationServiceClient {

    @PostMapping(value = "/registrations")
    Mono<RegistrationVO> add(RegistrationAdd params);

    @GetMapping(value = "/registrations", params = "page")
    Mono<Page<RegistrationVO>> query(@Nullable @SpringQueryMap RegistrationQuery params, @Nullable Pageable pageable, @SpringQueryMap String... projection);

    @GetMapping(value = "/registrations", params = "sort")
    Flux<RegistrationVO> query(@SpringQueryMap RegistrationQuery params, Sort sort, @SpringQueryMap String... projection);

    @GetMapping(value = "/registrations")
    Flux<RegistrationVO> query(@SpringQueryMap RegistrationQuery params, @SpringQueryMap String... projection);

    @GetMapping(value = "/registrations/get")
    Mono<RegistrationVO> get(@SpringQueryMap RegistrationGet params, @SpringQueryMap String... projection);

    @PutMapping(value = "/registrations")
    Mono<Integer> modify(RegistrationModify params);

    @DeleteMapping(value = "/registrations/delete")
    Mono<Integer> delete(@SpringQueryMap RegistrationDelete params);

}
