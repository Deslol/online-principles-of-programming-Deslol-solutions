
/*
 * Modify the code below so that
 *
 * 1. So that numbers less than 10 are padded when printed
 * i.e. 01 : 59 : 59 rather than 1 : 59 : 59
 *
 * 2. So that the time includes miliseconds
 * e.g. 01 : 59 : 59 : 999
 */

public class Week4Lesson2 {

    public static String padNumber(int number, int limit) {
        if (number < 10 && limit <= 60 || 100 > number && number >= 10 && limit > 60) return "0" + number;
        else if (number < 10 && limit > 60) return "00" + number;
        else return "" + number;
    }

    public static void main(String[] args) {
        Counter hours = new Counter(24, 1);
        Counter mins = new Counter(60, 59);
        Counter sec = new Counter(60, 58);
        Counter ms = new Counter(1000, 1);


        int i = 0;
        while (i < 1001) {
            System.out.println(padNumber(hours.getCount(), 60) + " : " +
                    padNumber(mins.getCount(), 60) + " : " +
                    padNumber(sec.getCount(), 60) + " : " +
                    padNumber(ms.getCount(), 1000)
            );

            ms.tick();
//            if (ms.getCount().equals("000")) {
//                sec.tick();
//                if (sec.getCount().equals("00")) {
//                    mins.tick();
//                    if (mins.getCount().equals("00")) {
//                        hours.tick();
//                    }
//                }
//            }
            if (ms.getCount() == 0) {
                sec.tick();
                if (sec.getCount() == 0) {
                    mins.tick();
                    if (mins.getCount() == 0) {
                        hours.tick();
                    }
                }
            }
            i++;
        }
    }
}
