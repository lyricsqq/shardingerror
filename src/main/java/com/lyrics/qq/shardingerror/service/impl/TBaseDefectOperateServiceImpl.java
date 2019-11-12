package com.lyrics.qq.shardingerror.service.impl;

import com.lyrics.qq.shardingerror.mapper.TBaseDefectOperateMapper;
import com.lyrics.qq.shardingerror.service.ITBaseDefectOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 报修单操作最新记录表 服务实现类
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Service
@Transactional
public class TBaseDefectOperateServiceImpl  implements ITBaseDefectOperateService {
    @Autowired
    private TBaseDefectOperateMapper tBaseDefectOperateMapper;

}
