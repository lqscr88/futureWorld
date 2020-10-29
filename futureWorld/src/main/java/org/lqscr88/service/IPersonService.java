package org.lqscr88.service;

import org.lqscr88.domain.Person;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lq
 * @since 2020-10-26
 */
public interface IPersonService extends IService<Person> {

    void insertByPerson(Person person);
}
