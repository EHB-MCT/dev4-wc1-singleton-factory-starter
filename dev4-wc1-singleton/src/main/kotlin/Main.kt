import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.util.*

/*
username: "u14405dev4be"
password: "WH2t2L22cLs232Qr"
databaseName: "14405dev4be"
 */

fun main(args: Array<String>) {
    println("Let's start our first exercise!")

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

fun getConnection(username: String, password: String, databaseName: String): Connection {
    val connectionProps = Properties()
    connectionProps["user"] = username
    connectionProps["password"] = password
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    return DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "mysql07.websrv.be " +
                ":" + "3306" + "/" +
                databaseName,
        connectionProps)
}

fun executeQuery(connection: Connection, query: String): ResultSet? {
    val statement = connection.prepareStatement(query)
    return statement.executeQuery()
}


