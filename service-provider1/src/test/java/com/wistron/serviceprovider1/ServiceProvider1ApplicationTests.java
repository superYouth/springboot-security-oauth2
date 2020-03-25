package com.wistron.serviceprovider1;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.wistron.serviceprovider1.controller.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceProvider1ApplicationTests {


    @Test
    public void testPow(){
        BigDecimal b1 = new BigDecimal("10");
        double pow = Math.pow(b1.doubleValue(), 1.0 / 36);
        System.out.println(pow);


    }
    @Test
    public void testStream() {
        ArrayList<Object> list = Lists.newArrayList();
        list.stream().parallel().distinct();

    }

    @Test
    public void testOptional() {
        Person person = new Person("zhangsan", 10, "N");
        Optional.ofNullable(person).ifPresent(p -> {
            // 如果存在(person不为null)的操作
            p.setAge(100);
        });
        System.out.println(person);
    }

    public Person getPerson() {
        return new Person("zhangsan", 10, "N");
    }

    @Test
    public void contextLoads() {

        List<Person> list = Lists.newArrayList();
        list.add(new Person("zhangsan", 10, "N"));
        list.add(new Person("zhangsan", 10, "N"));
        list.add(new Person("zhangsan", 55, "N"));
        list.add(new Person("zhaoliu", 68, "M"));
        list.add(new Person("qianqi", 44, "N"));
        list.add(new Person("qiaofeng", 35, "M"));
        list.add(new Person(null, 24, "M"));
        list.add(null);
        System.out.println(list.size());

//        Map<String, List<Person>> collect = list.stream().collect(Collectors.groupingBy(x -> String.format("%s_%s",x.getName1(),x.getSex())));
//        System.out.println(collect);

        try {
            Comparator<Person> byName = Comparator.comparing(Person::getName1, Comparator.nullsLast(Comparator.naturalOrder()));
            Comparator<Person> byAge = Comparator.comparing(Person::getAge, Comparator.nullsLast(Comparator.naturalOrder()));
            Comparator<Person> BySex = Comparator.comparing(Person::getSex, Comparator.nullsLast(Comparator.naturalOrder()));


            if (null != list && list.size() > 0) {
                Collections.sort(list, byName.thenComparing(byAge).thenComparing(BySex));
            }
            System.out.println(list);
        } catch (Exception e) {
            throw e;
        }

    }

}

class Person {
    private String name1;
    private Integer age;
    private String sex;

    public Person(String name1, Integer age, String sex) {
        this.name1 = name1;
        this.age = age;
        this.sex = sex;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name1='" + name1 + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
