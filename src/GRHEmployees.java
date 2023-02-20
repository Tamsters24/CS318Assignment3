/* Tammy Busche
 * CS 318: Algorithm Analysis
 * 68211-Winter 2023
 * Assignment 3, Feb 22, 2023
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.princeton.cs.algs4.*;

public class GRHEmployees {
    public static void loadPrint(String file, String stType, double loadTime, int empCount) {
        /*---------------------------------------------------------------------*/
        /*---------------------------- Load Print -----------------------------*/
        /*---------------------------------------------------------------------*/
        System.out.println("\tfilename:" + file);
        System.out.println("\tsymbol table name:" + stType);
        System.out.println("Symbol table load time: " + loadTime);
        System.out.println("\trecord count:" + empCount);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the GRH employee data program!");
        /*---------------------------------------------------------------------*/
        /*--------------- Command line check & args assignment ----------------*/
        /*---------------------------------------------------------------------*/
        if (args.length == 2) {
            File employee_infile = new File(args[0]);
            String symbolTableType = args[1];
            int employeeID, recordCount = 0;

            /*-----------------------------------------------------------------*/
            /*-------------------------- File Input ---------------------------*/
            /*-----------------------------------------------------------------*/
            Scanner fileScanner = null;
            try {
                fileScanner = new Scanner(employee_infile);
            } catch (FileNotFoundException e) {
                System.out.println(
                        "ERROR: Specified input file is not found or does not exist");
                System.exit(1);
            }

            /*-----------------------------------------------------------------*/
            /*----------------------- Symbol Table Load -----------------------*/
            /*-----------------------------------------------------------------*/
            Scanner employeeQuery = new Scanner(System.in);
            // Load Timer start
            Stopwatch loadTimer = new Stopwatch();
            double loadTime;

            /*---------------------- SequentialSearchST -----------------------*/
            if (symbolTableType.equals("SequentialSearchST")) {
                // Symbol Table Load
                SequentialSearchST<Integer, Employee> employee_st =
                        new SequentialSearchST<>();
                while (fileScanner.hasNextLine()) {
                    String employee_parameter = fileScanner.nextLine();
                    Employee employee = new Employee(employee_parameter);
                    employee_st.put(employee.id, employee);
                    recordCount++;
                }
                loadTime = loadTimer.elapsedTime();
                loadPrint(args[0], args[1],  loadTime, recordCount);

                // Symbol Table Search
                System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                employeeID = employeeQuery.nextInt();
                Employee search;
                double searchTime;
                while (employeeID != -1) {
                    Stopwatch searchTimer = new Stopwatch();
                    if (employee_st.contains(employeeID)) {
                        search = employee_st.get(employeeID);
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: " + search);
                    } else {
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: No employee record for id " + employeeID);
                    }
                    System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                    employeeID = employeeQuery.nextInt();
                }
            }
            /*------------------------- BinarySearchST ------------------------*/
            else if (symbolTableType.equals("BinarySearchST")) {
                // Symbol Table Load
                BinarySearchST<Integer, Employee> employee_st =
                        new BinarySearchST<>();
                while (fileScanner.hasNextLine()) {
                    String employee_parameter = fileScanner.nextLine();
                    Employee employee = new Employee(employee_parameter);
                    employee_st.put(employee.id, employee);
                    recordCount++;
                }
                loadTime = loadTimer.elapsedTime();
                loadPrint(args[0], args[1],  loadTime, recordCount);

                // Symbol Table Search
                System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                employeeID = employeeQuery.nextInt();
                Employee search;
                double searchTime;
                while (employeeID != -1) {
                    Stopwatch searchTimer = new Stopwatch();
                    if (employee_st.contains(employeeID)) {
                        search = employee_st.get(employeeID);
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: " + search);
                    } else {
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: No employee record for id " + employeeID);
                    }
                    System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                    employeeID = employeeQuery.nextInt();
                }
            }
            /*------------------------------ BST ------------------------------*/
            else if (symbolTableType.equals("BST")) {
                // Symbol Table Load
                BST<Integer, Employee> employee_st =
                        new BST<>();
                while (fileScanner.hasNextLine()) {
                    String employee_parameter = fileScanner.nextLine();
                    Employee employee = new Employee(employee_parameter);
                    employee_st.put(employee.id, employee);
                    recordCount++;
                }
                loadTime = loadTimer.elapsedTime();
                loadPrint(args[0], args[1],  loadTime, recordCount);

                // Symbol Table Search
                System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                employeeID = employeeQuery.nextInt();
                Employee search;
                double searchTime;
                while (employeeID != -1) {
                    Stopwatch searchTimer = new Stopwatch();
                    if (employee_st.contains(employeeID)) {
                        search = employee_st.get(employeeID);
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: " + search);
                    } else {
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: No employee record for id " + employeeID);
                    }
                    System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                    employeeID = employeeQuery.nextInt();
                }
            }
            /*-------------------------- RedBlackBST --------------------------*/
            else if (symbolTableType.equals("RedBlackBST")) {
                // Symbol Table Load
                RedBlackBST<Integer, Employee> employee_st =
                        new RedBlackBST<>();
                while (fileScanner.hasNextLine()) {
                    String employee_parameter = fileScanner.nextLine();
                    Employee employee = new Employee(employee_parameter);
                    employee_st.put(employee.id, employee);
                    recordCount++;
                }
                loadTime = loadTimer.elapsedTime();
                loadPrint(args[0], args[1],  loadTime, recordCount);

                // Symbol Table Search
                System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                employeeID = employeeQuery.nextInt();
                Employee search;
                double searchTime;
                while (employeeID != -1) {
                    Stopwatch searchTimer = new Stopwatch();
                    if (employee_st.contains(employeeID)) {
                        search = employee_st.get(employeeID);
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: " + search);
                    }
                    else {
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: No employee record for id " + employeeID);
                    }
                    System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                    employeeID = employeeQuery.nextInt();
                }
            }
            /*-------------------- SeparateChainingHashST ---------------------*/
            else if (symbolTableType.equals("SeparateChainingHashST")) {
                // Symbol Table Load
                SeparateChainingHashST<Integer, Employee> employee_st =
                        new SeparateChainingHashST<>();
                while (fileScanner.hasNextLine()) {
                    String employee_parameter = fileScanner.nextLine();
                    Employee employee = new Employee(employee_parameter);
                    employee_st.put(employee.id, employee);
                    recordCount++;
                }
                loadTime = loadTimer.elapsedTime();
                loadPrint(args[0], args[1],  loadTime, recordCount);

                // Symbol Table Search
                System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                employeeID = employeeQuery.nextInt();
                Employee search;
                double searchTime;
                while (employeeID != -1) {
                    Stopwatch searchTimer = new Stopwatch();
                    if (employee_st.contains(employeeID)) {
                        search = employee_st.get(employeeID);
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: " + search);
                    } else {
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: No employee record for id " + employeeID);
                    }
                    System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                    employeeID = employeeQuery.nextInt();
                }
            }
            /*---------------------- LinearProbingHashST ----------------------*/
            else if (symbolTableType.equals("LinearProbingHashST")) {
                // Symbol Table Load
                LinearProbingHashST<Integer, Employee> employee_st =
                        new LinearProbingHashST<>();
                while (fileScanner.hasNextLine()) {
                    String employee_parameter = fileScanner.nextLine();
                    Employee employee = new Employee(employee_parameter);
                    employee_st.put(employee.id, employee);
                    recordCount++;
                }
                loadTime = loadTimer.elapsedTime();
                loadPrint(args[0], args[1],  loadTime, recordCount);

                // Symbol Table Search
                System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                employeeID = employeeQuery.nextInt();
                Employee search;
                double searchTime;
                while (employeeID != -1) {
                    Stopwatch searchTimer = new Stopwatch();
                    if (employee_st.contains(employeeID)) {
                        search = employee_st.get(employeeID);
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: " + search);
                    } else {
                        searchTime = searchTimer.elapsedTime();
                        System.out.println("\tquery time : " + searchTime + " seconds");
                        System.out.println("\tEmployee data: No employee record for id " + employeeID);
                    }
                    System.out.print("\nEnter an employee id to retrieve (-1 to quit): ");
                    employeeID = employeeQuery.nextInt();
                }
            }
            /*----------------------- Incorrect Input -------------------------*/
            else {
                System.out.println("ERROR: A bad Symbol Table (ST) criteria" +
                        " argument has been detected\nST NAMES: SequentialSearchST," +
                        " BinarySearchST, BST, RedBlackBST, SeparateChainingHashST," +
                        " LinearProbingHashST");
                    System.exit(1);
            }
            fileScanner.close();
            System.out.println("\nExiting program.");
        }
        /*---------------------------------------------------------------------*/
        /*----------------------- Incorrect Args Usage ------------------------*/
        /*---------------------------------------------------------------------*/
        else
            System.out.println("ERROR: Incorrect command line execution\n" +
                    "USAGE - GRHEmployees has the following command line arguments syntax:\n" +
                    "\tjava -cp .:algs4.jar GRHEmployees filename STName\n" +
                    "GRHEmployees ARGUMENTS -\n" +
                    "\tfilename:\tThe file containing employee data.\n" +
                    "\t  STName:\tOne of the following strings -" +
                    "\n\t\t\t\tSequentialSearchST, BinarySearchST, BST, RedBlackBST," +
                    "\n\t\t\t\tSeparateChainingHashST, and LinearProbingHashST.\n" +
                    "\t**NOTE**:\tThese must match exactly.\n" +
                    "COMMAND LINE EXAMPLE -\n" +
                    "\tjava -cp .:algs4.jar GRHEmployees employees.csv RedBlackBST\n");    }
}
