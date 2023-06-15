package org.example;

import java.util.ArrayList;
import java.util.List;

class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        teachers = new ArrayList<>();
    }

    public void createTeacher(int id, String name, String subject) {
        Teacher teacher = new Teacher(id, name, subject);
        teachers.add(teacher);
    }

    public void editTeacher(int id, String newName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setName(newName);
                teacher.setSubject(newSubject);
                break;
            }
        }
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
