public class leedcode {
    class Solution {
        public int minimizedMaximum(int n, int[] quantities) {
            int s = 1;
            int e = 0;
            for(int prod: quantities) {
                e = Math.max(prod, e);
            }
    
            while(s < e) {
                int guessedProductQty = s + (e-s)/2;
                if(possibleToDistribute(quantities, guessedProductQty, n)) {
                    e = guessedProductQty;
                } else {
                    s = guessedProductQty+1;
                }
            }
            return s;
        }
    
        private static boolean possibleToDistribute(int[] quantities, int guessedProductQty, int n) {
            int totalStores = 0;
            for(int quantity: quantities) {
               totalStores += (quantity + guessedProductQty -1)/guessedProductQty;
            //    totalStores += Math.ceil(quantity*1.0/guessedProductQty*1.0);
            } 
            return totalStores <= n;
        }
    }
    
}
