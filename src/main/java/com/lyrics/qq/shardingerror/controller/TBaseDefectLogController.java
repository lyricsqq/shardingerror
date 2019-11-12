package com.lyrics.qq.shardingerror.controller;


import com.lyrics.qq.shardingerror.service.ITBaseDefectLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 报修单操作日志表 前端控制器
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@RestController
@RequestMapping(value = "web", method = {RequestMethod.POST, RequestMethod.GET})
public class TBaseDefectLogController {
    @Autowired
    private ITBaseDefectLogService iTBaseDefectLogService;


}
