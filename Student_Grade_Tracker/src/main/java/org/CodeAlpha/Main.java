package org.CodeAlpha;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

            public static class Student {
                private String name;
                private int grade;

                public Student(String name, int grade) {
                    this.name = name;
                    this.grade = grade;
                }

                public String getName() {
                    return name;
                }

                public int getGrade() {
                    return grade;
                }
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList<Student> students = new ArrayList<>();

                System.out.print("Enter the number of students: ");
                int numStudents = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                // Input student names and grades
                for (int i = 0; i < numStudents; i++) {
                    System.out.print("Enter name for student " + (i + 1) + ": ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade for student " + name + ": ");
                    int grade = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    students.add(new Student(name, grade));
                }

                // Compute average
                double average = calculateAverage(students);

                // Find highest and lowest grades
                int highest = findHighestGrade(students);
                int lowest = findLowestGrade(students);

                // Output results
                System.out.println("Average grade: " + average);
                System.out.println("Highest grade: " + highest);
                System.out.println("Lowest grade: " + lowest);
            }

            public static double calculateAverage(ArrayList<Student> students) {
                int sum = 0;
                for (Student student : students) {
                    sum += student.getGrade();
                }
                return (double) sum / students.size();
            }

            public static int findHighestGrade(ArrayList<Student> students) {
                int highest = Integer.MIN_VALUE;
                for (Student student : students) {
                    highest = Math.max(highest, student.getGrade());
                }
                return highest;
            }

            public static int findLowestGrade(ArrayList<Student> students) {
                int lowest = Integer.MAX_VALUE;
                for (Student student : students) {
                    lowest = Math.min(lowest, student.getGrade());
                }
                return lowest;
            }
        }



