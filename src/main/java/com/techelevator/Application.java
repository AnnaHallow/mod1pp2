package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    List<Department> departments = new ArrayList<Department>();
    List<Employee> employees = new ArrayList<>();
    List<Employee> departmentEngineering = new ArrayList<>();
    List<Employee> departmentMarketing = new ArrayList<>();

    /**
     * The main entry point in the application
     *
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department Marketing = new Department(1, "Marketing");
        Department Sales = new Department(2, "Sales");
        Department Engineering = new Department(3, "Engineering");
        departments.add(Marketing);
        departments.add(Sales);
        departments.add(Engineering);


    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (int i = 0; i < departments.size(); i++) {
            System.out.println(departments.get(i).getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        Employee Dean = new Employee(1, "Dean", "Johnson", "djohnson@teams.com", departments.get(2), "08/21/2020");
        Employee Angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", departments.get(2), "08/21/2020");
        Employee Margaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020");
        employees.add(Dean);
        employees.add(Angie);
        employees.add(Margaret);

        Angie.setSalary(Angie.raiseSalary(60000, 10));
        //  Angie.setSalary(66000);

        //employees.get(1).raiseSalary(60000, 10);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFullName() + " (" + employees.get(i).getSalary() + ") " + employees.get(i).getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    Map<String, Project> projects = new HashMap<>();
    Map<String, Department> depts = new HashMap<>();

    private void createTeamsProject() {
        Project Teams = new Project("TEams", "Project Management Software", "10/11/2020", "11/10/2020");
        // Teams.setTeamMembers();
        //projects.put("TEams", Teams);
        //  projects.put("Dean", Teams);
        //projects.put("Angie", Teams);
        for (Employee employee : employees) {
            //depts.put("Dean", departments.get(0));
            //depts.put("Margaret", departments.get(1));
            if (employee.getDepartment().getName().equals("Engineering")) {
                departmentEngineering.add(employee);
            }
        }
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project marketingLandingPage = new Project("Marketing Landing Page", "Lead Caputure Landing Page for Marketing", "10/10/2020", "10/17/2020");
        for(Employee employee : employees){
            if(employee.getDepartment().getName().equals("Marketing")){
                departmentMarketing.add(employee);
            }
        }
        projects.put("Margaret", marketingLandingPage);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        System.out.println("TEams: " + departmentEngineering.size());
        System.out.println("Marketing Landing Page: " + departmentMarketing.size());
        int engineeringTeam = 0;
        int marketingTeam = 0;
        //for (int i=0; i<projects.size();i++){

        //     if(projects.containsKey("Dean")){
        //        System.out.println("Team ++");
    }
         /*   if (depts.containsValue(departments.get(2))){
                engineeringTeam++;
                System.out.println("Team ++");
            } if(depts.containsValue("Marketing Landing Page")){
                marketingTeam++;
                System.out.println("Markets ++");
            } */





                }

