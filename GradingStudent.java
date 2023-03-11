class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List newList = new ArrayList<>();
     
     for(int i = 0; i < grades.size(); i++){
         int number = ((grades.get(i)/5)+1)*5;
         
         if (grades.get(i) < 38){
             newList.add(grades.get(i));
             
        } else if(number - grades.get(i) < 3){
                 newList.add(number);
             } else {
                 newList.add(grades.get(i));
             }
     }
     return newList;
    }
}