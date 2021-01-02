package com.github.peacetrue.registration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 报名申请控制器
 *
 * @author xiayx
 */
@Slf4j
@RestController
@RequestMapping(value = "/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Mono<RegistrationVO> addByForm(RegistrationAdd params) {
        log.info("新增报名申请信息(请求方法+表单参数)[{}]", params);
        //此接口无需认证和身份验证，手动设置一个默认操作者
        if (params.getOperatorId() == null) params.setOperatorId(1L);
        return registrationService.add(params);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<RegistrationVO> addByJson(@RequestBody RegistrationAdd params) {
        log.info("新增报名申请信息(请求方法+JSON参数)[{}]", params);
        //此接口无需认证和身份验证，手动设置一个默认操作者
        if (params.getOperatorId() == null) params.setOperatorId(1L);
        return registrationService.add(params);
    }

    @GetMapping(params = "page")
    public Mono<Page<RegistrationVO>> query(RegistrationQuery params, Pageable pageable, String... projection) {
        log.info("分页查询报名申请信息(请求方法+参数变量)[{}]", params);
        return registrationService.query(params, pageable, projection);
    }

    @GetMapping
    public Flux<RegistrationVO> query(RegistrationQuery params, Sort sort, String... projection) {
        log.info("全量查询报名申请信息(请求方法+参数变量)[{}]", params);
        return registrationService.query(params, sort, projection);
    }

    @GetMapping("/{id}")
    public Mono<RegistrationVO> getByUrlPathVariable(@PathVariable Long id, String... projection) {
        log.info("获取报名申请信息(请求方法+路径变量)详情[{}]", id);
        return registrationService.get(new RegistrationGet(id), projection);
    }

    @RequestMapping("/get")
    public Mono<RegistrationVO> getByPath(RegistrationGet params, String... projection) {
        log.info("获取报名申请信息(请求路径+参数变量)详情[{}]", params);
        return registrationService.get(params, projection);
    }

    @PutMapping(value = {"", "/*"}, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public Mono<Integer> modifyByForm(RegistrationModify params) {
        log.info("修改报名申请信息(请求方法+表单参数)[{}]", params);
        return registrationService.modify(params);
    }

    @PutMapping(value = {"", "/*"}, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<Integer> modifyByJson(@RequestBody RegistrationModify params) {
        log.info("修改报名申请信息(请求方法+JSON参数)[{}]", params);
        return registrationService.modify(params);
    }

    @DeleteMapping("/{id}")
    public Mono<Integer> deleteByUrlPathVariable(@PathVariable Long id) {
        log.info("删除报名申请信息(请求方法+URL路径变量)[{}]", id);
        return registrationService.delete(new RegistrationDelete(id));
    }

    @DeleteMapping(params = "id")
    public Mono<Integer> deleteByUrlParamVariable(RegistrationDelete params) {
        log.info("删除报名申请信息(请求方法+URL参数变量)[{}]", params);
        return registrationService.delete(params);
    }

    @RequestMapping(path = "/delete")
    public Mono<Integer> deleteByPath(RegistrationDelete params) {
        log.info("删除报名申请信息(请求路径+URL参数变量)[{}]", params);
        return registrationService.delete(params);
    }

}
