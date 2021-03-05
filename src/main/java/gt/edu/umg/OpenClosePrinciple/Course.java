package gt.edu.umg.OpenClosePrinciple;

import java.util.Locale;

public class Course {
    public static String course(String assignment) {
        switch (assignment.toLowerCase(Locale.ROOT)) {
            case "math":
                return "15 credits in math class";
            case "language":
                return "20 credits in language class";
            case "science":
                return "25 credits in science class";
            case "history":
                return "30 credits in history class";
            case "domotic":
                return "35 credits in domotic class";
            default:
                return "NO credits, you dont have a class";
        }
    }
}
