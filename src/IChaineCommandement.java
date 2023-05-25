public interface IChaineCommandement {
    void setNext(IChaineCommandement next);
    void handleRequest(Ordre ordre);
}
