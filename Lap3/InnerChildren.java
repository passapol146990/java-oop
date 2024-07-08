class Children extends People implements GoodChild {
    People father;
    People mother;
    String school;
    public String toString(){
        String gender = "Boy";
        if(super.gender == 'F'){
            gender = "Girl";
        }
        return this.name+" "+gender;
    }
    Children(String name,char gender,People father,People mother){
        super(name, gender);
        this.father = father;
        this.mother = mother;
    }
    Children(String name,char gender,String school,People father,People mother){
        super(name, gender);
        this.father = father;
        this.mother = mother;
        this.school = school;
    }
    People getFather(){
        return this.father;
    }
    People getMother(){
        return this.mother;
    }
    String getWorkplace(){
        return "ยังเรียนอยู่เลย"+this.school;
    }
    String equals(People Park){
        if(this.mother == Park){
            return "It's my Mom.";
        }else{
            return "Don't Mom.";
        }
    }
    public String repectTo(People people){
        String x = (this.gender == 'M') ? "ครับ" : "ค่ะ";
        if(people == this.father){
            return "สวัดดี"+x+"คุณพ่อ";
        }else if(people == this.mother){
            return "สวัดดี"+x+"คุณแม่";
        }else{
            return "สวัดดี"+x;
        }
    }
}

interface GoodChild{
    String repectTo(People people);
}
