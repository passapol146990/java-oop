class Family {
    public static void main(String[] args){
        People beckham = new People("beckham",'M',"Google");
        People victoria = new People("victoria",'F',"Home");
        Children brooklyn = new Children("brooklyn",'M',"MSU",beckham,victoria);
        Children harper = new Children("harper",'F',"MSU",beckham,victoria);
        System.out.println(brooklyn);
        System.out.println(brooklyn.getFather());
        System.out.println(brooklyn.getMother());
        System.out.println(brooklyn.getWorkplace());
        System.out.println(brooklyn.repectTo(beckham));
        System.out.println(harper);
        System.out.println(harper.getFather());
        System.out.println(harper.getMother());
        System.out.println(harper.equals(victoria));
        System.out.println(harper.repectTo(brooklyn));
    }    
}