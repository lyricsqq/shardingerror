package com.lyrics.qq.shardingerror.controller;


import com.lyrics.qq.shardingerror.service.ITBaseDefectService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 报修(缺陷)单表 前端控制器
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@RestController
@RequestMapping(value = "defect", method = {RequestMethod.POST, RequestMethod.GET})
@Api(description = "报修单基本信息维护")
public class TBaseDefectController {
    @Autowired
    private ITBaseDefectService iTBaseDefectService;

}
