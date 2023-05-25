public class Main {
    public static void main(String[] args) {
        Ordre ordre = new Ordre(ENiveauOrdre.NIVEAU_SOLDAT, "Faire le ménage");

        IChaineCommandement ccgeneral = new CCGeneral();
        IChaineCommandement ccofficier = new CCOfficier();
        IChaineCommandement ccsousofficier = new CCSousOfficier();
        IChaineCommandement ccsoldat = new CCSoldat();

        ccgeneral.setNext(ccofficier);
        ccofficier.setNext(ccsousofficier);
        ccsousofficier.setNext(ccsoldat);

        ccgeneral.handleRequest(ordre);
        System.out.println(ordre.getConclusion());

    }
}