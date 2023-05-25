public class CCGeneral implements IChaineCommandement {
    private IChaineCommandement next = null;

    @Override
    public void setNext(IChaineCommandement next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Ordre ordre) {
        if (ordre.getNiveau() == ENiveauOrdre.NIVEAU_GENERAL) {
            ordre.setConclusion("J'exécute l'ordre: " + ordre.getOrdre());
        } else {
            if (next != null){
                next.handleRequest(ordre);
            }
        }
    }
}
