//package com.example.crudapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//public class Student extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_student);
//    }
//}
package com.example.crudapp;


public class Student {
    private int id;
    private String studentName;

    Student() {
    }
    Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }
    void setID(int id) {
        this.id = id;
    }
    int getID() {
        return this.id;
    }
    void setStudentName(String studentname) {
        this.studentName = studentname;
    }
    String getStudentName() {
        return this.studentName;
    }
}
