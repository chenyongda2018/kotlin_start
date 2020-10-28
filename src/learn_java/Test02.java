package learn_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream用法
 */
public class Test02 {

    public static void main(String[] args) {
        String[] str = new String[]{"word", "haha", "tea", "askdkasdasdalsdjkasj"};
        List<String> strings = Arrays.asList(str);
        strings.forEach(System.out::println);

        System.out.println("----------");

        //stream-0,创建stream
        List<String> list1 = Stream.of(str).filter(name -> name.length() < 10)
                .collect(Collectors.toList());

        //stream-0-1,generate创建stream
        Stream.generate(Math::random).limit(10);

        //stream-0-2,Collection接口子类创建Stream
        strings.stream();

        //stream-1,过滤长度小于10的字符串
        List<String> strings1 = strings.stream().filter(name -> name.length() < 10)
                .collect(Collectors.toList());

        //stream-2,转换stream
        //2.1,distinct()去重
        List<String> distinctStrs = strings.stream().distinct()
                .collect(Collectors.toList());

    }
}
