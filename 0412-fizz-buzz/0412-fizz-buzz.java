class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>lst=new ArrayList<>();
        int i=1;
        while(i<=n){
        if(i%3==0 && i%5==0){
            lst.add("FizzBuzz");
        }
        else if(i%3==0){
            lst.add("Fizz");
        }
        else if(i%5==0){
            lst.add("Buzz");
        }
        else{
            lst.add(String.valueOf(i));
        }
        i++;
        }
        return lst;
    }
}