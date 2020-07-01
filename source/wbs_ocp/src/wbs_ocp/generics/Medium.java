package wbs_ocp.generics;

class Medium implements Comparable<Medium> {
    String inventarNummer;
    String titel;

    public Medium(String inventarNummer, String titel) {
            this.inventarNummer = inventarNummer;
            this.titel = titel;
    }

    @Override
    public int compareTo(Medium medium) {
            // TODO
            // wir vergleichen aufsteigend nach der inventarNummer
            return 0;
    }

    @Override
    public String toString() {
            return "Medium [inventarNummer=" + inventarNummer + ", titel=" + titel + "]";
    }
}

class Buch extends Medium {
    String isbn;

    public Buch(String inventarNummer, String titel, String isbn) {
            super(inventarNummer, titel);
            this.isbn = isbn;
    }

    @Override
    public String toString() {
            return "Buch [isbn=" + isbn + ", inventarNummer=" + inventarNummer + ", titel=" + titel + "]";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Buch))
			return false;
		Buch other = (Buch) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
    
    
}