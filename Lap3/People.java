class People{
    String name;
    char gender;
    String workplace;
    public String toString(){
        return this.name;
    }
    People(String Name,char Gender){
        this.name = Name;
        this.gender = Gender;
    }   
    People(String Name,char Gender,String Workplace){
        this.name = Name;
        this.gender = Gender;
        this.workplace = Workplace;
    }
    String getWorkplace(){
        return this.workplace;
    }
}

