import java.util.*;

public class Menu {
    //fields
    private static ArrayList<Employee> employeeList = new ArrayList<Employee>();

    //instance methods
    public static void promptMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. List employees");
            System.out.println("4. Determine optimal lunch times");
            System.out.println("--------------------------------------");
            System.out.println("Please choose a number.");

            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        addEmployee();
                        break;
                    case 2:
                        removeEmployee();
                        break;
                    case 3:
                        listEmployees();
                        break;
                    case 4:
                        determineTimes();
                        break;
                    default:
                        System.out.println("That is not a valid choice. Please try again.");
                        break;
                }

            } else {
                System.out.println("You did not enter a number. Please enter a number.");

            }
        }
    }

    public static void addEmployee() {

        //hashmap that maps string times to integer times
        Map<String, Integer> timeFormat = new HashMap<String, Integer>();
        //12am
        String firstHourString = "12am";
        int firstHourInt = 0;
        timeFormat.put(firstHourString, firstHourInt);
        //1am
        String secondHourString = "1am";
        int secondHourInt = 1;
        timeFormat.put(secondHourString, secondHourInt);
        //2am
        String thirdHourString = "2am";
        int thirdHourInt = 2;
        timeFormat.put(thirdHourString, thirdHourInt);
        //3am
        String fourthHourString = "3am";
        int fourthHourInt = 3;
        timeFormat.put(fourthHourString, fourthHourInt);
        //4am
        String fifthHourString = "4am";
        int fifthHourInt = 4;
        timeFormat.put(fifthHourString, fifthHourInt);
        //5am
        String sixthHourString = "5am";
        int sixthHourInt = 5;
        timeFormat.put(sixthHourString, sixthHourInt);
        //6am
        String seventhHourString = "6am";
        int seventhHourInt = 6;
        timeFormat.put(seventhHourString, seventhHourInt);
        //7am
        String eigthHourString = "7am";
        int eigthHourInt = 7;
        timeFormat.put(eigthHourString, eigthHourInt);
        //8am
        String ninthHourString = "8am";
        int ninthHourInt = 8;
        timeFormat.put(ninthHourString, ninthHourInt);
        //9am
        String tenthHourString = "9am";
        int tenthHourInt = 9;
        timeFormat.put(tenthHourString, tenthHourInt);
        //10am
        String eleventhHourString = "10am";
        int eleventhHourInt = 10;
        timeFormat.put(eleventhHourString, eleventhHourInt);
        //11am
        String twelvethHourString = "11am";
        int twelvethHourInt = 11;
        timeFormat.put(twelvethHourString, twelvethHourInt);
        //12pm
        String thirteenthHourString = "12pm";
        int thirteenHourInt = 12;
        timeFormat.put(thirteenthHourString, thirteenHourInt);
        //1pm
        String fourteenthHourString = "1pm";
        int fourteenHourInt = 13;
        timeFormat.put(fourteenthHourString, fourteenHourInt);
        //2pm
        String fifteenthHourString = "2pm";
        int fifteenthHourInt = 14;
        timeFormat.put(fifteenthHourString, fifteenthHourInt);
        //3pm
        String sixteenthHourString = "3pm";
        int sixteenthHourInt = 15;
        timeFormat.put(sixteenthHourString, sixteenthHourInt);
        //4pm
        String seventeenthHourString = "4pm";
        int seventeenthHourInt = 16;
        timeFormat.put(seventeenthHourString, seventeenthHourInt);
        //5pm
        String eigtheenthHourString = "5pm";
        int eighteenthHourInt = 17;
        timeFormat.put(eigtheenthHourString, eighteenthHourInt);
        //6pm
        String nineteenthHourString = "6pm";
        int nineteenthHourInt = 18;
        timeFormat.put(nineteenthHourString, nineteenthHourInt);
        //7pm
        String twentiethHourString = "7pm";
        int twentiethHourInt = 19;
        timeFormat.put(twentiethHourString, twentiethHourInt);
        //8pm
        String twentyFirstHourString = "8pm";
        int twentyFirstHourInt = 20;
        timeFormat.put(twentyFirstHourString, twentyFirstHourInt);
        //9pm
        String twentySecondHourString = "9pm";
        int twentySecondHourInt = 21;
        timeFormat.put(twentySecondHourString, twentySecondHourInt);
        //10pm
        String twentyThirdHourString = "10pm";
        int twentyThirdHourInt = 22;
        timeFormat.put(twentyThirdHourString, twentyThirdHourInt);
        //11pm
        String twentyFourthHourString = "11pm";
        int twentyFourthHourInt = 23;
        timeFormat.put(twentyFourthHourString, twentyFourthHourInt);

        boolean continueAdding = false;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String employeeName = null;
            String employeeStartTime = null;
            String employeeEndTime = null;
            String employeeWantedLunchTime = null;

            while (true) {
                System.out.println("Employee name?");
                boolean hasInt = scanner.hasNextInt();
                if (!hasInt) {
                    employeeName = scanner.nextLine();
                    break;
                } else {
                    System.out.println("You entered a number. Please enter a name.");
                    scanner.nextInt();
                    scanner.nextLine();

                }
            }
            while (true) {
                boolean valid = false;
                System.out.println("Employee start time? Example: 10am, 10pm, 5am, 5pm");
                boolean hasInt = scanner.hasNextInt();
                if (!hasInt) {
                    String choice = scanner.nextLine();
                    if (choice.length() == 3 || choice.length() == 4) {
                        if (choice.length() == 3) {
                            char firstCharacter = choice.charAt(0);
                            char secondCharacter = choice.charAt(1);
                            switch (firstCharacter) {
                                case '1':
                                    valid = true;
                                    break;
                                case '2':
                                    valid = true;
                                    break;
                                case '3':
                                    valid = true;
                                    break;
                                case '4':
                                    valid = true;
                                    break;
                                case '5':
                                    valid = true;
                                    break;
                                case '6':
                                    valid = true;
                                    break;
                                case '7':
                                    valid = true;
                                    break;
                                case '8':
                                    valid = true;
                                    break;
                                case '9':
                                    valid = true;
                                    break;
                                default:
                                    break;

                            }
                            switch (secondCharacter) {
                                case 'a':
                                    valid = true;
                                    break;
                                case 'p':
                                    valid = true;
                                    break;
                                default:
                                    valid = false;
                                    break;
                            }
                        } else if (choice.length() == 4) {
                            char firstCharacter = choice.charAt(0);
                            char secondCharacter = choice.charAt(1);
                            switch (firstCharacter) {
                                case '1':
                                    valid = true;
                                    break;
                                default:
                                    break;
                            }
                            if (valid) {
                                switch (secondCharacter) {
                                    case '0':
                                        break;
                                    case '1':
                                        break;
                                    case '2':
                                        break;
                                    default:
                                        valid = false;
                                        break;
                                }
                            }
                            if (valid) {
                                char thirdCharacter = choice.charAt(2);
                                switch (thirdCharacter) {
                                    case 'a':
                                        break;
                                    case 'p':
                                        break;
                                    default:
                                        valid = false;
                                        break;
                                }
                            }

                        }
                        if (valid) {
                            employeeStartTime = choice;
                            break;
                        } else {
                            System.out.println("The time you entered is not valid. Please try again");
                        }
                    } else {
                        System.out.println("Invalid time format. Please try again.");

                    }

                } else {
                    System.out.println("You entered a number. Please enter a start time.");
                    scanner.nextInt();
                    scanner.nextLine();

                }
            }
            while (true) {
                boolean valid = false;
                System.out.println("Employee end time? Example: 10am, 10pm, 5am, 5pm");
                boolean hasInt = scanner.hasNextInt();
                if (!hasInt) {
                    String choice = scanner.nextLine();
                    if (choice.length() == 3 || choice.length() == 4) {
                        if (choice.length() == 3) {
                            char firstCharacter = choice.charAt(0);
                            char secondCharacter = choice.charAt(1);
                            switch (firstCharacter) {
                                case '1':
                                    valid = true;
                                    break;
                                case '2':
                                    valid = true;
                                    break;
                                case '3':
                                    valid = true;
                                    break;
                                case '4':
                                    valid = true;
                                    break;
                                case '5':
                                    valid = true;
                                    break;
                                case '6':
                                    valid = true;
                                    break;
                                case '7':
                                    valid = true;
                                    break;
                                case '8':
                                    valid = true;
                                    break;
                                case '9':
                                    valid = true;
                                    break;
                                default:
                                    break;

                            }
                            if (valid) {
                                switch (secondCharacter) {
                                    case 'a':
                                        break;
                                    case 'p':
                                        break;
                                    default:
                                        valid = false;
                                        break;
                                }
                            } else {
                                break;
                            }

                        } else if (choice.length() == 4) {
                            char firstCharacter = choice.charAt(0);
                            char secondCharacter = choice.charAt(1);
                            switch (firstCharacter) {
                                case '1':
                                    valid = true;
                                    break;
                                default:
                                    break;
                            }
                            if (valid) {
                                switch (secondCharacter) {
                                    case '0':
                                        break;
                                    case '1':
                                        break;
                                    case '2':
                                        break;
                                    default:
                                        valid = false;
                                        break;
                                }
                            }
                            if (valid) {
                                char thirdCharacter = choice.charAt(2);
                                switch (thirdCharacter) {
                                    case 'a':
                                        break;
                                    case 'p':
                                        break;
                                    default:
                                        valid = false;
                                        break;
                                }
                            }
                        }
                        if (valid) {
                            employeeEndTime = choice;
                            break;
                        } else {
                            System.out.println("The time you entered is not valid. Please try again");
                        }
                    } else {
                        System.out.println("Invalid time format. Please try again.");

                    }

                } else {
                    System.out.println("You entered a number. Please enter a end time.");
                    scanner.nextInt();
                    scanner.nextLine();

                }
            }

            Employee newEmployee = new Employee(employeeName, employeeStartTime, employeeEndTime);
            employeeList.add(newEmployee);
            System.out.println(newEmployee.getName() + " has been added.");
            System.out.println("----------------------------------------------");
            while (true) {
                System.out.println("Do you want to add more employees? (y/n): ");
                boolean hasInt = scanner.hasNextInt();
                if (!hasInt) {
                    String choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        continueAdding = true;
                        break;
                    } else if (choice.equals("n")) {
                        continueAdding = false;
                        break;
                    } else {
                        System.out.println("You did not enter y or n. Please try again.");
                    }

                } else {
                    System.out.println("You entered a number. Please enter y or n.");
                }
            }
            if (!continueAdding) {
                //sort employee list from least to greatest by start time
                if (employeeList.size() > 1) {
                    for (int i = 0; i < employeeList.size() - 1; i++) {
                        int employeeStartTimeInteger = timeFormat.get(employeeList.get(i).getStartTime());
                        for (int x = i + 1; x < employeeList.size(); x++) {
                            int secondEmployeeStartTimeInteger = timeFormat.get(employeeList.get(x).getStartTime());
                            if (employeeStartTimeInteger > secondEmployeeStartTimeInteger) {
                                Employee temp = employeeList.get(i);
                                employeeList.set(i, employeeList.get(x));
                                employeeList.set(x, temp);
                            }

                        }
                    }
                } else {
                    System.out.println("There is only one employee added.");
                }

                break;
            }

        }
    }

    public void printEmployeeInfo() {
        if (!employeeList.isEmpty()) {
            for (int i = 0; i < employeeList.size(); i++) {
                if (employeeList.get(i).getWantedLunchTime() != null) {
                    System.out.println(i + 1 + "." + "Name: " + employeeList.get(i).getName() + "\nStart time: " + employeeList.get(i).getStartTime() + "\nEnd time: " + employeeList.get(i).getEndTime());
                } else {
                    System.out.println(i + 1 + "." + "Name: " + employeeList.get(i).getName() + "\nStart time: " + employeeList.get(i).getStartTime() + "\nEnd time: " + employeeList.get(i).getEndTime() + "\nWanted lunch time: " + employeeList.get(i).getWantedLunchTime());
                }


            }
        } else {
            System.out.println("You did not add any employees.");
        }
    }

    public static void listEmployees() {
        boolean continueChoosing = false;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Employee List");
            for (int i = 0; i < employeeList.size(); i++) {
                System.out.println(i + 1 + "." + employeeList.get(i).getName());
            }
            System.out.println("Choose and print employee information based on number:");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                if (choice > employeeList.size()) {
                    System.out.println("That employee does not exist. Please choose another one.");
                    continue;
                }
                if (employeeList.get(choice - 1) != null) {
                    if (employeeList.get(choice - 1).getWantedLunchTime() == null) {
                        System.out.println("Name: " + employeeList.get(choice - 1).getName() + "\nStart time: " + employeeList.get(choice - 1).getStartTime() + "\nEnd time: " + employeeList.get(choice - 1).getEndTime());
                    } else {
                        System.out.println("Name: " + employeeList.get(choice - 1).getName() + "\nStart time: " + employeeList.get(choice - 1).getStartTime() + "\nEnd time: " + employeeList.get(choice - 1).getEndTime() + "\nWanted lunch time: " + employeeList.get(choice - 1).getWantedLunchTime());
                    }
                } else {
                    System.out.println("That employee does not exist. Please choose another one.");
                }
            } else {
                System.out.println("You did not enter a number. Please try again.");
                scanner.nextLine();

            }
            while (true) {
                System.out.println("Do you want to choose another employee? (y/n): ");
                boolean hasInteger = scanner.hasNextInt();
                if (!hasInteger) {
                    String choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        continueChoosing = true;
                        break;

                    } else if (choice.equals("n")) {
                        continueChoosing = false;
                        break;

                    } else {
                        System.out.println("You did not enter y or n. Please try again.");
                    }
                } else {
                    System.out.println("You entered a number. Please enter y or n.");
                }
            }
            if (!continueChoosing) {
                break;
            }
        }

    }



    public static void determineTimes() {
        Map<String, Double> timeFormat = new HashMap<String, Double>();
        //12am
        String firstHourString = "12am";
        Double firstHourDouble = 0.00;
        timeFormat.put(firstHourString, firstHourDouble);
        //1am
        String secondHourString = "1am";
        Double secondHourDouble = 1.00;
        timeFormat.put(secondHourString, secondHourDouble);
        //2am
        String thirdHourString = "2am";
        Double thirdHourDouble = 2.00;
        timeFormat.put(thirdHourString, thirdHourDouble);
        //3am
        String fourthHourString = "3am";
        Double fourthHourDouble = 3.00;
        timeFormat.put(fourthHourString, fourthHourDouble);
        //4am
        String fifthHourString = "4am";
        Double fifthHourDouble = 4.00;
        timeFormat.put(fifthHourString, fifthHourDouble);
        //5am
        String sixthHourString = "5am";
        Double sixthHourDouble = 5.00;
        timeFormat.put(sixthHourString, sixthHourDouble);
        //6am
        String seventhHourString = "6am";
        Double seventhHourDouble = 6.00;
        timeFormat.put(seventhHourString, seventhHourDouble);
        //7am
        String eigthHourString = "7am";
        Double eigthHourDouble = 7.00;
        timeFormat.put(eigthHourString, eigthHourDouble);
        //8am
        String ninthHourString = "8am";
        Double ninthHourDouble = 8.00;
        timeFormat.put(ninthHourString, ninthHourDouble);
        //9am
        String tenthHourString = "9am";
        Double tenthHourDouble = 9.00;
        timeFormat.put(tenthHourString, tenthHourDouble);
        //10am
        String eleventhHourString = "10am";
        Double eleventhHourDouble = 10.00;
        timeFormat.put(eleventhHourString, eleventhHourDouble);
        //11am
        String twelvethHourString = "11am";
        Double twelvethHourDouble = 11.00;
        timeFormat.put(twelvethHourString, twelvethHourDouble);
        //12pm
        String thirteenthHourString = "12pm";
        Double thirteenHourDouble = 12.00;
        timeFormat.put(thirteenthHourString, thirteenHourDouble);
        //1pm
        String fourteenthHourString = "1pm";
        Double fourteenHourDouble = 13.00;
        timeFormat.put(fourteenthHourString, fourteenHourDouble);
        //2pm
        String fifteenthHourString = "2pm";
        Double fifteenthHourDouble = 14.00;
        timeFormat.put(fifteenthHourString, fifteenthHourDouble);
        //3pm
        String sixteenthHourString = "3pm";
        Double sixteenthHourDouble = 15.00;
        timeFormat.put(sixteenthHourString, sixteenthHourDouble);
        //4pm
        String seventeenthHourString = "4pm";
        Double seventeenthHourDouble = 16.00;
        timeFormat.put(seventeenthHourString, seventeenthHourDouble);
        //5pm
        String eigtheenthHourString = "5pm";
        Double eighteenthHourDouble = 17.00;
        timeFormat.put(eigtheenthHourString, eighteenthHourDouble);
        //6pm
        String nineteenthHourString = "6pm";
        Double nineteenthHourDouble = 18.00;
        timeFormat.put(nineteenthHourString, nineteenthHourDouble);
        //7pm
        String twentiethHourString = "7pm";
        Double twentiethHourDouble = 19.00;
        timeFormat.put(twentiethHourString, twentiethHourDouble);
        //8pm
        String twentyFirstHourString = "8pm";
        Double twentyFirstHourDouble = 20.00;
        timeFormat.put(twentyFirstHourString, twentyFirstHourDouble);
        //9pm
        String twentySecondHourString = "9pm";
        Double twentySecondHourDouble = 21.00;
        timeFormat.put(twentySecondHourString, twentySecondHourDouble);
        //10pm
        String twentyThirdHourString = "10pm";
        Double twentyThirdHourDouble = 22.00;
        timeFormat.put(twentyThirdHourString, twentyThirdHourDouble);
        //11pm
        String twentyFourthHourString = "11pm";
        Double twentyFourthHourDouble = 23.00;
        timeFormat.put(twentyFourthHourString, twentyFourthHourDouble);
        //reverse key-value pair in timeFormat map
        Map<Double, String> timeFormatTwo = new HashMap<Double, String>();
        //12am

        timeFormatTwo.put(firstHourDouble, firstHourString);
        //1am

        timeFormatTwo.put(secondHourDouble, secondHourString);
        //2am

        timeFormatTwo.put(thirdHourDouble, thirdHourString);
        //3am

        timeFormatTwo.put(fourthHourDouble, fourthHourString);
        //4am

        timeFormatTwo.put(fifthHourDouble, fifthHourString);
        //5am

        timeFormatTwo.put(sixthHourDouble, sixthHourString);
        //6am

        timeFormatTwo.put(seventhHourDouble, seventhHourString);
        //7am

        timeFormatTwo.put(eigthHourDouble, eigthHourString);
        //8am

        timeFormatTwo.put(ninthHourDouble, ninthHourString);
        //9am

        timeFormatTwo.put(tenthHourDouble, tenthHourString);
        //10am

        timeFormatTwo.put(eleventhHourDouble, eleventhHourString);
        //11am

        timeFormatTwo.put(twelvethHourDouble, twelvethHourString);
        //12pm

        timeFormatTwo.put(thirteenHourDouble, thirteenthHourString);
        //1pm

        timeFormatTwo.put(fourteenHourDouble, fourteenthHourString);
        //2pm

        timeFormatTwo.put(fifteenthHourDouble, fifteenthHourString);
        //3pm

        timeFormatTwo.put(sixteenthHourDouble, sixteenthHourString);
        //4pm

        timeFormatTwo.put(seventeenthHourDouble, seventeenthHourString);
        //5pm

        timeFormatTwo.put(eighteenthHourDouble, eigtheenthHourString);
        //6pm

        timeFormatTwo.put(nineteenthHourDouble, nineteenthHourString);
        //7pm

        timeFormatTwo.put(twentiethHourDouble, twentiethHourString);
        //8pm

        timeFormatTwo.put(twentyFirstHourDouble, twentyFirstHourString);
        //9pm

        timeFormatTwo.put(twentySecondHourDouble, twentySecondHourString);
        //10pm

        timeFormatTwo.put(twentyThirdHourDouble, twentyThirdHourString);
        //11pm

        timeFormatTwo.put(twentyFourthHourDouble, twentyFourthHourString);
        
        //time format in increments of 15 minutes reversed
        Map<String, Double> timeFormatFifteen = new HashMap<String, Double>();
        //12am
        timeFormatFifteen.put("12am", 0.00);
        timeFormatFifteen.put("12:25am", 0.25);
        timeFormatFifteen.put("12:30am", 0.50);
        timeFormatFifteen.put("12:45am", 0.75);
        //1am
        timeFormatFifteen.put("1am", 1.00);
        timeFormatFifteen.put("1:15am", 1.25);
        timeFormatFifteen.put("1:30am", 1.50);
        timeFormatFifteen.put("1:45am", 1.75);
        //2am
        timeFormatFifteen.put("2am", 2.00);
        timeFormatFifteen.put("2:15am", 2.25);
        timeFormatFifteen.put("2:30am", 2.50);
        timeFormatFifteen.put("2:45am", 2.75);
        //3am
        timeFormatFifteen.put("3am", 3.00);
        timeFormatFifteen.put("3:15am", 3.25);
        timeFormatFifteen.put("3:30am",3.50);
        timeFormatFifteen.put("3:45am",3.75);
        //4am
        timeFormatFifteen.put("4am",4.00);
        timeFormatFifteen.put("4:15am",4.25);
        timeFormatFifteen.put("4:30am",4.50);
        timeFormatFifteen.put("4:45am",4.75);
        //5am
        timeFormatFifteen.put("5am",5.00);
        timeFormatFifteen.put("5:15am",5.25);
        timeFormatFifteen.put("5:30am",5.50);
        timeFormatFifteen.put("5:45am",5.75);
        //6am
        timeFormatFifteen.put("6am",6.00);
        timeFormatFifteen.put("6:15am",6.25);
        timeFormatFifteen.put("6:30am",6.50);
        timeFormatFifteen.put("6:45am",6.75);
        //7am
        timeFormatFifteen.put("7am",7.00);
        timeFormatFifteen.put("7:15am",7.25);
        timeFormatFifteen.put("7:30am",7.50);
        timeFormatFifteen.put("7:45am",7.75);
        //8am
        timeFormatFifteen.put("8am",8.00);
        timeFormatFifteen.put("8:15am",8.25);
        timeFormatFifteen.put("8:30am",8.50);
        timeFormatFifteen.put("8:45am",8.75);
        //9am
        timeFormatFifteen.put("9am",9.00);
        timeFormatFifteen.put("9:15am",9.25);
        timeFormatFifteen.put("9:30am",9.50);
        timeFormatFifteen.put("9:45am",9.75);
        //10am
        timeFormatFifteen.put("10am",10.00);
        timeFormatFifteen.put("10:15am",10.25);
        timeFormatFifteen.put("10:30am",10.50);
        timeFormatFifteen.put("10:45am",10.45);
        //11am,
        timeFormatFifteen.put("11am",11.00);
        timeFormatFifteen.put("11:15am",11.25);
        timeFormatFifteen.put("11:30am",11.50);
        timeFormatFifteen.put("11:45am",11.75);
        //12pm
        timeFormatFifteen.put("12pm",12.00);
        timeFormatFifteen.put("12:15pm",12.25);
        timeFormatFifteen.put("12:30pm",12.50);
        timeFormatFifteen.put("12:45pm",12.75);
        //1pm
        timeFormatFifteen.put("1pm",13.00);
        timeFormatFifteen.put("1:15pm",13.25);
        timeFormatFifteen.put("1:30pm",13.50);
        timeFormatFifteen.put("1:45pm",13.75);
        //2pm
        timeFormatFifteen.put("2pm",14.00);
        timeFormatFifteen.put("2:15pm",14.25);
        timeFormatFifteen.put("2:30pm",14.50);
        timeFormatFifteen.put("2:45pm",14.75);
        //3pm
        timeFormatFifteen.put("3pm",15.00);
        timeFormatFifteen.put("3:15pm",15.25);
        timeFormatFifteen.put("3:30pm",15.50);
        timeFormatFifteen.put("3:45pm",15.75);
        //4pm
        timeFormatFifteen.put("4pm",16.00);
        timeFormatFifteen.put("4:15pm",16.25);
        timeFormatFifteen.put("4:30pm",16.50);
        timeFormatFifteen.put("4:45pm",16.75);
        //5pm
        timeFormatFifteen.put("5pm",17.00);
        timeFormatFifteen.put("5:15pm",17.25);
        timeFormatFifteen.put("5:30pm",17.50);
        timeFormatFifteen.put("5:45pm",17.75);
        //6pm
        timeFormatFifteen.put("6pm",18.00);
        timeFormatFifteen.put("6:15pm",18.25);
        timeFormatFifteen.put("6:30pm",18.50);
        timeFormatFifteen.put("6:45pm",18.75);
        //7pm
        timeFormatFifteen.put("7pm",19.00);
        timeFormatFifteen.put("7:15pm",19.25);
        timeFormatFifteen.put("7:30pm",19.50);
        timeFormatFifteen.put("7:45pm",19.75);
        //8pm
        timeFormatFifteen.put("8pm",20.00);
        timeFormatFifteen.put("8:15pm",20.25);
        timeFormatFifteen.put("8:30pm",20.50);
        timeFormatFifteen.put("8:45pm",20.75);
        //9pm
        timeFormatFifteen.put("9pm",21.00);
        timeFormatFifteen.put("9:15pm",21.25);
        timeFormatFifteen.put("9:30pm",21.50);
        timeFormatFifteen.put("9:45pm",21.75);
        //10pm
        timeFormatFifteen.put("10pm",22.00);
        timeFormatFifteen.put("10:15pm",22.25);
        timeFormatFifteen.put("10:30pm",22.50);
        timeFormatFifteen.put("10:45pm",22.75);
        //11pm
        timeFormatFifteen.put("11pm",23.00);
        timeFormatFifteen.put("11:15pm",23.25);
        timeFormatFifteen.put("11:30pm",23.50);
        timeFormatFifteen.put("11:45pm",23.75);

        //time format in increments of 15 minutes
        Map<Double, String> timeFormatFifteenReversed = new HashMap<Double, String>();
        //12am
        timeFormatFifteenReversed.put(0.00, "12am");
        timeFormatFifteenReversed.put(0.25, "12:15am");
        timeFormatFifteenReversed.put(0.50, "12:30am");
        timeFormatFifteenReversed.put(0.75, "12:45am");
        //1am
        timeFormatFifteenReversed.put(1.00, "1am");
        timeFormatFifteenReversed.put(1.25, "1:15am");
        timeFormatFifteenReversed.put(1.50, "1:30am");
        timeFormatFifteenReversed.put(1.75, "1:45am");
        //2am
        timeFormatFifteenReversed.put(2.00, "2am");
        timeFormatFifteenReversed.put(2.25, "2:15am");
        timeFormatFifteenReversed.put(2.50, "2:30am");
        timeFormatFifteenReversed.put(2.75, "2:45am");
        //3am
        timeFormatFifteenReversed.put(3.00, "3am");
        timeFormatFifteenReversed.put(3.25, "3:15am");
        timeFormatFifteenReversed.put(3.50, "3:30am");
        timeFormatFifteenReversed.put(3.75, "3:45am");
        //4am
        timeFormatFifteenReversed.put(4.00, "4am");
        timeFormatFifteenReversed.put(4.25, "4:15am");
        timeFormatFifteenReversed.put(4.50, "4:30am");
        timeFormatFifteenReversed.put(4.75, "4:45am");
        //5am
        timeFormatFifteenReversed.put(5.00, "5am");
        timeFormatFifteenReversed.put(5.25, "5:15am");
        timeFormatFifteenReversed.put(5.50, "5:30am");
        timeFormatFifteenReversed.put(5.75, "5:45am");
        //6am
        timeFormatFifteenReversed.put(6.00, "6am");
        timeFormatFifteenReversed.put(6.25, "6:15am");
        timeFormatFifteenReversed.put(6.50, "6:30am");
        timeFormatFifteenReversed.put(6.75, "6:45am");
        //7am
        timeFormatFifteenReversed.put(7.00, "7am");
        timeFormatFifteenReversed.put(7.25, "7:15am");
        timeFormatFifteenReversed.put(7.50, "7:30am");
        timeFormatFifteenReversed.put(7.75, "7:45am");
        //8am
        timeFormatFifteenReversed.put(8.00, "8am");
        timeFormatFifteenReversed.put(8.25, "8:15am");
        timeFormatFifteenReversed.put(8.50, "8:30am");
        timeFormatFifteenReversed.put(8.75, "8:45am");
        //9am
        timeFormatFifteenReversed.put(9.00, "9am");
        timeFormatFifteenReversed.put(9.25, "9:15am");
        timeFormatFifteenReversed.put(9.50, "9:30am");
        timeFormatFifteenReversed.put(9.75, "9:45am");
        //10am
        timeFormatFifteenReversed.put(10.00, "10am");
        timeFormatFifteenReversed.put(10.25, "10:15am");
        timeFormatFifteenReversed.put(10.50, "10:30am");
        timeFormatFifteenReversed.put(10.45, "10:45am");
        //11am
        timeFormatFifteenReversed.put(11.00, "11am");
        timeFormatFifteenReversed.put(11.25, "11:15am");
        timeFormatFifteenReversed.put(11.50, "11:30am");
        timeFormatFifteenReversed.put(11.75, "11:45am");
        //12pm
        timeFormatFifteenReversed.put(12.00, "12pm");
        timeFormatFifteenReversed.put(12.25, "12:15pm");
        timeFormatFifteenReversed.put(12.50, "12:30pm");
        timeFormatFifteenReversed.put(12.75, "12:45pm");
        //1pm
        timeFormatFifteenReversed.put(13.00, "1pm");
        timeFormatFifteenReversed.put(13.25, "1:15pm");
        timeFormatFifteenReversed.put(13.50, "1:30pm");
        timeFormatFifteenReversed.put(13.75, "1:45pm");
        //2pm
        timeFormatFifteenReversed.put(14.00, "2pm");
        timeFormatFifteenReversed.put(14.25, "2:15pm");
        timeFormatFifteenReversed.put(14.50, "2:30pm");
        timeFormatFifteenReversed.put(14.75, "2:45pm");
        //3pm
        timeFormatFifteenReversed.put(15.00, "3pm");
        timeFormatFifteenReversed.put(15.25, "3:15pm");
        timeFormatFifteenReversed.put(15.50, "3:30pm");
        timeFormatFifteenReversed.put(15.75, "3:45pm");
        //4pm
        timeFormatFifteenReversed.put(16.00, "4pm");
        timeFormatFifteenReversed.put(16.25, "4:15pm");
        timeFormatFifteenReversed.put(16.50, "4:30pm");
        timeFormatFifteenReversed.put(16.75, "4:45pm");
        //5pm
        timeFormatFifteenReversed.put(17.00, "5pm");
        timeFormatFifteenReversed.put(17.25, "5:15pm");
        timeFormatFifteenReversed.put(17.50, "5:30pm");
        timeFormatFifteenReversed.put(17.75, "5:45pm");
        //6pm
        timeFormatFifteenReversed.put(18.00, "6pm");
        timeFormatFifteenReversed.put(18.25, "6:15pm");
        timeFormatFifteenReversed.put(18.50, "6:30pm");
        timeFormatFifteenReversed.put(18.75, "6:45pm");
        //7pm
        timeFormatFifteenReversed.put(19.00, "7pm");
        timeFormatFifteenReversed.put(19.25, "7:15pm");
        timeFormatFifteenReversed.put(19.50, "7:30pm");
        timeFormatFifteenReversed.put(19.75, "7:45pm");
        //8pm
        timeFormatFifteenReversed.put(20.00, "8pm");
        timeFormatFifteenReversed.put(20.25, "8:15pm");
        timeFormatFifteenReversed.put(20.50, "8:30pm");
        timeFormatFifteenReversed.put(20.75, "8:45pm");
        //9pm
        timeFormatFifteenReversed.put(21.00, "9pm");
        timeFormatFifteenReversed.put(21.25, "9:15pm");
        timeFormatFifteenReversed.put(21.50, "9:30pm");
        timeFormatFifteenReversed.put(21.75, "9:45pm");
        //10pm
        timeFormatFifteenReversed.put(22.00, "10pm");
        timeFormatFifteenReversed.put(22.25, "10:15pm");
        timeFormatFifteenReversed.put(22.50, "10:30pm");
        timeFormatFifteenReversed.put(22.75, "10:45pm");
        //11pm
        timeFormatFifteenReversed.put(23.00, "11pm");
        timeFormatFifteenReversed.put(23.25, "11:15pm");
        timeFormatFifteenReversed.put(23.50, "11:30pm");
        timeFormatFifteenReversed.put(23.75, "11:45pm");
        
        Map<Double, String> timeFormatTwoCombinedTimeFormatReversed = new HashMap<Double, String>();
        //12am
        timeFormatTwoCombinedTimeFormatReversed.put(firstHourDouble, firstHourString);
        //1am

        timeFormatTwoCombinedTimeFormatReversed.put(secondHourDouble, secondHourString);
        //2am

        timeFormatTwoCombinedTimeFormatReversed.put(thirdHourDouble, thirdHourString);
        //3am

        timeFormatTwoCombinedTimeFormatReversed.put(fourthHourDouble, fourthHourString);
        //4am

        timeFormatTwoCombinedTimeFormatReversed.put(fifthHourDouble, fifthHourString);
        //5am

        timeFormatTwoCombinedTimeFormatReversed.put(sixthHourDouble, sixthHourString);
        //6am

        timeFormatTwoCombinedTimeFormatReversed.put(seventhHourDouble, seventhHourString);
        //7am

        timeFormatTwoCombinedTimeFormatReversed.put(eigthHourDouble, eigthHourString);
        //8am

        timeFormatTwoCombinedTimeFormatReversed.put(ninthHourDouble, ninthHourString);
        //9am

        timeFormatTwoCombinedTimeFormatReversed.put(tenthHourDouble, tenthHourString);
        //10am

        timeFormatTwoCombinedTimeFormatReversed.put(eleventhHourDouble, eleventhHourString);
        //11am

        timeFormatTwoCombinedTimeFormatReversed.put(twelvethHourDouble, twelvethHourString);
        //12pm

        timeFormatTwoCombinedTimeFormatReversed.put(thirteenHourDouble, thirteenthHourString);
        //1pm

        timeFormatTwoCombinedTimeFormatReversed.put(fourteenHourDouble, fourteenthHourString);
        //2pm

        timeFormatTwoCombinedTimeFormatReversed.put(fifteenthHourDouble, fifteenthHourString);
        //3pm

        timeFormatTwoCombinedTimeFormatReversed.put(sixteenthHourDouble, sixteenthHourString);
        //4pm

        timeFormatTwoCombinedTimeFormatReversed.put(seventeenthHourDouble, seventeenthHourString);
        //5pm

        timeFormatTwoCombinedTimeFormatReversed.put(eighteenthHourDouble, eigtheenthHourString);
        //6pm

        timeFormatTwoCombinedTimeFormatReversed.put(nineteenthHourDouble, nineteenthHourString);
        //7pm

        timeFormatTwoCombinedTimeFormatReversed.put(twentiethHourDouble, twentiethHourString);
        //8pm

        timeFormatTwoCombinedTimeFormatReversed.put(twentyFirstHourDouble, twentyFirstHourString);
        //9pm

        timeFormatTwoCombinedTimeFormatReversed.put(twentySecondHourDouble, twentySecondHourString);
        //10pm

        timeFormatTwoCombinedTimeFormatReversed.put(twentyThirdHourDouble, twentyThirdHourString);
        //11pm
        timeFormatTwoCombinedTimeFormatReversed.put(twentyFourthHourDouble, twentyFourthHourString);
        //12am
        timeFormatTwoCombinedTimeFormatReversed.put(0.25, "12:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(0.50, "12:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(0.75, "12:45am");
        //1am

        timeFormatTwoCombinedTimeFormatReversed.put(1.25, "1:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(1.50, "1:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(1.75, "1:45am");
        //2am

        timeFormatTwoCombinedTimeFormatReversed.put(2.25, "2:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(2.50, "2:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(2.75, "2:45am");
        //3am

        timeFormatTwoCombinedTimeFormatReversed.put(3.25, "3:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(3.50, "3:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(3.75, "3:45am");
        //4am

        timeFormatTwoCombinedTimeFormatReversed.put(4.25, "4:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(4.50, "4:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(4.75, "4:45am");
        //5am

        timeFormatTwoCombinedTimeFormatReversed.put(5.25, "5:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(5.50, "5:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(5.75, "5:45am");
        //6am

        timeFormatTwoCombinedTimeFormatReversed.put(6.25, "6:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(6.50, "6:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(6.75, "6:45am");
        //7am

        timeFormatTwoCombinedTimeFormatReversed.put(7.25, "7:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(7.50, "7:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(7.75, "7:45am");
        //8am
        timeFormatTwoCombinedTimeFormatReversed.put(8.25, "8:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(8.50, "8:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(8.75, "8:45am");
        //9am

        timeFormatTwoCombinedTimeFormatReversed.put(9.25, "9:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(9.50, "9:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(9.75, "9:45am");
        //10am

        timeFormatTwoCombinedTimeFormatReversed.put(10.25, "10:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(10.50, "10:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(10.45, "10:45am");
        //11am

        timeFormatTwoCombinedTimeFormatReversed.put(11.25, "11:15am");
        timeFormatTwoCombinedTimeFormatReversed.put(11.50, "11:30am");
        timeFormatTwoCombinedTimeFormatReversed.put(11.75, "11:45am");
        //12pm

        timeFormatTwoCombinedTimeFormatReversed.put(12.25, "12:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(12.50, "12:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(12.75, "12:45pm");
        //1pm

        timeFormatTwoCombinedTimeFormatReversed.put(13.25, "1:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(13.50, "1:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(13.75, "1:45pm");
        //2pm

        timeFormatTwoCombinedTimeFormatReversed.put(14.25, "2:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(14.50, "2:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(14.75, "2:45pm");
        //3pm

        timeFormatTwoCombinedTimeFormatReversed.put(15.25, "3:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(15.50, "3:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(15.75, "3:45pm");
        //4pm

        timeFormatTwoCombinedTimeFormatReversed.put(16.25, "4:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(16.50, "4:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(16.75, "4:45pm");
        //5pm

        timeFormatTwoCombinedTimeFormatReversed.put(17.25, "5:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(17.50, "5:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(17.75, "5:45pm");
        //6pm
        timeFormatTwoCombinedTimeFormatReversed.put(18.25, "6:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(18.50, "6:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(18.75, "6:45pm");
        //7pm
        timeFormatTwoCombinedTimeFormatReversed.put(19.00, "7pm");
        timeFormatTwoCombinedTimeFormatReversed.put(19.25, "7:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(19.50, "7:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(19.75, "7:45pm");
        //8pm
        ;
        timeFormatTwoCombinedTimeFormatReversed.put(20.25, "8:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(20.50, "8:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(20.75, "8:45pm");
        //9pm

        timeFormatTwoCombinedTimeFormatReversed.put(21.25, "9:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(21.50, "9:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(21.75, "9:45pm");
        //10pm

        timeFormatTwoCombinedTimeFormatReversed.put(22.25, "10:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(22.50, "10:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(22.75, "10:45pm");
        //11pm

        timeFormatTwoCombinedTimeFormatReversed.put(23.25, "11:15pm");
        timeFormatTwoCombinedTimeFormatReversed.put(23.50, "11:30pm");
        timeFormatTwoCombinedTimeFormatReversed.put(23.75, "11:45pm");




        //local fields
        LinkedHashSet<String> startTimes = new LinkedHashSet<String>();
        LinkedHashSet<String> endTimes = new LinkedHashSet<String>();
        ArrayList<Double> firstBreakHours = new ArrayList<Double>();
        firstBreakHours.add(2.00);
        firstBreakHours.add(2.25);
        firstBreakHours.add(2.50);
        firstBreakHours.add(2.75);
        firstBreakHours.add(3.00);
        ArrayList<Integer> lunchHours = new ArrayList<Integer>();
        lunchHours.add(4);
        lunchHours.add(5);
        lunchHours.add(3);
        ArrayList<Double> secondBreakHours = new ArrayList<Double>();
        secondBreakHours.add(7.00);
        secondBreakHours.add(7.25);
        secondBreakHours.add(7.50);
        secondBreakHours.add(7.75);
        secondBreakHours.add(8.00);


        int numberOfEmployeesClockedIn = 0;
        int minimumWorkingEmployees = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            startTimes.add(employeeList.get(i).getStartTime());
        }

        //copy startTimes hashset into an arraylist
        ArrayList<String> startTimesList = new ArrayList<String>(startTimes);

        //choose minimum amount of employees that need to be working
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a minimum number of employees that need to be working.");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                minimumWorkingEmployees = choice;
                break;
            } else {
                System.out.println("Please enter a number.");

            }
        }


        for (int i = 0; i < startTimesList.size(); i++) {
            //calculate first break for each employee
            for (int a = 0; a < employeeList.size(); a++) {
                if (employeeList.get(a).getStartTime().equals(startTimesList.get(i))) {
                    double startTime = timeFormat.get(employeeList.get(a).getStartTime());
                    Employee employee = employeeList.get(a);
                    for (int n = 0; n < firstBreakHours.size(); n++) {
                        double hoursTilBreak = firstBreakHours.get(n);
                        //find out how many people are clocked in at this specific break time
                        int numberOfEmployeesClockedInAtThisBreakTime = findHowManyPeopleClockedInAtSpecificBreakTime(employee, employeeList, timeFormatFifteenReversed, timeFormat, timeFormatTwo, hoursTilBreak, numberOfEmployeesClockedIn, firstBreakHours, timeFormatFifteen, timeFormatTwoCombinedTimeFormatReversed);
                        if (numberOfEmployeesClockedInAtThisBreakTime > minimumWorkingEmployees) {
                            employeeList.get(a).setHoursTilFirstBreak(hoursTilBreak);
                            double employeeBreakTime = startTime + hoursTilBreak;
                            double employeeEndBreakTime = employeeBreakTime + 0.25;
                            employeeList.get(a).setSuggestedFirstBreak(timeFormatFifteenReversed.get(employeeBreakTime));
                            employeeList.get(a).setEndFirstBreakTime(timeFormatFifteenReversed.get(employeeEndBreakTime));
                            break;
                        }
                    }
                }

            }
            //calculate lunch for each employee
            for (int a = 0; a < employeeList.size(); a++) {
                if (employeeList.get(a).getStartTime().equals(startTimesList.get(i))) {
                    //check to see if this employee has a 7 hour or more shift to be eligible for lunch
                    double startTime = timeFormat.get(employeeList.get(a).getStartTime());
                    double endTime = timeFormat.get(employeeList.get(a).getEndTime());
                    double totalHours = endTime - startTime;
                    if(totalHours >= 7.00){
                        Employee employee = employeeList.get(a);
                        for (int n = 0; n < lunchHours.size(); n++) {
                            int hoursTilLunch = lunchHours.get(n);
                            //find out how many people are clocked in at this specific break time
                            int numberOfEmployeesClockedInAtThisBreakTime = findHowManyPeopleClockedInAtSpecificLunchTime(employee, employeeList,timeFormatTwo, timeFormat, hoursTilLunch, numberOfEmployeesClockedIn, lunchHours,timeFormatFifteen, timeFormatTwoCombinedTimeFormatReversed);
                            numberOfEmployeesClockedIn = numberOfEmployeesClockedInAtThisBreakTime;
                            if (numberOfEmployeesClockedInAtThisBreakTime > minimumWorkingEmployees) {
                                employeeList.get(a).setHoursTilLunch(hoursTilLunch);
                                double employeeLunchTime = startTime + hoursTilLunch;
                                double employeeEndLunchTime = employeeLunchTime + 1;
                                employeeList.get(a).setSuggestedLunchTime(timeFormatFifteenReversed.get(employeeLunchTime));
                                employeeList.get(a).setEndLunchTime(timeFormatFifteenReversed.get(employeeEndLunchTime));
                                break;
                            }
                        }
                    } else {
                        employeeList.get(a).setSuggestedLunchTime("No lunch");
                        employeeList.get(a).setEndLunchTime("No lunch");
                    }
                }
            }


            //calculate second break time for each employee
            for (int a = 0; a < employeeList.size(); a++) {
                if (employeeList.get(a).getStartTime().equals(startTimesList.get(i))) {
                    double startTime = timeFormat.get(employeeList.get(a).getStartTime());
                    double endTime = timeFormat.get(employeeList.get(a).getEndTime());
                    Employee employee = employeeList.get(a);
                    for (int n = 0; n < secondBreakHours.size(); n++) {
                        double hoursTilBreak = secondBreakHours.get(n);
                        double breakTime = startTime + hoursTilBreak;
                        if(breakTime >= endTime){
                            employeeList.get(a).setAlreadyInitialized(true);
                            employeeList.get(a).setSuggestedSecondBreak("No last break");
                            employeeList.get(a).setEndSecondBreakTime("No last break");
                            break;
                        }
                        //find out how many people are clocked in at this specific break time
                        int numberOfEmployeesClockedInAtThisBreakTime = findHowManyPeopleClockedInAtSpecificBreakTime(employee, employeeList, timeFormatFifteenReversed, timeFormat, timeFormatTwo, hoursTilBreak, numberOfEmployeesClockedIn, secondBreakHours, timeFormatFifteen, timeFormatTwoCombinedTimeFormatReversed);
                        numberOfEmployeesClockedIn = numberOfEmployeesClockedInAtThisBreakTime;
                        if (numberOfEmployeesClockedInAtThisBreakTime > minimumWorkingEmployees) {
                            employeeList.get(a).setHoursTilSecondBreak(hoursTilBreak);
                            double employeeBreakTime = startTime + hoursTilBreak;
                            double employeeEndBreakTime = employeeBreakTime + 0.25;
                            double employeeEndTime = timeFormat.get(employeeList.get(a).getEndTime());
                            if(employeeBreakTime >= employeeEndTime){
                                employeeList.get(a).setAlreadyInitialized(true);
                                employeeList.get(a).setSuggestedSecondBreak("No last break");
                                employeeList.get(a).setEndSecondBreakTime("No last break");
                                break;
                            }
                            employeeList.get(a).setSuggestedSecondBreak(timeFormatFifteenReversed.get(employeeBreakTime));
                            employeeList.get(a).setEndSecondBreakTime(timeFormatFifteenReversed.get(employeeEndBreakTime));
                            employeeList.get(a).setAlreadyInitialized(true);
                            break;
                        }
                    }
                }

            }

            //output first break for each employee
            for (int z = 0; z < employeeList.size(); z++) {
                if (!employeeList.get(z).isAlreadyOutputted() && employeeList.get(z).isAlreadyInitialized()) {
                    System.out.println("Name: " + employeeList.get(z).getName() + "\nShift: " + employeeList.get(z).getStartTime() + "-" + employeeList.get(z).getEndTime() + "\nFirst break: " + employeeList.get(z).getSuggestedFirstBreak() + "\nEnd first break: " + employeeList.get(z).getEndFirstBreakTime() + "\nSuggested lunch Time: " + employeeList.get(z).getSuggestedLunchTime() + "\nEnd lunch time: " + employeeList.get(z).getEndLunchTime() + "\nSuggested last break: " + employeeList.get(z).getSuggestedSecondBreak() + "\nEnd last break: " + employeeList.get(z).getEndSecondBreakTime() + "\n-------------------------------------------------------");
                    employeeList.get(z).setAlreadyOutputted(true);
                }


            }
        }


        }





    private static int findHowManyPeopleClockedInAtSpecificBreakTime(Employee employee, ArrayList<Employee> clockedInList, Map<Double, String> timeFormatFifteenReversed, Map<String, Double> timeFormat, Map<Double, String> timeFormatTwo, double hoursTilBreak, int numberOfEmployeesClockedIn, ArrayList<Double> breakHours, Map<String, Double> timeFormatFifteen, Map<Double, String> timeFormatTwoCombinedTimeFormatReversed) {
        //find the employee's break time in string format
        double employeeStartTime = timeFormat.get(employee.getStartTime());
        double employeeBreakTime = employeeStartTime + hoursTilBreak;


        //find out how many people are clocked in at this break time to update the numberOfEmployeesClockedIn variable
        ArrayList<Employee> tempClockedInList = new ArrayList<Employee>();
        for(int i=0; i<clockedInList.size(); i++){
            double testEmployeeStartTime = timeFormat.get(clockedInList.get(i).getStartTime());
            double testEmployeeEndTime = timeFormat.get(clockedInList.get(i).getEndTime());
            if(employeeBreakTime >= testEmployeeStartTime && employeeBreakTime < testEmployeeEndTime){
                tempClockedInList.add(clockedInList.get(i));
            }
            
        }
        //update the numberOfEmployeesClockedIn variable
        numberOfEmployeesClockedIn = findHowManyPeopleClockedInAtThisTime(tempClockedInList, employeeBreakTime,timeFormat, timeFormatTwo, timeFormatFifteen, timeFormatTwoCombinedTimeFormatReversed);
        return numberOfEmployeesClockedIn;
        




    }
    private static int findHowManyPeopleClockedInAtSpecificLunchTime(Employee employee, ArrayList<Employee> clockedInList, Map<Double, String> timeFormatTwo, Map<String, Double> timeFormat, int hoursTilLunch, int numberOfEmployeesClockedIn, ArrayList<Integer> lunchHours, Map<String, Double>timeFormatFifteen, Map<Double, String> timeFormatTwoCombinedTimeFormatReversed) {
        //find the employee's break time in string format
        double employeeStartTime = timeFormat.get(employee.getStartTime());
        double employeeLunchTime = employeeStartTime + hoursTilLunch;
        String employeeLunchTimeString = timeFormatTwo.get(employeeLunchTime);

        ArrayList<Employee> tempClockedInList = new ArrayList<Employee>();


        //find out how many employees are clocked in at this lunch time
        for(int i=0; i<clockedInList.size(); i++) {
            double testEmployeeStartTime = timeFormat.get(clockedInList.get(i).getStartTime());
            double testEmployeeEndTime = timeFormat.get(clockedInList.get(i).getEndTime());
            if(employeeLunchTime >= testEmployeeStartTime && employeeLunchTime < testEmployeeEndTime) {
                tempClockedInList.add(clockedInList.get(i));
            }
        }
        numberOfEmployeesClockedIn = findHowManyPeopleClockedInAtThisTime(tempClockedInList, employeeLunchTime, timeFormat, timeFormatTwo, timeFormatFifteen, timeFormatTwoCombinedTimeFormatReversed);


        return numberOfEmployeesClockedIn;


    }
    private static int findHowManyPeopleClockedInAtThisTime(ArrayList<Employee> clockedInList, double time, Map<String, Double> timeFormat,Map<Double, String> timeFormatTwo, Map<String, Double> timeFormatFifteen, Map<Double, String> timeFormatTwoCombinedTimeFormatReversed){
        LinkedHashSet<Double> times = new LinkedHashSet<Double>();
        int numberOfEmployeesClockedIn = 0;

        for(int i=0; i<clockedInList.size(); i++){
            if(!clockedInList.get(i).getStartTime().equals("")){
                double startTime = timeFormat.get(clockedInList.get(i).getStartTime());
                times.add(startTime);
            } if(!clockedInList.get(i).getSuggestedFirstBreak().equals("")){
                double firstBreak = timeFormatFifteen.get(clockedInList.get(i).getSuggestedFirstBreak());
                times.add(firstBreak);
            } if(!clockedInList.get(i).getEndFirstBreakTime().equals("")){
                double endFirstBreak = timeFormatFifteen.get(clockedInList.get(i).getEndFirstBreakTime());
                times.add(endFirstBreak);
            } if(!clockedInList.get(i).getSuggestedLunchTime().equals("") && !clockedInList.get(i).getSuggestedLunchTime().equals("No lunch")){
                double lunchTime = timeFormat.get(clockedInList.get(i).getSuggestedLunchTime());
                times.add(lunchTime);
            } if(!clockedInList.get(i).getEndLunchTime().equals("") && !clockedInList.get(i).getEndLunchTime().equals("No lunch")){
                double endLunchTime = timeFormat.get(clockedInList.get(i).getEndLunchTime());
                times.add(endLunchTime);
            } if(!clockedInList.get(i).getSuggestedSecondBreak().equals("") && !clockedInList.get(i).getSuggestedSecondBreak().equals("No last break")){
                double secondBreak = timeFormatFifteen.get(clockedInList.get(i).getSuggestedSecondBreak());
                times.add(secondBreak);
            } if(!clockedInList.get(i).getEndSecondBreakTime().equals("") && !clockedInList.get(i).getEndSecondBreakTime().equals("No last break")){
                double endSecondBreak = timeFormatFifteen.get(clockedInList.get(i).getEndSecondBreakTime());
                times.add(endSecondBreak);
            } if(!clockedInList.get(i).getEndTime().equals("")){
                double endTime = timeFormat.get(clockedInList.get(i).getEndTime());
                times.add(endTime);
            }
        }
        times.add(time);
        String stringTime = timeFormatTwoCombinedTimeFormatReversed.get(time);
        //copy contents of times hashSet into an arraylist
        ArrayList<Double> timesList = new ArrayList<Double>(times);

        //sort timesList arrayList in incremental order
        for(int i=0; i<timesList.size()-1; i++){
            for(int x=i+1; x<timesList.size(); x++){
                if(timesList.get(i) > timesList.get(x)){
                    double temp = timesList.get(i);
                    timesList.set(i, timesList.get(x));
                    timesList.set(x, temp);
                }
            }
        }

        //convert doubles from timesList into strings
        ArrayList<String> timesListString = new ArrayList<String>();
        for(int i=0; i<timesList.size(); i++){
            String timeString = timeFormatTwoCombinedTimeFormatReversed.get(timesList.get(i));
            timesListString.add(timeString);
        }

        //find out how many people are clocked in at this time
        for(int i=0; i<timesListString.size(); i++){
            for(int x=0; x<clockedInList.size(); x++){
                if(clockedInList.get(x).getStartTime().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn += 1;
                } else if(clockedInList.get(x).getSuggestedFirstBreak().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn -= 1;
                } else if(clockedInList.get(x).getEndFirstBreakTime().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn += 1;
                } else if(clockedInList.get(x).getSuggestedLunchTime().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn -=1;
                } else if(clockedInList.get(x).getEndLunchTime().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn += 1;
                } else if(clockedInList.get(x).getSuggestedSecondBreak().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn -= 1;
                } else if(clockedInList.get(x).getEndSecondBreakTime().equals(timesListString.get(i))){
                    numberOfEmployeesClockedIn += 1;
                }
            }
            if(timesListString.get(i).equals(stringTime)){
                break;
            }
        }
        return numberOfEmployeesClockedIn;




    }


    public static void removeEmployee() {
        while (true) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < employeeList.size(); i++) {
                    System.out.println(i + 1 + "." + employeeList.get(i).getName());
                }
                System.out.println("Please choose a number.");
                boolean hasInt = scanner.hasNextInt();
                if (hasInt) {
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    if (employeeList.get(choice - 1) != null) {
                        System.out.println(employeeList.get(choice - 1).getName() + " has been removed.");
                        employeeList.remove(choice - 1);
                        break;
                    } else {
                        System.out.println("That employee does not exist. Please try again.");
                    }
                } else {
                    System.out.println("You did not enter a number. Please try again.");
                }
            }
            boolean removeAnotherEmployee = false;
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Do you want to remove another employee? (y/n): ");
                boolean hasInt = scanner.hasNextInt();
                if (!hasInt) {
                    String choice = scanner.nextLine();
                    if (choice.equals("y")) {
                        removeAnotherEmployee = true;
                        break;
                    } else if (choice.equals("n")) {
                        break;
                    } else {
                        System.out.println("You did not enter y or n. Please try again.");
                    }
                } else {
                    System.out.println("You entered a number. Please enter y or n.");
                    scanner.nextInt();
                    scanner.nextLine();

                }
            }
            if (!removeAnotherEmployee) {
                break;
            }
        }
    }



}



