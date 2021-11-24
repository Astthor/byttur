public class RunMe {

    public static final String PARTY = "Innflutnings Partý hjá Ara";
    public static void main(String[]args){
        System.out.println("Hung over, still go to party? " + goToParty(PARTY));
    }
    public static boolean goToParty (String whatParty){
        return whatParty == "Innflutnings Partý hjá Ara";
    }
}
