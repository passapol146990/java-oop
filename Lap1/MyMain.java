class MyMain {
    public static void main(String []args){
        MyDate date1 = new MyDate();
        date1.setDay(8);
        date1.setMonth(1);
        date1.setYear(2021);
        date1.print();
        
        MyDate date2 = new MyDate(5,1,2021);
        date2.print();
    }
}
