
interface Room {
	public Room north();

	public Room south();

	public Room east();

	public Room west();
}

public enum Rooms implements Room {

	FIRST {
		public Room north() {
			return SECOND;
		}
	},
	SECOND {
		public Room south() {
			return FIRST;
		}
	};

	@Override
	public Room north() {
		return null;
	}

	@Override
	public Room south() {
		return null;
	}

	@Override
	public Room east() {
		return null;
	}

	@Override
	public Room west() {
		return null;
	}

}
