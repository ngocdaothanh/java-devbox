package dsa.recursion;

import javax.sound.sampled.ReverbType;
import java.util.Objects;

public class Palindrome {
    boolean palindrome(String s) {
        ReverseString reversedString = new ReverseString();
        return Objects.equals(reversedString.reverseString(s), s);
    }
}
