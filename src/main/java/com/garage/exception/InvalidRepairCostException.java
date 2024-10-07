
package com.garage.exception;

// Custom exception thrown when an invalid repair cost is encountered.
public class InvalidRepairCostException extends Exception {
    public InvalidRepairCostException(String message) {
        // Pass the error message to the Exception class
        super(message);
    }
}
