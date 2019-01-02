public class HanoiTower {
    static void hanoiTower(int n,String left,String middle,String right) {
        if(n==1) { System.out.println("Disk:"+n+" "+left + "->" + right);
        } else {
            hanoiTower(n - 1, left,right ,middle);
            System.out.println("Disk:"+n+" "+left + "->" + right);
            hanoiTower(n - 1, middle, left, right);
        }
    }

            public static void main(String[] args) {

        hanoiTower(3,"left","mid","right");
    }
}