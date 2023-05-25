public class CCSoldat implements IChaineCommandement {
    private IChaineCommandement next = null;

    @Override
    public void setNext(IChaineCommandement next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Ordre ordre) {
        if (ordre.getNiveau() == ENiveauOrdre.NIVEAU_SOLDAT) {
            ordre.setConclusion("J'exécute l'ordre: " + ordre.getOrdre());
        } else {
            ordre.setConclusion("J'exécute l'ordre, je pose pas de question: " + ordre.getOrdre());
        }
    }
}
