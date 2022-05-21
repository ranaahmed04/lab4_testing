package com.company;

public class stub {
    public boolean checkseconds(int seconds,int minutes,int hours) {
        if (seconds == 60) {
            minutes++;

            checkminutes(minutes, hours);
            return true;
        } else {
            return false;
        }
    }
    public void checkminutes(int minutes,int hours)
        {
            if (minutes == 60)
            {
                minutes = 0 ;
            } hours ++;
            checkhours(hours);
        }

    public Object checkhours(int hours){
        if(hours==24){
            hours=0;
        }
        return null;
    }
}
