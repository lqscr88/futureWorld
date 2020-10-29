package org.lqscr88.mapper;

import org.lqscr88.domain.Hfnames;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lq
 * @since 2020-10-27
 */
public interface HfnamesMapper extends BaseMapper<Hfnames> {

    void deleteBySurname(String s);
}
