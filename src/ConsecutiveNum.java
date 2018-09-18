class ConsecutiveNum{
    public boolean ConsecutiveNumCheck(String number){
        String numbers[]=number.split(",");
        int temp=  Integer.parseInt(numbers[0]);
        for(int i=0;i<numbers.length;i++)
        {
            int num=  Integer.parseInt(numbers[i]);
            if(Math.abs((temp-num))!=1)
               return false;
          temp=num;
        }
        return  true;
    }
}