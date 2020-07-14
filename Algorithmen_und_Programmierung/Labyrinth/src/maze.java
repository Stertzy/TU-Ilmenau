import java.util.Stack;

public class maze {

	static final char N = 'N'; // North
	static final char E = 'E'; // East
	static final char S = 'S'; // South
	static final char W = 'W'; // West
	static final char[] NESW = { N, E, S, W }; // array of directions
	static final char Z = 'Z'; // Target position

	// data of maze
	static int[][] maze = { { 2, 6, 12, 12, 10, 6, 10, 4, 12, 10 }, { 5, 9, 6, 8, 5, 9, 5, 12, 10, 3 },
			{ 6, 8, 7, 12, 12, 14, 8, 6, 9, 3 }, { 7, 10, 3, 2, 6, 9, 6, 9, 4, 11 },
			{ 3, 5, 9, 3, 5, 12, 9, 4, 14, 11 }, { 3, 6, 10, 7, 12, 12, 14, 14, 9, 3 },
			{ 3, 1, 7, 9, 6, 10, 1, 3, 4, 9 }, { 5, 10, 5, 8, 3, 5, 10, 5, 12, 10 },
			{ 2, 5, 12, 12, 9, 2, 5, 12, 12, 11 }, { 5, 12, 12, 12, 12, 13, 12, 12, 12, 9 } };

	static int h = maze.length; // height of the maze
	static int w = maze[0].length; // width of the maze

	static int s_x = 0; // start at this x-coordinate
	static int s_y = 0; // start at this y-coordinate
	static int t_x = w - 1; // destination is at this x-coordinate
	static int t_y = h - 1; // destination is at this y-coordinate

	// this flag can show howt the algorithm works
	static boolean superDebug = false;

	// set set superDebug flag
	public static void setSuperDebug(boolean val) {
		superDebug = val;
	}

	/// set a waypoint for the given position (x, y)
	public static void setWaypoint(int x, int y) {
		maze[y][x] |= 16;
	}

	/// unset a waypoint for the given position (x, y)
	public static void unsetWaypoint(int x, int y) {
		maze[y][x] &= 15;
	}

	/// return true iff (if and only if) there is a waypoint set for the given
	/// position (x, y)
	public static boolean isWaypoint(int x, int y) {
		return (maze[y][x] & 16) != 0;
	}

	/// return true iff we can move from the given position (x, y) into the given
	/// direction
	public static boolean check(int x, int y, char	 dir) {
		int cell = maze[y][x];
		switch (dir) {
		case N:
			return (cell & 1) != 0;
		case S:
			return (cell & 2) != 0;
		case E:
			return (cell & 4) != 0;
		case W:
			return (cell & 8) != 0;
		default:
			System.out.println("Error: Unknown direction!");
			return false;
		}
	}

	public static void display() {
		for (int i = 0; i < h; i++) {
			// draw the north edge
			for (int j = 0; j < w; j++) {
				System.out.print((maze[i][j] & 1) == 0 ? "+---" : "+   ");
			}
			System.out.println("+");
			// draw the west edge and waypoints
			for (int j = 0; j < w; j++) {
				String d = (maze[i][j] & 8) == 0 ? "| " : "  ";
				d += (maze[i][j] & 16) != 0 ? "*" : " ";
				d += " ";
				System.out.print(d);
			}
			System.out.println("|");
		}
		// draw the bottom line
		for (int j = 0; j < w; j++) {
			System.out.print("+---");
		}
		System.out.println("+");
	}

	// aucilary method
	static void pushPosStack(Stack<int[]> posStack, int x, int y, char direction) {
		int p[] = new int[2];
		p[0] = x;
		p[1] = y;

		// it is not necessary to store the endpoint once more
		if (direction != Z) {
			// store position
			posStack.push(p);
		}
		if (superDebug) {
			System.out.println("#" + direction + ":\tposStack.size()=" + posStack.size() + "\tx=" + x + ",\ty=" + y);
			display();
		}
	}

	/// return true if there is a path from (s_x, s_y) to (t_x, t_y)
	/// if yes: additionally set waypoints for one possible path

	public static boolean search() {
		// solution flag
		boolean result = false;

		// flag for impossible solution
		boolean noResult = false;

		Stack<int[]> posStack = new Stack<int[]>();

		int x = 0;
		int y = 0;
		setWaypoint(x, y);
		pushPosStack(posStack, x, y, '0');

		int cnt = 0;

		// iteration
		while (!(result || noResult) && (++cnt < 100000)) {
			if (superDebug) {
				System.out.println("");
			}

			// target position is reached?
			result = (x == t_x && y == t_y);

			if (result) {
				pushPosStack(posStack, x, y, Z);
			} else if (check(x, y, N) && searchRec(x, y - 1)) {
				pushPosStack(posStack, x, --y, N);
			} else if (check(x, y, E) && searchRec(x + 1, y)) {
				pushPosStack(posStack, ++x, y, E);
			} else if (check(x, y, S) && searchRec(x, y + 1)) {
				pushPosStack(posStack, x, ++y, S);
			} else if (check(x, y, W) && searchRec(x - 1, y)) {
				pushPosStack(posStack, --x, y, W);
			} else if (posStack.empty()) {
				// There is no solution at all.
				noResult = true;
				if (superDebug) {
					System.err.println("The Stack is empty! There is no path at all (noResult=true)");
				}
			} else {
				// There is no path: Go to the position before!
				posStack.pop();
				int p1[] = posStack.peek();
				x = p1[0];
				y = p1[1];
				if (superDebug) {
					System.out.println("#--\tposStack.size()=" + posStack.size() + "\tx=" + x + ",\ty=" + y);
					// display();
				}
			}
		}
		;

		// beautify result:

		// 1st delete old traces
		for (int i = 0; i < h; i++) {
			// draw the north edge
			for (int j = 0; j < w; j++) {
				unsetWaypoint(i, j);
			}
		}

		// copy the final solution form stack into maze
		int sSize = posStack.size();
		int p[] = null;
		for (int i = 0; i < sSize; i++) {
			p = posStack.get(i);
			setWaypoint(p[0], p[1]);
		}

		return result;
	}

	/// helper method for a recursive solution
	public static boolean searchRec(int x, int y) {
		boolean result = !isWaypoint(x, y);
		if (result) {
			setWaypoint(x, y);
		}

		return result;
	}

	public static void main(String[] args) {
		setSuperDebug(true);

		display();
		System.out.println(search());
		display();
	}
}
