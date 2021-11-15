//Declare a static and a non static variable and display its values. State the observation
class Simple {
    static String empName = "John Doe"; // class member variable
    String companyName = "XYZ"; // instance member variable

    public static void main(String args[]) {
        Simple obj = new Simple();
        System.out.println("Employee Name:" + Simple.empName);
        System.out.println("Company Name:" + obj.companyName);
    }

}
/*
 * 1) Static identifies a variable/function as a class variable/function It
 * means that the variable/function cannot be called through instance of a class
 * but rather the class itself. 
 * here: Simple.empName
 * System.out.println("Employee Name:" + obj.empName); will display error:
 *          "The static field Simple.empName should be accessed in a static way"
 * 2) Instance memebers are non-static and only exist within instanse of the class. 
 * Company name is an instance variable, has to be accessed by creating an
 * object/instance of the class. 
 * here:obj.companyName
 * System.out.println("Company Name:" + companyName); will display error:
 *          "Cannot make a static reference to the non-static field companyName"
 */
