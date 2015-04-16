/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress;

import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Lesnyman
 */
public class Solution {

    /**
     * @param args the command line arguments
     */
    public ArrayList<Integer> data = new ArrayList();

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         ArrayList<Integer> l = new ArrayList();
         for (int i = 0; i < n; i++) {
         l.add(sc.nextInt());
         }
         int first = l.get(0);
         int last = l.get(l.size() - 1);
         int diff = (last - first) / n;*/
        Solution s = new Solution();
        s.testData(2, 2, 8, 6);
        s.findMissing();
        s.data.removeAll(s.data);
        
        s.testData(-2, 3, 10, 1);
        s.findMissing();
        s.data.removeAll(s.data);
        
        s.testData(-8, -2, -16, -12);
        s.findMissing();
        s.data.removeAll(s.data);
        
        s.testData(8, -4, -16, -8);
        s.findMissing();
        s.data.removeAll(s.data);
    }

    public void testData(int start, int step, int end, int missing) {
        this.data.add(start);
        //System.out.print(start+" ");
        for (int i = start + step; abs(i) <= abs(end); i = i + step) {
            if (i == missing) {
                continue;
            }
            this.data.add(i);
            //System.out.print(i+" ");
        }
    }
    public void findMissing(){
        int first = this.data.get(0);
        int last = this.data.get(this.data.size() - 1);
        int diff = (last - first) / (this.data.size());
        int tmp = first;
        for (int i = 0; i < this.data.size(); i++) {
            tmp = first + (i*diff);
            if (this.data.get(i) != tmp){
                System.out.println("missing="+(this.data.get(i-1)+diff));
                break;
            } 
        }
    }
}

