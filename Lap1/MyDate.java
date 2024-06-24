class MyDate{
    int day;
    int month;
    int year;
    MyDate(){
        day = 1;
        month = 1;
        year = 2020;
    }
    MyDate(int Day,int Month,int Year){
        day = Day;
        month = Month;
        year = Year;
    }
    void setDay(int d){
        if(d<=31){
            day = d;
        }else{
            System.out.println("Error: setDay is number Day > 31!!!");
        }
    }
    void setMonth(int m){
        if(m<=12){
            month = m;
        }else{
            System.out.println("Error: setMonth is number Month > 12!!!");
        }
    }
    void setYear(int y){
        year = y;
    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getYear(){
        return year;
    }
    void print(){
        System.out.printf("%d/%d/%d\n",getDay(),getMonth(),getYear());
    }
}





