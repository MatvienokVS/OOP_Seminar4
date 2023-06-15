package org.example;

class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(int id, String name, String subject) {
        teacherService.createTeacher(id, name, subject);
    }

    public void editTeacher(int id, String newName, String newSubject) {
        teacherService.editTeacher(id, newName, newSubject);
    }

    public void displayTeachers() {
        teacherView.displayTeachers();
    }
}