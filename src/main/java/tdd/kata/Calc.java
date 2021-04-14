package tdd.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    public Integer sum(String s){
        try {
            Pattern pattern = Pattern.compile("^$|\\d+|-\\d+");
            Matcher matcher = pattern.matcher(s);
            int count = 0;
            int sum=0;
            if (!validate(s)) return -1;
            while (matcher.find()) {
                count++;
                if(count>2)return  -1;
                Integer sumPart= matcher.group().isEmpty()?0:Integer.valueOf(matcher.group());

                sum=sum+sumPart;

            }
            if (count==0){return -1;}
            return sum;
        }catch (Throwable e){
            return -1;
        }
    }

    private boolean validate (String sd ){
        Pattern pattern = Pattern.compile("^-?[0-9]\\d*(,-?\\d+)?$|^$");
        Matcher matcher = pattern.matcher(sd);
        return  matcher.find();
    }
}
