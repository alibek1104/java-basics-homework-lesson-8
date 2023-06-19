import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Average {

    double firstNum;
    double secondNum;
    double thirdNum;

    public Average(double firstNum, double secondNum, double thirdNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.thirdNum = thirdNum;
    }

    public double getAverageNum() {
        return (firstNum + secondNum + thirdNum) / 3;
    }
}

