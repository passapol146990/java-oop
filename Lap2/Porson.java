import java.util.ArrayList;
class Porson {
    String name;
    char gender;
    private String telno;
    Porson fan;
    ArrayList<Porson> gig= new ArrayList<Porson>();

    Porson(String Name){
        this.name = Name;
    }
    Porson(String Name,char Gender,String Telno){
        this.name = Name;
        this.gender = Gender;
        this.telno = Telno;
    }
    public String toString(){
        return this.name;
    }
    void setGender(char g){
        this.gender = g;
    }
    void setTol(String t){
        this.telno = t;
    }
    String setFan(Porson f){
        if(f.gender != this.gender && this.fan != null){
            this.fan = f;
            return "success";
        }else{
            if(this.fan == null){
                return "change fan Not now.";
            }else{
                return "Noooooo!";
            }
        }
    }
    void setGig(Porson g){
        if(this.gig.size() < 2){
            this.gig.add(g);
        }else{
            System.out.printf("set gig error! length Gig = %d\n",this.gig.size());
        }
    }
    void removeGig(int index){
        this.gig.remove(index-1);
    }
    void removeGig(String name){
        for(int i=0; i<this.gig.size(); i++){
            if(this.gig.get(i).name==name){
                this.gig.remove(i);
                break;
            }
        }
    }
    void removeGigAll(){
        this.gig.clear();
    }
    String getPorsonInfi(){
        String text = "================================================\n"; 
        text += "name: "+this.name+"\ngender: "+this.gender+"\ntel: "+this.telno+"\nFan: "+this.fan;
        for(int i=0;i<this.gig.size();i++){
            text += "\nGig: "+this.gig.get(i).name;
        }
        text += "\n================================================";
        return text;
    }
    void getGig(Porson p){
        if(this.gender == p.gender){
            for(Porson s : this.gig){
                System.out.println(s);
            }
        }else{
            System.out.printf("Don't have gig.");
        }
    }
    String getPhone(Porson p){
        if(p.gender != this.gender){
            return this.telno;
        }else{
            return "Not tal";
        }
    }
    String getFan(Porson p){
        if(p != this.fan){
            return "Don't have a fan";
        }else{
            return "I have a fan";
        }
    }
}
