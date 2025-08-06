public class CondicionActuo implements Condicion {
    private Actor actor;

    public boolean cumple(ElemUn e) {
        return e.getActores().contains(actor);
    }
}
