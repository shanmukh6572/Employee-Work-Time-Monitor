package com.example.employee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee Work Time Monitor");

        Attendance attendance = new Attendance();
        Schedule schedule = new Schedule();
        Leave leave = new Leave();
        Overtime overtime = new Overtime();
        Reports reports = new Reports();

        attendance.track();
        schedule.manage();
        leave.request();
        overtime.calculate();
        reports.generate();
    }
}
