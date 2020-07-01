package tag3;

class CA31 {
	Number m() {
		return 1;
	}
}

class CA32 extends CA31 {
	Integer m() {
		return 2;
	}
}

public class CA33 {
	public static void main(String[] args) {
		CA32 ca32 = new CA32();
		switch (ca32.m()) {
		case 1:
			break;
		}
		CA31 ca31 = new CA32();
		switch (ca31.m()) {
		case 1:
			break;
		}
	}
}
