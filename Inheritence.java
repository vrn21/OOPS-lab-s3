interface Sports {
    float sportwt = 6;
    abstract void putwt();
    
}

class Student{
    int rollNo = 0;
    int getRollNo() {
        return rollNo;
    }
    void putRollNo(int a){
        this.rollNo = a;
    }
}

class Test extends Student{
    float term1 = 0;
    float term2 = 0;
    float getTerm1() {
        return term1;
    }
    float getTerm2() {
        return term2;
    }
    void putTerm1(float a){
        term1 = a;
    }
    void putTerm2(float a){
        term2 = a;
    }
}


class Results  extends Test  implements Sports {
    public void putwt(){
        putRollNo(12);
        System.out.println("Rollno: "+ getRollNo());
        System.out.println("Marks Obtained");
        putTerm1(27);
        putTerm2(33);
        System.out.println("Term 1 : "+ getTerm1());
        System.out.println("Term 2 =  " +getTerm2());
        System.out.println("Sports Weightage  " + sportwt);
        float result = getTerm1() + getTerm2() + sportwt;
        System.out.println("Total score = " +result );
    }
}

class Inheritence{
    public static void main(String[] args) {
        Results r = new Results();
        r.putwt();
    }
   
}

