package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test4 {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");

        System.out.println("연결되었음!");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from jdbc_test"); 
        
        //next()를 호출하면 서버에서 데이터를 한개(레코드라 부른다)가져온다.
        //가져왔으면 true, 더이상 가져올 레코드가 없으면 false를 리턴한다.
         
        while(rs.next()) {
         //가져온 한 개의 데이터는 ResultSet 객체에 보관되어 있다.
            System.out.printf("%d,%s,%s,%s,%d\n",
                    rs.getInt("no"),rs.getString(2),rs.getString("conts"),rs.getString("regdt").toString(),
                    rs.getInt("vwcnt"));
        }
        
        rs.close();
        stmt.close();
        con.close();

    }
}
