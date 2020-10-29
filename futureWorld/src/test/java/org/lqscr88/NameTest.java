package org.lqscr88;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lqscr88.domain.Hfnames;
import org.lqscr88.service.IHfnamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class NameTest {

    @Autowired
    private IHfnamesService iHfnamesService;

    @Test
    public void cs() {
        // TODO Auto-generated method stub
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lqscr88\\Desktop\\未来世界\\男.txt"));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result.append(s+System.lineSeparator());
            }
            String[] split = result.toString().split(" ");
            Set<String> listName=new HashSet<>();
            Map<String,String> map=new HashMap<>();
            for (int i = 0; i < split.length; i++) {
                listName.add(split[i]);

            }
            List<Hfnames> list=new ArrayList<>();
            listName.forEach(e->{
                Hfnames hfnames=new Hfnames();
                    hfnames.setSurname(e);
                    hfnames.setSex("男");
                    list.add(hfnames);

            });
            try {
                iHfnamesService.insertBatch(list);
            }catch (Exception e){

            }

            Stream.of(listName).forEach(System.out::println);
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public  void delete(){
        iHfnamesService.deleteBySurname(" ");
    }
}
