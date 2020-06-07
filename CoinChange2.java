class CoinChange2 {
    public int change(int amount, int[] coins) {
        int[] table = new int[amount+1];
        table[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                table[j]+=table[j-coins[i]];
            }
        }
        return table[amount];
    }
}
