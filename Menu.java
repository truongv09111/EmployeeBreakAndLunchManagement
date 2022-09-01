import java.util.*;

public class Menu {
    //fields
    private static ArrayList<Employee> employeeList = new ArrayList<Employee>();



    //instance methods
    public static void promptMenu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Add employee");
            System.out.println("2. Remove employee");
            System.out.println("3. List employees");
            System.out.println("4. Determine optimal lunch times");
            System.out.println("--------------------------------------");
            System.out.println("Please choose a number.");

            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
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
                        determineOptimalLunchTime();
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
        boolean continueAdding = false;
        while(true){
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
                if(choice.length() == 3 || choice.length() == 4){
                    if(choice.length() == 3){
                        char firstCharacter = choice.charAt(0);
                        char secondCharacter = choice.charAt(1);
                        switch(firstCharacter){
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
                        switch(secondCharacter){
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
                    } else if (choice.length() == 4){
                        char firstCharacter = choice.charAt(0);
                        char secondCharacter = choice.charAt(1);
                        switch(firstCharacter){
                            case '1':
                                valid = true;
                                break;
                            default:
                                break;
                        }
                        if(valid) {
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
                        if(valid){
                            char thirdCharacter = choice.charAt(2);
                            switch(thirdCharacter){
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
                    if(valid){
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
                    if(choice.length() == 3 || choice.length() == 4){
                        if(choice.length() == 3){
                            char firstCharacter = choice.charAt(0);
                            char secondCharacter = choice.charAt(1);
                            switch(firstCharacter){
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
                            if(valid){
                                switch(secondCharacter){
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

                        } else if (choice.length() == 4){
                            char firstCharacter = choice.charAt(0);
                            char secondCharacter = choice.charAt(1);
                            switch(firstCharacter){
                                case '1':
                                    valid = true;
                                    break;
                                default:
                                    break;
                            }
                            if(valid) {
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
                            if(valid){
                                char thirdCharacter = choice.charAt(2);
                                switch(thirdCharacter){
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
                        if(valid){
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
            while(true) {
                System.out.println("Do you want to add more employees? (y/n): ");
                boolean hasInt = scanner.hasNextInt();
                if (!hasInt) {
                    String choice = scanner.nextLine();
                    if(choice.equals("y")){
                        continueAdding = true;
                        break;
                    } else if(choice.equals("n")){
                        continueAdding = false;
                        break;
                    }else{
                        System.out.println("You did not enter y or n. Please try again.");
                    }

                } else {
                    System.out.println("You entered a number. Please enter y or n.");
                }
            }
            if(!continueAdding){
                break;
            }

        }
    }
    public void printEmployeeInfo(){
        if(!employeeList.isEmpty()){
            for(int i=0; i<employeeList.size(); i++){
                if(employeeList.get(i).getWantedLunchTime() != null) {
                    System.out.println(i + 1 + "." + "Name: " + employeeList.get(i).getName() + "\nStart time: " + employeeList.get(i).getStartTime() + "\nEnd time: " + employeeList.get(i).getEndTime());
                } else {
                    System.out.println(i + 1 + "." + "Name: " + employeeList.get(i).getName() + "\nStart time: " + employeeList.get(i).getStartTime() + "\nEnd time: " + employeeList.get(i).getEndTime() + "\nWanted lunch time: " + employeeList.get(i).getWantedLunchTime());
                }



            }
        } else {
            System.out.println("You did not add any employees.");
        }
    }
    public static void listEmployees(){
        boolean continueChoosing = false;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Employee List");
            for(int i=0; i<employeeList.size(); i++){
                System.out.println(i+1 + "." + employeeList.get(i).getName());
            }
            System.out.println("Choose and print employee information based on number:");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                int choice = scanner.nextInt();
                scanner.nextLine();
                if(choice > employeeList.size()){
                    System.out.println("That employee does not exist. Please choose another one.");
                    continue;
                }
                if(employeeList.get(choice-1) != null){
                    if(employeeList.get(choice-1).getWantedLunchTime() == null) {
                        System.out.println("Name: " + employeeList.get(choice-1).getName() + "\nStart time: " + employeeList.get(choice-1).getStartTime() + "\nEnd time: " + employeeList.get(choice-1).getEndTime());
                    } else {
                        System.out.println("Name: " + employeeList.get(choice-1).getName() + "\nStart time: " + employeeList.get(choice-1).getStartTime() + "\nEnd time: " + employeeList.get(choice-1).getEndTime() + "\nWanted lunch time: " + employeeList.get(choice-1).getWantedLunchTime());
                    }
                } else{
                    System.out.println("That employee does not exist. Please choose another one.");
                }
            } else {
                System.out.println("You did not enter a number. Please try again.");
                scanner.nextLine();

            }
            while(true){
                System.out.println("Do you want to choose another employee? (y/n): ");
                boolean hasInteger = scanner.hasNextInt();
                if(!hasInteger){
                    String choice = scanner.nextLine();
                    if(choice.equals("y")){
                        continueChoosing = true;
                        break;

                    } else if(choice.equals("n")){
                        continueChoosing = false;
                        break;

                    } else {
                        System.out.println("You did not enter y or n. Please try again.");
                    }
                } else {
                    System.out.println("You entered a number. Please enter y or n.");
                }
            }
            if(!continueChoosing){
                break;
            }
        }

    }
    public static void determineOptimalLunchTime(){
        Map<String, Integer> timeFormat = new HashMap<String, Integer>();
        //12am
        String firstHourString = "12am";
        int firstHourInt = 0;
        timeFormat.put(firstHourString,firstHourInt);
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
        timeFormat.put(twentyFirstHourString,twentyFirstHourInt);
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
        //reverse key-value pair in timeFormat map
        Map<Integer, String> timeFormatTwo = new HashMap<Integer, String>();
        //12am
        
        timeFormatTwo.put(firstHourInt, firstHourString);
        //1am
        
        timeFormatTwo.put(secondHourInt, secondHourString);
        //2am
        
        timeFormatTwo.put(thirdHourInt, thirdHourString);
        //3am
        
        timeFormatTwo.put(fourthHourInt, fourthHourString);
        //4am
        
        timeFormatTwo.put(fifthHourInt, fifthHourString);
        //5am
        
        timeFormatTwo.put(sixthHourInt, sixthHourString);
        //6am
       
        timeFormatTwo.put(seventhHourInt, seventhHourString);
        //7am
        
        timeFormatTwo.put(eigthHourInt, eigthHourString);
        //8am
        
        timeFormatTwo.put(ninthHourInt, ninthHourString);
        //9am
        
        timeFormatTwo.put(tenthHourInt, tenthHourString);
        //10am
        
        timeFormatTwo.put(eleventhHourInt, eleventhHourString);
        //11am
        
        timeFormatTwo.put(twelvethHourInt, twelvethHourString);
        //12pm
        
        timeFormatTwo.put(thirteenHourInt, thirteenthHourString);
        //1pm
        
        timeFormatTwo.put(fourteenHourInt, fourteenthHourString);
        //2pm
        
        timeFormatTwo.put(fifteenthHourInt, fifteenthHourString);
        //3pm
        
        timeFormatTwo.put(sixteenthHourInt, sixteenthHourString);
        //4pm
        
        timeFormatTwo.put(seventeenthHourInt, seventeenthHourString);
        //5pm
        
        timeFormatTwo.put(eighteenthHourInt, eigtheenthHourString);
        //6pm
        
        timeFormatTwo.put(nineteenthHourInt, nineteenthHourString);
        //7pm
        
        timeFormatTwo.put(twentiethHourInt, twentiethHourString);
        //8pm
        
        timeFormatTwo.put(twentyFirstHourInt, twentyFirstHourString);
        //9pm
        
        timeFormatTwo.put(twentySecondHourInt, twentySecondHourString);
        //10pm
        
        timeFormatTwo.put(twentyThirdHourInt, twentyThirdHourString);
        //11pm
        
        timeFormatTwo.put(twentyFourthHourInt, twentyFourthHourString);

        //time format in increments of 15 minutes
        Map<Double, String> timeFormatFifteenReversed = new HashMap<Double,String>();
        //12am
        timeFormatFifteenReversed.put(0.00,"12am");
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





        //local fields
        LinkedHashSet<String> startTimes = new LinkedHashSet<String>();
        LinkedHashSet<String> endTimes = new LinkedHashSet<String>();
        String chosenStartTime = "";
        String chosenEndTime = "";
        String currentTime = "";
        boolean timeConflict = false;
        boolean firstBreakTimeConflict = false;
        boolean secondBreakTimeConflict = false;
        int numberOfEmployeesClockedIn = 0;
        int minimumWorkingEmployees = 0;
        for(int i=0; i< employeeList.size(); i++){
            startTimes.add(employeeList.get(i).getStartTime());
        }
        for(int i=0; i< employeeList.size(); i++){
            endTimes.add(employeeList.get(i).getEndTime());
        }

        //choose the current time
        while (true) {
            Scanner scanner = new Scanner(System.in);
            boolean valid = false;
            System.out.println("Choose the current hour: Example: 10am, 10pm, 5am, 5pm");
            boolean hasInt = scanner.hasNextInt();
            if (!hasInt) {
                String choice = scanner.nextLine();
                if(choice.length() == 3 || choice.length() == 4){
                    if(choice.length() == 3){
                        char firstCharacter = choice.charAt(0);
                        char secondCharacter = choice.charAt(1);
                        switch(firstCharacter){
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
                        if(valid){
                            switch(secondCharacter){
                                case 'a':
                                    break;
                                case 'p':
                                    break;
                                default:
                                    valid = false;
                                    break;
                            }
                        }
                    } else if (choice.length() == 4){
                        char firstCharacter = choice.charAt(0);
                        char secondCharacter = choice.charAt(1);
                        switch(firstCharacter){
                            case '1':
                                valid = true;
                                break;
                            default:
                                break;
                        }
                        if(valid) {
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
                        if(valid){
                            char thirdCharacter = choice.charAt(2);
                            switch(thirdCharacter){
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
                    if(valid){
                        currentTime = choice;
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

        //check how many people are clocked in at the chosen shift time
        for(int i=0; i<employeeList.size(); i++){
            int timeRightNow = timeFormat.get(currentTime);
            int startTime = timeFormat.get(employeeList.get(i).getStartTime());
            int endTime = timeFormat.get(employeeList.get(i).getEndTime());
            if(timeRightNow >= startTime && timeRightNow < endTime){
                numberOfEmployeesClockedIn += 1;
                System.out.println(employeeList.get(i).getName() + " is clocked in."); //test code
            }
        }
        System.out.println("Number of employees clocked in at " + currentTime + ": " + numberOfEmployeesClockedIn);
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a minimum number of employees that need to be working.");
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                int choice = scanner.nextInt();
                scanner.nextLine();
                if(choice < numberOfEmployeesClockedIn){
                    minimumWorkingEmployees = choice;
                    break;

                } else {
                    System.out.println("The minimum number of employees you chose is more than the current employees that are clocked in right now. Please choose an amount that is less than the current number of employees clocked in.");
                }
            } else {
                System.out.println("Please enter a number.");

            }
        }

        //calculate first break
        int employeesGoingToBreakAtSameTime = numberOfEmployeesClockedIn - minimumWorkingEmployees;
        ArrayList<String> startTimesList = new ArrayList<String>(startTimes);
        int countFirstBreak;
        for(int i=0; i<startTimesList.size(); i++){
            ArrayList<Double> firstBreakHours = new ArrayList<Double>();
            countFirstBreak = 0;
            firstBreakHours.add(2.00);
            firstBreakHours.add(2.25);
            firstBreakHours.add(2.50);
            firstBreakHours.add(2.75);
            firstBreakHours.add(3.00);
            for(int x=0; x<employeeList.size(); x++){
                if(firstBreakHours.isEmpty()){
                    firstBreakTimeConflict = true;
                    break;
                }
                if(startTimesList.get(i).equals(employeeList.get(x).getStartTime())){
                    employeeList.get(x).setHoursTilFirstBreak(firstBreakHours.get(0));
                    countFirstBreak += 1;
                    if(countFirstBreak == employeesGoingToBreakAtSameTime){
                        firstBreakHours.remove(0);
                        countFirstBreak = 0;
                    }

                }
            }
            if(firstBreakTimeConflict){
                break;
            }
        }
        if(firstBreakTimeConflict) {
            System.out.println("The number of employees and the current shift times are in conflict. Cannot determine first break times.");
        } else {
            //set the suggested first break based on the hoursTilFirstBreak for each employee
            for(int i=0; i<employeeList.size(); i++){
                int startTime = timeFormat.get(employeeList.get(i).getStartTime());
                double firstBreakTime = startTime + employeeList.get(i).getHoursTilFirstBreak();
                employeeList.get(i).setSuggestedFirstBreak(timeFormatFifteenReversed.get(firstBreakTime));
            }
        }

        //calculate lunch times
        int employeesGoingToLunchSameTime = numberOfEmployeesClockedIn - minimumWorkingEmployees;
        for(int i=0; i<startTimesList.size(); i++){
            int count = 0;
            ArrayList<Integer> lunchHours = new ArrayList<Integer>();
            lunchHours.add(4);
            lunchHours.add(5);
            lunchHours.add(3);
            for(int x=0; x<employeeList.size(); x++){
                if(lunchHours.isEmpty()){
                    timeConflict = true;
                    break;
                }
                if(startTimesList.get(i).equals(employeeList.get(x).getStartTime())){
                    count += 1;
                    employeeList.get(x).setHoursTilLunch(lunchHours.get(0));
                    if(count == employeesGoingToLunchSameTime){
                        lunchHours.remove(0);
                        count = 0;
                    }
                }
            }
            if(timeConflict) {
                break;
            }
        }

        if(timeConflict){
            System.out.println("The number of employees and the current shift times are in conflict. Cannot determine lunch times.");
        } else {
            //determine lunch times based on hoursTilLunch for each employee
            for (int i = 0; i < employeeList.size(); i++) {
                int startTime = timeFormat.get(employeeList.get(i).getStartTime());
                int lunchTime = startTime + employeeList.get(i).getHoursTilLunch();
                employeeList.get(i).setSuggestedLunchTime(timeFormatTwo.get(lunchTime));
            }
        }

        //calculate second break
        int countSecondBreak;
        for(int i=0; i<startTimesList.size(); i++){
            ArrayList<Double> secondBreakHours = new ArrayList<Double>();
            countSecondBreak = 0;
            secondBreakHours.add(7.00);
            secondBreakHours.add(7.25);
            secondBreakHours.add(7.50);
            secondBreakHours.add(7.75);
            secondBreakHours.add(8.00);
            for(int x=0; x<employeeList.size(); x++){
                if(secondBreakHours.isEmpty()){
                    secondBreakTimeConflict = true;
                    break;
                }
                if(startTimesList.get(i).equals(employeeList.get(x).getStartTime())){
                    employeeList.get(x).setHoursTilSecondBreak(secondBreakHours.get(0));
                    countSecondBreak += 1;
                    if(countSecondBreak == employeesGoingToBreakAtSameTime){
                        secondBreakHours.remove(0);
                        countSecondBreak = 0;
                    }

                }
            }
            if(secondBreakTimeConflict){
                break;
            }
        }
        if(secondBreakTimeConflict) {
            System.out.println("The number of employees and the current shift times are in conflict. Cannot determine second break times.");
        } else {
            //set the suggested second break based on the hoursTilSecondBreak for each employee
            for(int i=0; i<employeeList.size(); i++){
                int startTime = timeFormat.get(employeeList.get(i).getStartTime());
                double secondBreakTime = startTime + employeeList.get(i).getHoursTilSecondBreak();
                employeeList.get(i).setSuggestedSecondBreak(timeFormatFifteenReversed.get(secondBreakTime));
            }
        }

        //output employee's name, shift, first break, lunch time, and second break
        for(int i=0; i<employeeList.size(); i++){
            System.out.println("Name: " + employeeList.get(i).getName() + "\nShift: " + employeeList.get(i).getStartTime() + "-" + employeeList.get(i).getEndTime() + "\nSuggested first break: " + employeeList.get(i).getSuggestedFirstBreak() + "\nSuggested lunch time: " + employeeList.get(i).getSuggestedLunchTime() + "\nSuggested last break: " + employeeList.get(i).getSuggestedSecondBreak());
        }
    }
    public static void removeEmployee(){
        while(true) {
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


