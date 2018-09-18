class removeVowel{
    public String[] removeVowels(String words[]){
        String [] result=new String[words.length];
        for(int i=0;i<words.length;i++)
        {
            result[i]="";
            for (int j=0;j<words[i].length();j++)
            {
                if(!(((int)words[i].charAt(j)>=97)&&(words[i].charAt(j)=='a'||words[i].charAt(j)=='e'||words[i].charAt(j)=='i'||words[i].charAt(j)=='o'||words[i].charAt(j)=='u')))
                {
                    result[i]+=words[i].charAt(j);
                }

            }
        }
        return result;
    }
}