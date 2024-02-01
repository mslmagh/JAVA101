package OBS;

public class Teacher {
    String name;
    String mpno;
    String branch;

   public Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

   public void printf(){
        System.out.println("Adı: "+ this.name);
        System.out.println("Bölümü: "+ this.branch);
        System.out.println("Telefonu: "+ this.mpno);
    }
}
