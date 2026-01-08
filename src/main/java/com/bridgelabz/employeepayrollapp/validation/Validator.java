package com.bridgelabz.employeepayrollapp.validation;

import com.bridgelabz.employeepayrollapp.exception.ValidationException;
import java.util.regex.Pattern;

public class Validator {
    // validation for Employee Id eg. EMP-0001 to EMP-9999
    public static void validateEmpId(String empId) throws ValidationException {
        String regex = "EMP-\\d{4}";
        if (!Pattern.matches(regex, empId))
            throw new ValidationException("Incorrect Employee Id Format");
    }

    // validation for name eg. Abi/Abhi -> should be at least 3 letters and starts with a capital letter
    public static void validateName(String name) throws ValidationException {
        String regex = "^[A-Z]{1}[a-zA-Z\\s]{2,}$";
        if (!Pattern.matches(regex, name))
            throw new ValidationException("Incorrect Name Format");
    }

    // validation for email eg. abi_sheak@bridgelabz.com
    public static void validateEmail(String email) throws ValidationException {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!Pattern.matches(regex, email))
            throw new ValidationException("Incorrect Email Format");
    }

    // validation for phone number eg. 9876543211 -> should be 10 digits and follow Indian phone number format
    public static void validatePhone(String phone) throws ValidationException {
        String regex = "^[6-9]\\d{9}$";
        if (!Pattern.matches(regex, phone))
            throw new ValidationException("Incorrect Phone Number Format");
    }
}
