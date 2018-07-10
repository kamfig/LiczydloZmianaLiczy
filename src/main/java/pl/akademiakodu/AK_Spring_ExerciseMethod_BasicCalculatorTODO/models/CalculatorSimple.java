package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

/**
 * Import section
 */
import org.springframework.stereotype.Service;

/**
 * This service is responsible for basic mathematical calculations
 */
@Service
public class CalculatorSimple {

    /**
     * Method calculate mathematical adding of digit
     * @param a user input
     * @param b user input
     * @return sum of a and b
     */
    public int add( int a, int b){
        //todo implement method here
        return a+b;
    }

    /**
     * Method calculate mathematical subtract of digit
     * @param a user input
     * @param b user input
     * @return result of subtraction of a and b
     */
    public int subtract( int a, int b){
        //todo implement method here
        return a-b;
    }

    /**
     * Method calculate mathematical multiplication of digit
     * @param a user input
     * @param b user input
     * @return result of multiplication of a and b
     */
    public int multiplication( int a, int b){
        //todo implement method here
        return a*b;
    }

    /**
     * Method calculate mathematical division of digit
     * @param a user input
     * @param b user input
     * @return result of division of a and b
     */
    public double division (int a, int b) throws IllegalArgumentException{
        //todo implement method here
        if (b==0){
            throw new IllegalArgumentException("Nie można dzielić przez 0");
        }
        double c = 0;
        c= (double)a/(double)b;
        return c;
    }
}
