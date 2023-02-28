import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.util.*


fun main(args: Array<String>) {
    println("Let's start our first exercise!");


    //use your own credentials to test the database
    //var con = getConnection("yourDbUsername", "yourDbPassword");
    //var result = executeQuery(con, "SELECT * from students");

    println(result);

    while(result!!.next()) {
        println(result.getString("email"));
    }

    // Test statements:
    /*
    var email = DatabaseController.getStudentsEmailById(2)
    println(email)
    */

    /*
    var student = DatabaseController.getStudentById(1);
    println(student)
    */

    /*
    var students = DatabaseController.getAllStudents();
    for(student in students){
        println(student.toString())
    }
    */

}

data class Student(val id: Int, val firstName: String, val lastName: String, val email: String)

fun getConnection(username: String, password: String): Connection {
    val connectionProps = Properties()
    val databaseName = username
    connectionProps["user"] = username
    connectionProps["password"] = password
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    return DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                databaseName,
        connectionProps)
}

fun executeQuery(connection: Connection, query: String): ResultSet? {
    val statement = connection.prepareStatement(query)
    return statement.executeQuery()
}


