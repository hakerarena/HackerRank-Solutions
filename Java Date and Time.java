 /*Code provided by hakerarenatutorials.wordpress.com*/
 /* Below is only the required findDay() function */
 
 public static String findDay(int month, int day, int year) 
    {
        Calendar myClass=Calendar.getInstance();
        myClass.set(year,month-1,day);
        int date=myClass.get(Calendar.DAY_OF_WEEK);
        date--;
        if(date==0)
            date=7;
        String getDate=new String();
        switch(date)
        {
            case 1: getDate="MONDAY"; break;
            case 2: getDate="TUESDAY"; break;
            case 3: getDate="WEDNESDAY"; break;
            case 4: getDate="THURSDAY"; break;
            case 5: getDate="FRIDAY"; break;
            case 6: getDate="SATURDAY"; break;
            case 7: getDate="SUNDAY"; break;
        }
        return getDate;
    }
