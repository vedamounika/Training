public class CustomerDetails {
    // Define all attributes here (all variables as given in question)


    // define method here
    public boolean validateCustomerId(String customerId){
        // write conditions to check if it matching pattern (First word should be incredible then / then a 3 digit number then / then 4 digit number)
        // Tips for logic : 1. Split the string based on '/'
        // 2. Then store it in array and read first element of array and check if its matching with word incredible
        //3. If step 2 is true then check the second element of array has length 3 and isNumeric or not using (String.isNumeric() method)
        //4. If step 3 is true then check the second element of array has length 4 and isNumeric or not
        //5. 2&3&4 should be true to return true at end of method , if any one of them fails then we should return false as method output.
        return false; // change this value (true or false) based on logic
    }


    //define main method to read values from input and invoke validation method
    public static void main(String args[]) {
        // Take Scanner class object
        //Print Enter Customer Id
        //Read value from input
        // Print Enter Customer Name
        // Read value from input
        // do like this till you read all inputs till price
        // Invoke method using customerId (customerId comes from input and stored in variable at Line #:17)
    }
}
