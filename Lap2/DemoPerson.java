class DemoPerson {
    public static void main(String []args){
        Porson p1 = new Porson("deme");
        Porson p2 = new Porson("ken",'m',"0920000002");
        Porson p3 = new Porson("ploy");
        Porson p4 = new Porson("may",'f',"0920000004");
        Porson p5 = new Porson("ann",'f',"0920000005");
        Porson p6 = new Porson("fon",'m',"0920000006");

        p1.setGender('m');
        p1.setTol("0920000001");
        p3.setGender('f');
        p3.setTol("0920000003");

        // System.out.println(p1.getPhone(p3));
        p1.setFan(p3);
        // System.out.println(p1.fan);
        
        // System.out.println(p2.getPhone(p1));
        // p2.setFan(p1);
        // System.out.println(p2.fan);

        // System.out.println(p1.getFan(p4));
        // System.out.println(p1.getFan(p3));
        
        // System.out.println(p1.setFan(p4));

        p1.setGig(p4);
        p1.setGig(p5);
        
        // p1.getGig(p2);
        // p1.removeGig(2);
        // p1.removeGig("may");
        // p1.removeGigAll();
        // p1.getGig(p2);
        System.out.println(p1.getPorsonInfi());
        // p1.getGig(p4);
    }    
}





