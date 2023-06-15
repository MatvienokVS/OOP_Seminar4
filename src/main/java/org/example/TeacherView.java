package org.example;

import java.util.List;
class TeacherView {
    private TeacherService teacherService;

    public TeacherView(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public void displayTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println("ID: " + teacher.getId());
            System.out.println("Name: " + teacher.getName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println();
        }
    }
}