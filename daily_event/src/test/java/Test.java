import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 10068921(LgyTT)
 * @description:
 * @date 2019/1/4 14:20
 **/
public class Test{

    public static void  main(String[]args){
        // 定义一个任意格式的日期时间字符串
        String str1 = "2014==04==12 01时06分09秒";
// 根据需要解析的日期、时间字符串定义解析所用的格式器
        DateTimeFormatter fomatter1 = DateTimeFormatter
                .ofPattern("yyyy==MM==dd HH时mm分ss秒");
// 执行解析
        LocalDateTime dt1 = LocalDateTime.parse(str1, fomatter1);
        System.out.println(dt1); // 输出 2014-04-12T01:06:09
// ---下面代码再次解析另一个字符串---
        String str2 = "2019-01-04 13:55:19";
        DateTimeFormatter fomatter2 = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dt2 = LocalDateTime.parse(str2, fomatter2);
        System.out.println(dt2); // 输出 2014-04-13T20:00


    }
}
