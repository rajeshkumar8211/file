import java.sql.*;


public class Main {
    public static void main(String[] args) throws Exception {
        //Class.forName("com.mysql.cj.jdbc.Driver"); --Optional
        String url="jdbc:mysql://localhost:3306/javadbcoonection";
        String username="root";
        String password="svmr";

        Connection con = DriverManager.getConnection(url,username,password);
        int rno=4;
        //String name="Viji";

        String sql ="select * from course where std_no = ?";

        PreparedStatement ps = con.prepareStatement(sql);
        //ps.setInt(1,rno);
        //ps.setString(2,name);
        //ps.executeUpdate();
        ps.setInt(1,4);
        ResultSet rs =ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
        }
        /*Statement st = con.createStatement();
        int rno =3;
        String name="Senthil";
        //String sql ="insert into course values (1,'Rajesh'),(2,'Manoj')";
        String sql ="insert into course values ("+rno+",'"+name+"')";
        int val=st.executeUpdate(sql);
         System.out.println(val+"row/s affected");
        /*ResultSet rs =st.executeQuery(sql);

        while (rs.next()) {//skip for headers
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }*/
        con.close();
    }
}