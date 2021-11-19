public class SortMain {
    public static void main(String[] args) {
        // Start application with args parse
        if (args.length > 0){
            switch (args[0]) {
                case "-h":
                case "-H":
                case "--help":
                case "--Help":
                    showHelp();
                    break;
                case "-v":
                case "-V":
                case "--version":
                    showVersion();
                    break;
                default:
                    // Application start from here.
                    if (checkElement(args)) {
                        int[] argsInt = argsConvertInt(args);
                        Sorter s1 = new Sorter(argsInt);
                        int[] sortedList=s1.toSort();
                        for(int i : sortedList){
                            System.out.print(i+", ");
                        }

                    }
            }
        }
    }

    public static int[] argsConvertInt(String[] args) {
        // This method convert user value from String to Integer.
        int argsInt[] = new int[args.length];
        for(int i=0;i<args.length;i++){
            argsInt[i]=Integer.parseInt(args[i]);
        }
        return argsInt;
    }

    public static boolean checkElement(String[] args) {
        // This method start to checking user array list.
        // If find one element that is not integer, then sent a message for user and wants to try again with only numeric value.
        for(String el : args){
            if(!(isNumeric(el))){
                System.out.println("value "+el+", that you entered is not an integer.");
                System.out.println("Please try again with list of numbers.");
                return false;
            }
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        // This method with regular expression check that parameter is an integer value or no.
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static void showVersion() {
        // This method print out the version of application and some more information.
        System.out.println();
        System.out.println("Java programming course, EC-Utbildning, Goteborg");
        System.out.println("Sort application, version: 1.0");
        System.out.println("Developed by: MohammadHossein Labafbashi");
    }

    public static void showHelp() {
        // This method print out help menu for user.
        System.out.println("Usage: SortMain [-h] [-v] numbers_list");
        System.out.println();
        System.out.println("Description: This program get a list of integer numbers and show you the sorted list.");
        System.out.println();
        System.out.println("Optional arguments:");
        System.out.println("\t -h, --help \t\t\t show this help message and exit.");
        System.out.println("\t -v, --version \t\t\t show program's version number and exit.");
        System.out.println();
        System.out.println("Example:");
        System.out.println("\t java SortMain 76 11 -55 2 16 -21 7 88");
        System.out.println("\t -55 -21 2 7 11 16 76 88");
    }
}
