import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhonesBook {
    static StringBuilder strBldr = new StringBuilder();
    public static void createNum() {
        Pattern pttrn = Pattern.compile("^(\\d{3})(\\d{4})$");
        for (int i = 1000000; i <= 9999999; i++) {
            Matcher mtchr = pttrn.matcher(Integer.toString(i));
            if (mtchr.find()) {
                strBldr.append("+7(988)").append(mtchr.group(1)).append("-").append(mtchr.group(2)).append(";\n");
            }
        }
    }

    public static void takeGoldNum() {
        Pattern pttrn = Pattern.compile("(\\d[7]{2})-([7]{4})");
        Matcher mtchr = pttrn.matcher(strBldr);
        while (mtchr.find()) {
            System.out.println("GOLD!! +7(988)" + mtchr.group(1) + "-" + mtchr.group(2) + " GOLD!!; ");
        }
    }
}
