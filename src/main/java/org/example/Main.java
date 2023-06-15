package org.example;
import lombok.*;



public class Main {
    public static void main(String[] args) {
        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView(teacherService);
        TeacherController teacherController = new TeacherController(teacherService, teacherView);

        // Создание учителей
        teacherController.createTeacher(1, "Ivanov", "Mathematics");
        teacherController.createTeacher(2, "Petrov", "Physics");

        // Отображение списка учителей
        teacherController.displayTeachers();

        // Редактирование учителя
        teacherController.editTeacher(1, "Sidorov", "Russian language");

        // Отображение списка учителей после редактирования
        teacherController.displayTeachers();
    }
}