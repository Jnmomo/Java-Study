class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Time(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}

	public void setTime(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}

	public void printTime() {
		System.out.println(hour + ":" + minute + ":" + second);
	}

	public void tick(int i) {
		for (int j = 1; j <= i; j++) {
			second++;
			if (second > 59) {
				second = 0;
				minute++;
				if (minute > 59) {
					minute = 0;
					hour++;
					if (hour > 23)
						hour = 0;
				}

			}

		}

	}

}
