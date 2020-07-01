package exceptions;


class CastleUnderSiegeException extends Exception {}

class KnightAttackingException extends CastleUnderSiegeException {}

public class Citadel {

	@SuppressWarnings("finally")
	public void openDrawbridge() throws RuntimeException, Exception {
		try {
			throw new KnightAttackingException();
		} catch (Exception e) {
			throw new ClassCastException();
		} finally {
			throw new CastleUnderSiegeException();
		}
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
			new Citadel().openDrawbridge();
	}

}
