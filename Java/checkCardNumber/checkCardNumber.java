boolean checkCardNumber(String str){

    // Regex to check valid
    //Visa American Express MasterCard UnionPay
    String regex = "^4[0-9]{12}(?:[0-9]{3})?$||^(62[0-9]{14,17})$||^3[47][0-9]{13}$||^3[47][0-9]{13}$||^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$" ;

    // Compile the ReGex
    Pattern p = Pattern.compile(regex);

    // If the string is empty return false
    if (str == null) {
        return false;
    }


    // Find match between given string and regular expression
    //using Pattern.matcher()
    Matcher m = p.matcher(str);


    // Return if the string matched the ReGex
    return m.matches();
}