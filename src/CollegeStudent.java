public class CollegeStudent extends Student{
    private String profession;
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String toString(){
        return super.toString()+"专业为："+profession;
    }
    public static void main(String a[]){
        CollegeStudent c1=new CollegeStudent();
        c1.setProfession("软件工程");
        System.out.println(c1);
    }
}
