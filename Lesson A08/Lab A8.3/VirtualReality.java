/**
 * 
 * @author Brandon Ong
 * period: #3
 */

public class VirtualReality {
	// Instance variables and constants go here
	private double TargetFrameTime;
	private double frame0;
	private double frame1;
	private double frame2;
	private double qualityLevel;
	private final double LOW_THRESHOLD;
	private final double EXTRAPOLATE_THRESHOLD;
	private final double HIGH_THRESHOLD;

	/**
	 * Constructor to initialize the three previous frame processing times, current
	 * quality level of the video, and the target frame time It also initializes all
	 * the threshold values
	 * 
	 * @param f0
	 *            - processing time for frame 0 (two frames ago) in ms
	 * @param f1
	 *            - processing time for frame 1 (frame before last) in ms
	 * @param f2
	 *            - processing time for frame 2 (last frame) in ms
	 * @param ql
	 *            - quality level of the video (ranges from 1 to 10)
	 * @param frames
	 *            - desired frames per second pre-condition: 1 <= ql <= 10
	 *            pre-condition: f0, f1, f2 > 0
	 */
	public VirtualReality(double f0, double f1, double f2, double ql, double frames) {
		// Your code goes here
		frame0=f0;
		frame1=f1;
		frame2=f2;
		qualityLevel=ql;
		TargetFrameTime=1000.0/frames;
		LOW_THRESHOLD = 0.7 * TargetFrameTime;
		EXTRAPOLATE_THRESHOLD = 0.7 * TargetFrameTime;
		HIGH_THRESHOLD = 0.9 * TargetFrameTime;
	}

	/**
	 * Returns the y coordinate of the extrapolated point using linear extrapolation
	 * of two data points (x1, y1) and (x2, y2)
	 * 
	 * @param x1
	 *            - x coordinate of the first known data point
	 * @param y1
	 *            - y coordinate of the first known data point
	 * @param x2
	 *            - x coordinate of the second known data point
	 * @param y2
	 *            - y coordinate of the second known data point
	 * @param x
	 *            - x coordinate of the extrapolated point
	 * @return - y coordinate of the extrapolated point
	 */
	private double extrapolate(double x1, double y1, double x2, double y2, double x) {
		// Your code goes here
		return y1 + ((x - x1) / (x2 - x1)) * (y2 - y1);

	}

	/**
	 * Implements the adaptive quality algorithm to minimize reprojection
	 */
	private void adaptiveQualityAlgorithm() {
		// Your code goes here
		if (frame2 > HIGH_THRESHOLD) {
			qualityLevel-=2;

		} else if (frame2 > EXTRAPOLATE_THRESHOLD) {
			double a = extrapolate(1, frame1, 2, frame2, 3);
			double b = extrapolate(0, frame0, 2, frame2, 3);
			double c = Math.max(a, b);
			if (c > HIGH_THRESHOLD) {
				qualityLevel -= 2;
			}
		}

		else if ((frame0 < LOW_THRESHOLD) && (frame1 < LOW_THRESHOLD) && (frame2 < LOW_THRESHOLD)) {
			++qualityLevel;
		}
else{
   qualityLevel=qualityLevel;
}
	}

	/**
	 * Calculates the adjusted quality level by applying the adaptive quality
	 * algorithm
	 * 
	 * @return the adjusted quality level
	 */
	public double getAdjustedQualityLevel() {
		// Your code goes here
		adaptiveQualityAlgorithm();
		return qualityLevel;

	}
}





