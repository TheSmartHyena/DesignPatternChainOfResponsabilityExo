public class Ordre {
    private ENiveauOrdre niveau = null;
    private String ordre = "";

    private String conclusion = "";

    public Ordre(ENiveauOrdre niveau, String ordre) {
        this.niveau = niveau;
        this.ordre = ordre;
    }

    public ENiveauOrdre getNiveau() {
        return niveau;
    }

    public void setNiveau(ENiveauOrdre niveau) {
        this.niveau = niveau;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getOrdre() {
        return ordre;
    }

    public void setOrdre(String ordre) {
        this.ordre = ordre;
    }
}
