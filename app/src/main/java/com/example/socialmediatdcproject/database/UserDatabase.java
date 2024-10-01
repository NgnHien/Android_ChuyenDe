package com.example.socialmediatdcproject.database;

import com.example.socialmediatdcproject.model.AdminDepartment;
import com.example.socialmediatdcproject.model.Lecturer;
import com.example.socialmediatdcproject.model.Student;
import com.example.socialmediatdcproject.model.User;

import java.util.ArrayList;

public class UserDatabase {
    protected ArrayList<User> usersDtb = new ArrayList<>();
    protected ArrayList<Student> studentsDtb = new ArrayList<>();
    protected ArrayList<Lecturer> lecturersDtb = new ArrayList<>();
    protected ArrayList<AdminDepartment> adminDepartmentsDtb = new ArrayList<>();

    public ArrayList<User> dataUser() {
        User u1 = new User();
        u1.setUserId(0);
        u1.setEmail("nguyenvana@gmail.com");
        u1.setPassword("999");
        u1.setFullName("Nguyễn Văn A");
        u1.setPhoneNumber("0987654321");
        u1.setAvatar("nill");
        u1.setRoleId(1); // Student
        usersDtb.add(u1);

        User u2 = new User();
        u2.setUserId(1);
        u2.setEmail("lethib@gmail.com");
        u2.setPassword("888");
        u2.setFullName("Lê Thị B");
        u2.setPhoneNumber("0987654322");
        u2.setAvatar("nill");
        u2.setRoleId(1); // Student
        usersDtb.add(u2);

        User u3 = new User();
        u3.setUserId(2);
        u3.setEmail("dothic@gmail.com");
        u3.setPassword("777");
        u3.setFullName("Đỗ Thị C");
        u3.setPhoneNumber("0987654323");
        u3.setAvatar("nill");
        u3.setRoleId(2); // Lecturer
        usersDtb.add(u3);

        User u4 = new User();
        u4.setUserId(3);
        u4.setEmail("phamvand@gmail.com");
        u4.setPassword("666");
        u4.setFullName("Phạm Văn D");
        u4.setPhoneNumber("0987654324");
        u4.setAvatar("nill");
        u4.setRoleId(1); // Student
        usersDtb.add(u4);

        User u5 = new User();
        u5.setUserId(4);
        u5.setEmail("tranthie@gmail.com");
        u5.setPassword("555");
        u5.setFullName("Trần Thị E");
        u5.setPhoneNumber("0987654325");
        u5.setAvatar("nill");
        u5.setRoleId(1); // Student
        usersDtb.add(u5);

        User u6 = new User();
        u6.setUserId(5);
        u6.setEmail("hoangphucf@gmail.com");
        u6.setPassword("444");
        u6.setFullName("Hoàng Phúc F");
        u6.setPhoneNumber("0987654326");
        u6.setAvatar("nill");
        u6.setRoleId(2); // Lecturer
        usersDtb.add(u6);

        User u7 = new User();
        u7.setUserId(6);
        u7.setEmail("tranquangh@gmail.com");
        u7.setPassword("333");
        u7.setFullName("Trần Quang H");
        u7.setPhoneNumber("0987654327");
        u7.setAvatar("nill");
        u7.setRoleId(1); // Student
        usersDtb.add(u7);

        User u8 = new User();
        u8.setUserId(7);
        u8.setEmail("phamthih@gmail.com");
        u8.setPassword("222");
        u8.setFullName("Phạm Thị H");
        u8.setPhoneNumber("0987654328");
        u8.setAvatar("nill");
        u8.setRoleId(1); // Student
        usersDtb.add(u8);

        User u9 = new User();
        u9.setUserId(8);
        u9.setEmail("nguyenvani@gmail.com");
        u9.setPassword("111");
        u9.setFullName("Nguyễn Văn I");
        u9.setPhoneNumber("0987654329");
        u9.setAvatar("nill");
        u9.setRoleId(1); // Student
        usersDtb.add(u9);

        User u10 = new User();
        u10.setUserId(9);
        u10.setEmail("adminKhoaCNTT@gmail.com");
        u10.setPassword("111");
        u10.setFullName("Nguyễn Huy Hoàng");
        u10.setPhoneNumber("0987654329");
        u10.setAvatar("nill");
        u10.setRoleId(3);
        usersDtb.add(u10);

        return usersDtb;
    }

    // Sinh viên
    // Hiện tại đang cho sinh viên giống nhau hết
    public ArrayList<Student> dataStudent() {
        for (User u : usersDtb) {
            if (u.getRoleId() == 1) {
                Student student = new Student(u.getUserId(), u.getEmail(), u.getPassword(), u.getFullName(), u.getAvatar(), u.getPhoneNumber(), u.getRoleId());
                student.setStudentNumber("22211TT00" + (u.getUserId() + 1));
                student.setBirthday("01/01/200" + (u.getUserId() + 1));
                student.setClassId(1);
                student.setDepartmentId(1);
                student.setMajorId(1);
                student.setDescription("Student " + (u.getUserId() + 1));
                studentsDtb.add(student);
            }
        }

        return studentsDtb;
    }

    // Giảng viên
    // Hiện tại đang cho giảng viên giống nhau hết
    public ArrayList<Lecturer> dataLecturer() {
        for (User u : usersDtb) {
            if (u.getRoleId() == 2) {
                Lecturer lecturer = new Lecturer(u.getUserId(), u.getEmail(), u.getPassword(), u.getFullName(), u.getAvatar(), u.getPhoneNumber(), u.getRoleId());
                lecturer.setLecturerNumber("L200" + (u.getUserId() + 1));
                lecturer.setBirthday("15/10/197" + (u.getUserId() + 1));
                lecturer.setDepartmentId(1);
                lecturer.setDescription("Lecturer " + (u.getUserId() + 1));
                lecturersDtb.add(lecturer);
            }
        }

        return lecturersDtb;
    }

    // Admin Department - CHỈ ĐỊNH
    public ArrayList<AdminDepartment> dataAdminDepartment() {
        for (User u : usersDtb) {
            if (u.getRoleId() == 3) {
                AdminDepartment adminDepartment1 = new AdminDepartment(u.getUserId(), u.getEmail(), u.getPassword(), u.getFullName(), u.getAvatar(), u.getPhoneNumber(), u.getRoleId());
                adminDepartment1.setDepartmentId(1);
                adminDepartmentsDtb.add(adminDepartment1);
            }
        }

        return adminDepartmentsDtb;
    }
}
