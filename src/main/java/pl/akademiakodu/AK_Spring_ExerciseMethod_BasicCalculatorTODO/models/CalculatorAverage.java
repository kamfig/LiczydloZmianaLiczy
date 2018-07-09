package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

/**
 * Import section
 */
import org.springframework.stereotype.Service;

/**
 * This service is responsible for average mathematical calculations
 */
@Service
public class CalculatorAverage {

    /**
     * Method calculate mathematical square of digit
     * @param a user input
     * @return square of a
     */
    public int squareOf(int a){
        //todo implement method
        return a*a;
    }

    /**
     * Method calculate mathematical element of digit
     * @param a user input
     * @return element of a
     */
    public int elementOf(int a){
        int sum=1;
        for (int i = 0; i <a ; i++) {
            sum+=i;
        }
        return sum;
    }

    /**
     * Method calculate mathematical factorial of digit
     * @param a user input
     * @return factorial of a
     */
    public int factorial(int a){
        int i=1, s=1;
        while(i<=a){
            s=s*i;
            i++;
        }
        return s;
    }

    /**
     * Method check if digit is a prime number
     * @param a user input
     * @return result
     */
    public boolean isPrimeNumber(int a){
        {
            if(a<2)
                return false; //gdy liczba jest mniejsza niż 2 to nie jest pierwszą

            for(int i=2;i*i<=a;i++)
                if(a%i==0)
                    return false; //gdy znajdziemy dzielnik, to dana liczba nie jest pierwsza
            return true;
        }
    }

}
