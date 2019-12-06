package com.company;

import java.util.Comparator;

public class TitleLastAndDepthComparator implements Comparator<QuakeEntry> {

    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String title1 = q1.getInfo();
        String title2 = q2.getInfo();

        String sub1 = title1.substring(title1.lastIndexOf(" ")+1);
        String sub2 = title2.substring(title2.lastIndexOf(" ")+1);

        int result = sub1.compareTo(sub2);

        if(result == 0) {
            double depth1 = q1.getMagnitude();
            double depth2 = q2.getMagnitude();

            if(depth1 > depth2) {
                return 1;
            }
            if(depth1 < depth2){
                return -1;
            }

            return 0;
        }

        if(result < 0){
            return -1;
        } else {
            return 1;
        }
    }
}
