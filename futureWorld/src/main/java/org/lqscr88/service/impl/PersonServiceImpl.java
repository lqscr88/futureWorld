package org.lqscr88.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.lqscr88.contant.PersonContant;
import org.lqscr88.domain.Person;
import org.lqscr88.mapper.PersonMapper;
import org.lqscr88.service.IPersonService;
import org.lqscr88.utils.RandomRice;
import org.lqscr88.utils.attribute.Attributes;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lq
 * @since 2020-10-26
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Override
    public void insertByPerson(Person person) {
//      Person build = Builder.of(Person::new).with(Person::setName, "").build();
        person.setHandLength(RandomRice.hand());
        person.setHeight(RandomRice.height());
        person.setGrade(PersonContant.GRADE_BODY_REFINING_MIRROR);
        person.setAttribute(Attributes.getAttribute());
//        person
    }
}
