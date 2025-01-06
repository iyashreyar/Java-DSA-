
//return all the combinations whose sum is equals to the target in an arraylist

import java.util.ArrayList;
public class DuceQuesAL {
    public static void main(String[] args) {
        System.out.println(dice("", 3));
    }
    static ArrayList<String> dice(String p, int target){
        ArrayList<String> ans = new ArrayList<>();
        if (target == 0){
            ans.add(p);
            return ans;
        }
        for (int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(dice(p+i, target-i));
        }
        return ans;
    }
}
