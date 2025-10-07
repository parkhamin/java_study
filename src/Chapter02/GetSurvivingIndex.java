package Chapter02;

import java.util.ArrayList;

public class GetSurvivingIndex {
    public static int getSurvivingIndex(int n, int k){
        ArrayList<Integer> soldiers = new ArrayList<>();

        for (int i=1; i<= n; i++){
            soldiers.add(i);
        }

        int killIndex = 0;
        while(soldiers.size() > 1){
            int removeIndex = (killIndex + k - 1) % soldiers.size();
            System.out.println(soldiers.get(removeIndex) + "번 군사가 죽습니다.");
            soldiers.remove(removeIndex);
            killIndex = removeIndex;
        }

        return soldiers.get(0);
    }

    public static void main(String[] args){
        System.out.println("김신은" + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
