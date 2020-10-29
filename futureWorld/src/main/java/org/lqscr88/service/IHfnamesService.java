package org.lqscr88.service;

import org.lqscr88.domain.Hfnames;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lq
 * @since 2020-10-27
 */
public interface IHfnamesService extends IService<Hfnames> {

    void deleteBySurname(String s);
}
