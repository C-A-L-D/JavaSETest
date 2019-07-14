import com.nihaoa.dbtools.LibDB;

import java.util.List;

public class AA {

    public static void main(String[] args) throws  Exception{

        LibDB.init("root","root","jdbc:mysql://127.0.0.1:3306/test1?characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai");
        List<Shop> shops = LibDB.executeQueryMore("select * from shop",Shop.class);
        for (Shop s: shops) {
            System.out.println(s.getSid());
            System.out.println(s.getSname());
        }
    }
}
