import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheCleaner {
    String cleantext = "";
    public void textclean() {
        String text = "<er>Бла бла бла!</er>НУЖНЫЙ текст <er>надо удалить</er>оставить<er>Тра ля ля</er>";
        Pattern pttrn = Pattern.compile("<er>.*?</er>");
//      что ищем pttrn ("<er>.*?</er>") где ищем (text) //
        Matcher mtchr = pttrn.matcher(text);
//      Метод boolean find() ищет в тексте совпадение с шаблоном //
        while (mtchr.find()) {
//          Методы int start() и int end() дают номера начал и концов совпадения //
            int start = mtchr.start();
            int end = mtchr.end();
            System.out.println("Found: " + text.substring(start, end) + " from " + start + " to " + end);
        }
        System.out.println("\n Cleaning the text... \n");
        System.out.println(mtchr.replaceAll(" * "));
        cleantext = mtchr.replaceAll("");
        System.out.println(cleantext);
    }

    public void textreplace() {
/*      String text = "First Second Third";
        System.out.println(text);
        Pattern pttrn = Pattern.compile("(.*) (.*) (.*)");
        Matcher mtchr = pttrn.matcher(text);
        System.out.println(mtchr.replaceFirst("$3 $2 $1"));
*/
        System.out.println(cleantext);
        Pattern pttrn = Pattern.compile("(.*) (.*) (.*)");
        Matcher mtchr = pttrn.matcher(cleantext);
        System.out.println(mtchr.replaceFirst("$3 $1 $3"));
    }

}