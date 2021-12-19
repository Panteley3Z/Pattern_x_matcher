public class Main {
    public static void main(String[] args) {
        TheCleaner thecleaner = new TheCleaner();
        thecleaner.textclean();
        System.out.println("\n Next: reorderind the text: \n");
        thecleaner.textreplace();
        PhonesBook.createNum();
        PhonesBook.takeGoldNum();
    }
}
