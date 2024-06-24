class Student {
    String name;
    String id;
    Student classMate;
    Student(String Name,String Id,Student ClassMate){
        name = Name;
        id = Id;
        classMate = ClassMate;
    }
    void print(){
        System.out.printf("name: %s\nid: %s\nclassMate: %s\n",name,id,classMate);
    }
}
