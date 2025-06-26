import java.util.*;;

public class ThreeActivities{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Pair> a = new ArrayList<>();
            ArrayList<Pair> b = new ArrayList<>();
            ArrayList<Pair> c = new ArrayList<>();


            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                a.add(new Pair(val, i));
            }
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                b.add(new Pair(val, i));
            }
            for(int i=0;i<n;i++){
                int val = sc.nextInt();
                c.add(new Pair(val, i));
            }
            Collections.sort(a,(p,q)->q.first-p.first);
            Collections.sort(b,(p,q)->q.first-p.first);
            Collections.sort(c,(p,q)->q.first-p.first);
            int ans = 0;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){
                        if(a.get(i).second!=b.get(j).second && b.get(j).second!=c.get(k).second && a.get(i).second != c.get(k).second){
                            ans = Math.max(ans, a.get(i).first+b.get(j).first+c.get(k).first);
                        }
                    }
                }
            }
                System.out.println(ans);
        }
    }

    
}

class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}