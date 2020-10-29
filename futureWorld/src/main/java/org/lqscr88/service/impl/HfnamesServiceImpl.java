package org.lqscr88.service.impl;

import org.lqscr88.domain.Hfnames;
import org.lqscr88.mapper.HfnamesMapper;
import org.lqscr88.service.IHfnamesService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lq
 * @since 2020-10-27
 */
@Service
public class HfnamesServiceImpl extends ServiceImpl<HfnamesMapper, Hfnames> implements IHfnamesService {

    @Override
    public void deleteBySurname(String s) {
         baseMapper.deleteBySurname(s);
    }
}
