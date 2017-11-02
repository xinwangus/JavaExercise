/* BuggyClockHands.java
 *
 * Given a time, calculate the angle
 * between two hands (Hour and Minute) in 
 * an analog clock.
 * 
 * Please find all bugs in this program
 * hint: it does not have any syntex error.
 */

public class BuggyClockHands
{
	public static void main(String[] args) {
		int a = getAngle(3, 40);
		System.out.println("Angle at 3:40 is: " + a);
		// Output: Angle at 3:40 is: 150
	}

	public static int getAngle(int hour,
                                   int min) {
		// Minute hand moves 360/60 = 6 degrees every min
		int min_hand_angle = min * 6;

		// Hour hand moves 360/12 = 30 degrees every hour
		int hour_hand_angle = hour * 30;

		int angle = (min_hand_angle - hour_hand_angle);
		return angle;
	}
}
