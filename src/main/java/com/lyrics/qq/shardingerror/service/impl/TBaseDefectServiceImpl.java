package com.lyrics.qq.shardingerror.service.impl;

import com.lyrics.qq.shardingerror.mapper.TBaseDefectMapper;
import com.lyrics.qq.shardingerror.service.ITBaseDefectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 报修(缺陷)单表 服务实现类
 * </p>
 *
 * @author lyrics
 * @since 2019-10-15
 */
@Service
@Transactional
public class TBaseDefectServiceImpl   implements ITBaseDefectService {
    @Autowired
    private TBaseDefectMapper tBaseDefectMapper;


}
