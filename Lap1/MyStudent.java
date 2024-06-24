class MyStudent {
    public static void main(String []args){
        Student p1 = new Student("passapol", "2067", null);
        p1.print();
        Student p2 = new Student("passapol", "2067",p1);
        p2.print();
    }    
}
