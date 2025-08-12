public class grade {
    public grade(int score){
        if(score <= 100 && 90 <= score){
            System.out.println("A");
        }else if(score <= 89 && 80 <= score){
            System.out.println("B");
        }else if(score <= 79 && 70 <= score){
            System.out.println("C");
        }else if(score <= 69 && 60 <= score){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
