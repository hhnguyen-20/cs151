package org.example.design_patterns;

// referred from https://www.geeksforgeeks.org/mvc-design-pattern/

class Student {
    private String sid;
    private String name;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StudentView {
    public void printStudentDetails(String studentName, String sid) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("SID: " + sid);
    }
}

class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentSid(String sid) {
        model.setSid(sid);
    }

    public String getStudentSid() {
        return model.getSid();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getSid());
    }
}

class MVCPattern {
    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("FirstName LastName");
        student.setSid("00000001");
        return student;
    }

    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("newFirstName newLastName");
        controller.updateView();
    }
}