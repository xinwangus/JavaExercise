/* ClockHands.java
 *
 * Given a time, calculate the angle
 * between two hands (Hour and Minute) in 
 * an analog clock.
 */

public class ClockHands
{
	public static void main(String[] args) {
		int a = getAngle(3, 40);
		if (a >= 0) {
			System.out.println("Angle at 3:40 is: " + a);
		}
	}

	// no unsigned keyward in Java
        // no const in Java	
	// Java method arguments pass by value
	public static int getAngle(int hour,
                                   int min) {
		if ((hour < 0) || (min < 0)) {
			return -1;
		}
		if ((hour >= 24) || (min >= 60)) {
			return -1;
		}

		// convert to 12 hour format.
		int h = hour % 12;

		// Minute hand moves 360/60 degrees every min
		int min_hand_angle = (min*6);

		// Hour hand moves 360/12 = 30 degrees every hour
		// plus the minute portion (min/60)*30.
		int hour_hand_angle = 
			(h*30) + 
                	(int)(min/2); /* could be off by .5 */

		int angle = (min_hand_angle >= hour_hand_angle) ?
			(min_hand_angle - hour_hand_angle) :
			(hour_hand_angle - min_hand_angle);

		// only return the smaller angle
		if (angle > 180) {
			angle = (360 - angle);
		}
		return angle;
	}
}
