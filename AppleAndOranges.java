class AppleAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        
        int countApple=0;
        int countOrange=0;
     for(int i = 0; i < apples.size(); i++){
         if(apples.get(i) + a >= s && apples.get(i) + a <= t ){
             countApple++;
         }  
     }
     for(int i = 0; i < oranges.size(); i++){
         if(oranges.get(i) + b >=s && oranges.get(i) + b <=t){
             countOrange++;
         }
     }
     System.out.println(countApple+"\n"+countOrange);
}
}