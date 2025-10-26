class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7;      // Number of complete weeks
        int days = n % 7;       // Remaining days after complete weeks
        int total = 0;
        
        // Sum for complete weeks
        // For week 0 → start=1, week 1 → start=2, etc.
        for (int i = 0; i < weeks; i++) {
            total += 7 * (1 + i) + 21; // 21 = 0+1+2+3+4+5+6
        }
        
        // Sum for remaining days
        for (int i = 0; i < days; i++) {
            total += (weeks + 1) + i;
        }
        
        return total;
    }
}
