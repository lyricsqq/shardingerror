package com.lyrics.qq.shardingerror.service.impl;

import com.lyrics.qq.shardingerror.mapper.TBaseDefectLogMapper;
import com.lyrics.qq.shardingerror.service.ITBaseDefectLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 报修单操作日志表 服务实现类
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Service
@Transactional
public class TBaseDefectLogServiceImpl   implements ITBaseDefectLogService {
    @Autowired
    private TBaseDefectLogMapper tBaseDefectLogMapper;


}
