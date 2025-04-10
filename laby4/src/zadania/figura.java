package zadania;

public enum figura {
    dwa("2"),
    trzy("3"),
    cztery("4"),
    piec("5"),
    szesc("6"),
    siedem("7"),
    osiem("8"),
    dziewiec("9"),
    dziesiec("10"),
    walet("Walet"),
    dama("Dama"),
    krol("Krol"),
    as("As");

    final String nazwa;

    figura(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
